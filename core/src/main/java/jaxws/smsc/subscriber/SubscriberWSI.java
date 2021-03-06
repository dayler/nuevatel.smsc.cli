
package jaxws.smsc.subscriber;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "SubscriberWSI", targetNamespace = "http://wsi.mc.nuevatel.com/", wsdlLocation = "/WEB-INF/wsdl/wsi_subscriber.wsdl")
public class SubscriberWSI
    extends Service
{

    private final static URL SUBSCRIBERWSI_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(jaxws.smsc.subscriber.SubscriberWSI.class.getName());

    static {
        URL url = SubscriberWSI.class.getResource("/WEB-INF/wsdl/wsi_subscriber.wsdl");
        SUBSCRIBERWSI_WSDL_LOCATION = url;
    }

    public SubscriberWSI() {
        super(SUBSCRIBERWSI_WSDL_LOCATION, new QName("http://wsi.mc.nuevatel.com/", "SubscriberWSI"));
    }

    /**
     * 
     * @return
     *     returns SubscriberWSIPort
     */
    @WebEndpoint(name = "SubscriberWSIPort")
    public SubscriberWSIPort getSubscriberWSIPort() {
        return super.getPort(new QName("http://wsi.mc.nuevatel.com/", "SubscriberWSIPort"), SubscriberWSIPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SubscriberWSIPort
     */
    @WebEndpoint(name = "SubscriberWSIPort")
    public SubscriberWSIPort getSubscriberWSIPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://wsi.mc.nuevatel.com/", "SubscriberWSIPort"), SubscriberWSIPort.class, features);
    }

}
