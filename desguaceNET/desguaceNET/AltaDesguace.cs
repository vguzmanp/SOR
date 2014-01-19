﻿using desguaceNET.desguaceWS;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace desguaceNET
{
    public partial class AltaDesguace : Form
    {
        public AltaDesguace()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            sor_desguaceDataSet dataSet = new sor_desguaceDataSet();
            sor_desguaceDataSetTableAdapters.desguaceTableAdapter aux = new sor_desguaceDataSetTableAdapters.desguaceTableAdapter();
            aux.Fill(dataSet.desguace);
            System.Data.DataRow[] filas = dataSet.desguace.Select();
            foreach (var item in filas)
            {
                Console.WriteLine("AAA");
                Console.WriteLine(item["email"]);
                Console.WriteLine("AAA");
            }

            DesguaceJavaWSClient client = new desguaceWS.DesguaceJavaWSClient();
            string respuesta = client.checkActivacion(filas[0]["email"].ToString());
            Console.WriteLine(respuesta);

        }
    }
}
