﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Este código fue generado por una herramienta.
//     Versión de runtime:4.0.30319.34003
//
//     Los cambios en este archivo podrían causar un comportamiento incorrecto y se perderán si
//     se vuelve a generar el código.
// </auto-generated>
//------------------------------------------------------------------------------

// 
// Este código fuente fue generado automáticamente por xsd, Versión=4.0.30319.18020.
// 
namespace org.apache.juddi.v3.client.config {
    using System.Xml.Serialization;
    
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    [System.Xml.Serialization.XmlRootAttribute(Namespace="urn:juddi-apache-org:v3_client", IsNullable=false)]
    public partial class uddi {
        
        private short reloadDelayField;
        
        private uddiClient clientField;
        
        /// <comentarios/>
        public short reloadDelay {
            get {
                return this.reloadDelayField;
            }
            set {
                this.reloadDelayField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClient client {
            get {
                return this.clientField;
            }
            set {
                this.clientField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClient {
        
        private uddiClientNode[] nodesField;
        
        private uddiClientClerks clerksField;
        
        private uddiClientSignature signatureField;
        
        private uddiClientSubscriptionCallbacks subscriptionCallbacksField;
        
        private uddiClientXtoWsdl xtoWsdlField;
        
        private string nameField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlArrayItemAttribute("node", IsNullable=false)]
        public uddiClientNode[] nodes {
            get {
                return this.nodesField;
            }
            set {
                this.nodesField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientClerks clerks {
            get {
                return this.clerksField;
            }
            set {
                this.clerksField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientSignature signature {
            get {
                return this.signatureField;
            }
            set {
                this.signatureField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientSubscriptionCallbacks subscriptionCallbacks {
            get {
                return this.subscriptionCallbacksField;
            }
            set {
                this.subscriptionCallbacksField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientXtoWsdl XtoWsdl {
            get {
                return this.xtoWsdlField;
            }
            set {
                this.xtoWsdlField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientNode {
        
        private string nameField;
        
        private string descriptionField;
        
        private uddiClientNodeProperty[] propertiesField;
        
        private string proxyTransportField;
        
        private string custodyTransferUrlField;
        
        private string inquiryUrlField;
        
        private string inquiryRESTUrlField;
        
        private string publishUrlField;
        
        private string securityUrlField;
        
        private string subscriptionUrlField;
        
        private string subscriptionListenerUrlField;
        
        private string juddiApiUrlField;
        
        private string factoryInitialField;
        
        private string factoryURLPkgsField;
        
        private string factoryNamingProviderField;
        
        private bool isHomeJUDDIField;
        
        private bool isHomeJUDDIFieldSpecified;
        
        /// <comentarios/>
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
        
        /// <comentarios/>
        public string description {
            get {
                return this.descriptionField;
            }
            set {
                this.descriptionField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlArrayItemAttribute("property", IsNullable=false)]
        public uddiClientNodeProperty[] properties {
            get {
                return this.propertiesField;
            }
            set {
                this.propertiesField = value;
            }
        }
        
        /// <comentarios/>
        public string proxyTransport {
            get {
                return this.proxyTransportField;
            }
            set {
                this.proxyTransportField = value;
            }
        }
        
        /// <comentarios/>
        public string custodyTransferUrl {
            get {
                return this.custodyTransferUrlField;
            }
            set {
                this.custodyTransferUrlField = value;
            }
        }
        
        /// <comentarios/>
        public string inquiryUrl {
            get {
                return this.inquiryUrlField;
            }
            set {
                this.inquiryUrlField = value;
            }
        }
        
        /// <comentarios/>
        public string inquiryRESTUrl {
            get {
                return this.inquiryRESTUrlField;
            }
            set {
                this.inquiryRESTUrlField = value;
            }
        }
        
        /// <comentarios/>
        public string publishUrl {
            get {
                return this.publishUrlField;
            }
            set {
                this.publishUrlField = value;
            }
        }
        
        /// <comentarios/>
        public string securityUrl {
            get {
                return this.securityUrlField;
            }
            set {
                this.securityUrlField = value;
            }
        }
        
        /// <comentarios/>
        public string subscriptionUrl {
            get {
                return this.subscriptionUrlField;
            }
            set {
                this.subscriptionUrlField = value;
            }
        }
        
        /// <comentarios/>
        public string subscriptionListenerUrl {
            get {
                return this.subscriptionListenerUrlField;
            }
            set {
                this.subscriptionListenerUrlField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string juddiApiUrl {
            get {
                return this.juddiApiUrlField;
            }
            set {
                this.juddiApiUrlField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string factoryInitial {
            get {
                return this.factoryInitialField;
            }
            set {
                this.factoryInitialField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string factoryURLPkgs {
            get {
                return this.factoryURLPkgsField;
            }
            set {
                this.factoryURLPkgsField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute(IsNullable=true)]
        public string factoryNamingProvider {
            get {
                return this.factoryNamingProviderField;
            }
            set {
                this.factoryNamingProviderField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public bool isHomeJUDDI {
            get {
                return this.isHomeJUDDIField;
            }
            set {
                this.isHomeJUDDIField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool isHomeJUDDISpecified {
            get {
                return this.isHomeJUDDIFieldSpecified;
            }
            set {
                this.isHomeJUDDIFieldSpecified = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientNodeProperty {
        
        private string nameField;
        
        private string valueField;
        
        private string valueField1;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField1;
            }
            set {
                this.valueField1 = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(Namespace="urn:juddi-apache-org:v3_client")]
    public partial class wsdl {
        
        private string businessKeyField;
        
        private string businessNameField;
        
        private string keyDomainField;
        
        private string valueField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string businessKey {
            get {
                return this.businessKeyField;
            }
            set {
                this.businessKeyField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string businessName {
            get {
                return this.businessNameField;
            }
            set {
                this.businessNameField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string keyDomain {
            get {
                return this.keyDomainField;
            }
            set {
                this.keyDomainField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientClerks {
        
        private uddiClientClerksClerk[] clerkField;
        
        private uddiClientClerksXregister xregisterField;
        
        private bool registerOnStartupField;
        
        private bool registerOnStartupFieldSpecified;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute("clerk")]
        public uddiClientClerksClerk[] clerk {
            get {
                return this.clerkField;
            }
            set {
                this.clerkField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientClerksXregister xregister {
            get {
                return this.xregisterField;
            }
            set {
                this.xregisterField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public bool registerOnStartup {
            get {
                return this.registerOnStartupField;
            }
            set {
                this.registerOnStartupField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlIgnoreAttribute()]
        public bool registerOnStartupSpecified {
            get {
                return this.registerOnStartupFieldSpecified;
            }
            set {
                this.registerOnStartupFieldSpecified = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientClerksClerk {
        
        private wsdl[] wsdlField;
        
        private string[] classField;
        
        private string nameField;
        
        private string nodeField;
        
        private string publisherField;
        
        private string passwordField;
        
        private bool isPasswordEncryptedField;
        
        private string cryptoProviderField;
        
        private string businessKeyField;
        
        private string businessNameField;
        
        private string keyDomainField;
        
        public uddiClientClerksClerk() {
            this.isPasswordEncryptedField = false;
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute("wsdl", IsNullable=true)]
        public wsdl[] wsdl {
            get {
                return this.wsdlField;
            }
            set {
                this.wsdlField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute("class", IsNullable=true)]
        public string[] @class {
            get {
                return this.classField;
            }
            set {
                this.classField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string name {
            get {
                return this.nameField;
            }
            set {
                this.nameField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string node {
            get {
                return this.nodeField;
            }
            set {
                this.nodeField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string publisher {
            get {
                return this.publisherField;
            }
            set {
                this.publisherField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string password {
            get {
                return this.passwordField;
            }
            set {
                this.passwordField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        [System.ComponentModel.DefaultValueAttribute(false)]
        public bool isPasswordEncrypted {
            get {
                return this.isPasswordEncryptedField;
            }
            set {
                this.isPasswordEncryptedField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string cryptoProvider {
            get {
                return this.cryptoProviderField;
            }
            set {
                this.cryptoProviderField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string businessKey {
            get {
                return this.businessKeyField;
            }
            set {
                this.businessKeyField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string businessName {
            get {
                return this.businessNameField;
            }
            set {
                this.businessNameField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string keyDomain {
            get {
                return this.keyDomainField;
            }
            set {
                this.keyDomainField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientClerksXregister {
        
        private uddiClientClerksXregisterServicebinding[] servicebindingField;
        
        private uddiClientClerksXregisterBusiness[] businessField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute("servicebinding", IsNullable=true)]
        public uddiClientClerksXregisterServicebinding[] servicebinding {
            get {
                return this.servicebindingField;
            }
            set {
                this.servicebindingField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlElementAttribute("business", IsNullable=true)]
        public uddiClientClerksXregisterBusiness[] business {
            get {
                return this.businessField;
            }
            set {
                this.businessField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientClerksXregisterServicebinding {
        
        private string bindingKeyField;
        
        private string fromClerkField;
        
        private string toClerkField;
        
        private string valueField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string bindingKey {
            get {
                return this.bindingKeyField;
            }
            set {
                this.bindingKeyField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string fromClerk {
            get {
                return this.fromClerkField;
            }
            set {
                this.fromClerkField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string toClerk {
            get {
                return this.toClerkField;
            }
            set {
                this.toClerkField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientClerksXregisterBusiness {
        
        private string bindingKeyField;
        
        private string fromClerkField;
        
        private string toClerkField;
        
        private string valueField;
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string bindingKey {
            get {
                return this.bindingKeyField;
            }
            set {
                this.bindingKeyField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string fromClerk {
            get {
                return this.fromClerkField;
            }
            set {
                this.fromClerkField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string toClerk {
            get {
                return this.toClerkField;
            }
            set {
                this.toClerkField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientSignature {
        
        private string signingKeyStorePathField;
        
        private string signingKeyStoreTypeField;
        
        private uddiClientSignatureSigningKeyStoreFilePassword signingKeyStoreFilePasswordField;
        
        private uddiClientSignatureSigningKeyPassword signingKeyPasswordField;
        
        private string signingKeyAliasField;
        
        private string canonicalizationMethodField;
        
        private string signatureMethodField;
        
        private string xML_DIGSIG_NSField;
        
        private string trustStorePathField;
        
        private string trustStoreTypeField;
        
        private uddiClientSignatureTrustStorePassword trustStorePasswordField;
        
        private bool checkTimestampsField;
        
        private bool checkTrustField;
        
        private bool checkRevocationCRLField;
        
        private bool checkRevocationOCSPField;
        
        private bool keyInfoInclusionSubjectDNField;
        
        private bool keyInfoInclusionSerialField;
        
        private bool keyInfoInclusionBase64PublicKeyField;
        
        private string digestMethodField;
        
        public uddiClientSignature() {
            this.canonicalizationMethodField = "http://www.w3.org/2001/10/xml-exc-c14n#";
            this.signatureMethodField = "http://www.w3.org/2000/09/xmldsig#rsa-sha1";
            this.xML_DIGSIG_NSField = "http://www.w3.org/2000/09/xmldsig#";
            this.checkTimestampsField = true;
            this.checkTrustField = true;
            this.checkRevocationCRLField = false;
            this.checkRevocationOCSPField = false;
            this.keyInfoInclusionSubjectDNField = false;
            this.keyInfoInclusionSerialField = false;
            this.keyInfoInclusionBase64PublicKeyField = false;
            this.digestMethodField = "http://www.w3.org/2000/09/xmldsig#sha1";
        }
        
        /// <comentarios/>
        public string signingKeyStorePath {
            get {
                return this.signingKeyStorePathField;
            }
            set {
                this.signingKeyStorePathField = value;
            }
        }
        
        /// <comentarios/>
        public string signingKeyStoreType {
            get {
                return this.signingKeyStoreTypeField;
            }
            set {
                this.signingKeyStoreTypeField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientSignatureSigningKeyStoreFilePassword signingKeyStoreFilePassword {
            get {
                return this.signingKeyStoreFilePasswordField;
            }
            set {
                this.signingKeyStoreFilePasswordField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientSignatureSigningKeyPassword signingKeyPassword {
            get {
                return this.signingKeyPasswordField;
            }
            set {
                this.signingKeyPasswordField = value;
            }
        }
        
        /// <comentarios/>
        public string signingKeyAlias {
            get {
                return this.signingKeyAliasField;
            }
            set {
                this.signingKeyAliasField = value;
            }
        }
        
        /// <comentarios/>
        public string canonicalizationMethod {
            get {
                return this.canonicalizationMethodField;
            }
            set {
                this.canonicalizationMethodField = value;
            }
        }
        
        /// <comentarios/>
        public string signatureMethod {
            get {
                return this.signatureMethodField;
            }
            set {
                this.signatureMethodField = value;
            }
        }
        
        /// <comentarios/>
        public string XML_DIGSIG_NS {
            get {
                return this.xML_DIGSIG_NSField;
            }
            set {
                this.xML_DIGSIG_NSField = value;
            }
        }
        
        /// <comentarios/>
        public string trustStorePath {
            get {
                return this.trustStorePathField;
            }
            set {
                this.trustStorePathField = value;
            }
        }
        
        /// <comentarios/>
        public string trustStoreType {
            get {
                return this.trustStoreTypeField;
            }
            set {
                this.trustStoreTypeField = value;
            }
        }
        
        /// <comentarios/>
        public uddiClientSignatureTrustStorePassword trustStorePassword {
            get {
                return this.trustStorePasswordField;
            }
            set {
                this.trustStorePasswordField = value;
            }
        }
        
        /// <comentarios/>
        public bool checkTimestamps {
            get {
                return this.checkTimestampsField;
            }
            set {
                this.checkTimestampsField = value;
            }
        }
        
        /// <comentarios/>
        public bool checkTrust {
            get {
                return this.checkTrustField;
            }
            set {
                this.checkTrustField = value;
            }
        }
        
        /// <comentarios/>
        public bool checkRevocationCRL {
            get {
                return this.checkRevocationCRLField;
            }
            set {
                this.checkRevocationCRLField = value;
            }
        }
        
        /// <comentarios/>
        public bool checkRevocationOCSP {
            get {
                return this.checkRevocationOCSPField;
            }
            set {
                this.checkRevocationOCSPField = value;
            }
        }
        
        /// <comentarios/>
        public bool keyInfoInclusionSubjectDN {
            get {
                return this.keyInfoInclusionSubjectDNField;
            }
            set {
                this.keyInfoInclusionSubjectDNField = value;
            }
        }
        
        /// <comentarios/>
        public bool keyInfoInclusionSerial {
            get {
                return this.keyInfoInclusionSerialField;
            }
            set {
                this.keyInfoInclusionSerialField = value;
            }
        }
        
        /// <comentarios/>
        public bool keyInfoInclusionBase64PublicKey {
            get {
                return this.keyInfoInclusionBase64PublicKeyField;
            }
            set {
                this.keyInfoInclusionBase64PublicKeyField = value;
            }
        }
        
        /// <comentarios/>
        public string digestMethod {
            get {
                return this.digestMethodField;
            }
            set {
                this.digestMethodField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientSignatureSigningKeyStoreFilePassword {
        
        private bool isPasswordEncryptedField;
        
        private string cryptoProviderField;
        
        private string valueField;
        
        public uddiClientSignatureSigningKeyStoreFilePassword() {
            this.isPasswordEncryptedField = false;
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        [System.ComponentModel.DefaultValueAttribute(false)]
        public bool isPasswordEncrypted {
            get {
                return this.isPasswordEncryptedField;
            }
            set {
                this.isPasswordEncryptedField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string cryptoProvider {
            get {
                return this.cryptoProviderField;
            }
            set {
                this.cryptoProviderField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientSignatureSigningKeyPassword {
        
        private bool isPasswordEncryptedField;
        
        private string cryptoProviderField;
        
        private string valueField;
        
        public uddiClientSignatureSigningKeyPassword() {
            this.isPasswordEncryptedField = false;
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        [System.ComponentModel.DefaultValueAttribute(false)]
        public bool isPasswordEncrypted {
            get {
                return this.isPasswordEncryptedField;
            }
            set {
                this.isPasswordEncryptedField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string cryptoProvider {
            get {
                return this.cryptoProviderField;
            }
            set {
                this.cryptoProviderField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientSignatureTrustStorePassword {
        
        private bool isPasswordEncryptedField;
        
        private string cryptoProviderField;
        
        private string valueField;
        
        public uddiClientSignatureTrustStorePassword() {
            this.isPasswordEncryptedField = false;
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        [System.ComponentModel.DefaultValueAttribute(false)]
        public bool isPasswordEncrypted {
            get {
                return this.isPasswordEncryptedField;
            }
            set {
                this.isPasswordEncryptedField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlAttributeAttribute()]
        public string cryptoProvider {
            get {
                return this.cryptoProviderField;
            }
            set {
                this.cryptoProviderField = value;
            }
        }
        
        /// <comentarios/>
        [System.Xml.Serialization.XmlTextAttribute()]
        public string Value {
            get {
                return this.valueField;
            }
            set {
                this.valueField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientSubscriptionCallbacks {
        
        private string keyDomainField;
        
        private string listenUrlField;
        
        private bool autoRegisterBindingTemplateField;
        
        private string autoRegisterBusinessServiceKeyField;
        
        private string signatureBehaviorField;
        
        /// <comentarios/>
        public string keyDomain {
            get {
                return this.keyDomainField;
            }
            set {
                this.keyDomainField = value;
            }
        }
        
        /// <comentarios/>
        public string listenUrl {
            get {
                return this.listenUrlField;
            }
            set {
                this.listenUrlField = value;
            }
        }
        
        /// <comentarios/>
        public bool autoRegisterBindingTemplate {
            get {
                return this.autoRegisterBindingTemplateField;
            }
            set {
                this.autoRegisterBindingTemplateField = value;
            }
        }
        
        /// <comentarios/>
        public string autoRegisterBusinessServiceKey {
            get {
                return this.autoRegisterBusinessServiceKeyField;
            }
            set {
                this.autoRegisterBusinessServiceKeyField = value;
            }
        }
        
        /// <comentarios/>
        public string signatureBehavior {
            get {
                return this.signatureBehaviorField;
            }
            set {
                this.signatureBehaviorField = value;
            }
        }
    }
    
    /// <comentarios/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("xsd", "4.0.30319.18020")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.XmlTypeAttribute(AnonymousType=true, Namespace="urn:juddi-apache-org:v3_client")]
    public partial class uddiClientXtoWsdl {
        
        private bool ignoreSSLErrorsField;
        
        /// <comentarios/>
        public bool IgnoreSSLErrors {
            get {
                return this.ignoreSSLErrorsField;
            }
            set {
                this.ignoreSSLErrorsField = value;
            }
        }
    }
}
