/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Async;

import BD.InterfazBD;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fawques
 */
public class AsyncManager {
    InterfazBD bd;

    public AsyncManager(String database) {
        try {
            bd = new InterfazBD(database);
        } catch (SQLException ex) {
            Logger.getLogger(AsyncManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AsyncManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void guardarAccion(Method method,String[] valores){
        Accion accion = new Accion(method,valores);
        String partes[] = accion.toString().split(":__:");
        String accionYParams = partes[0] + ":__:" + partes[1];
        String paramValues = partes[2];
        bd.guardarAccion(accionYParams,paramValues);
    }
    
    public void ejecutarAcciones(){
    	ArrayList<Accion> listaAcciones= getAccionesYBorra();
        for (Accion accion : listaAcciones) {
            accion.invocar();
        }        
    }
    
    public ArrayList<Accion> getAcciones(){
    	ResultSet acciones = bd.getAcciones();
        return procesarAcciones(acciones);
    }
    
    private ArrayList<Accion> getAccionesYBorra(){
    	ResultSet acciones = bd.getAccionesYBorra();
    	return procesarAcciones(acciones);
    }
    
    private ArrayList<Accion> procesarAcciones(ResultSet acciones){
    	ArrayList<Accion> listaAcciones = new ArrayList<>();
        try {
			while(acciones.next()){
			    String resultAccion = acciones.getString("accion");
			    String partes[] = resultAccion.split(":__:");
			    String name = partes[0];
			    String paramTypes = partes[1];
			    String stringTypes[] = paramTypes.split("\\|");
			    Class<?>[] types = new Class<?>[stringTypes.length];
			    
			    for (int i = 0; i < stringTypes.length; i++) {
			        types[i] = Class.forName(stringTypes[i]);
			    }
			    String resultParams = acciones.getString("params");
			    
			    Accion nuevo = new Accion(name, types, resultParams.split("\\|"));
			    listaAcciones.add(nuevo);
			    
			}
			
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(AsyncManager.class.getName()).log(Level.SEVERE, null, ex);
		} catch (SQLException ex) {
			Logger.getLogger(AsyncManager.class.getName()).log(Level.SEVERE, null, ex);
		}
		return listaAcciones;
    }
}
