package com.awaken.web;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.server.ssl.SslSocketConnector;
import org.eclipse.jetty.util.ssl.SslContextFactory;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author Finn Zhao
 * @version 2017年4月16日
 */
public class JettyLauncher {

    /**
     * @param args args
     * @throws Exception exception
     */
    public static void main(String[] args) throws Exception {

        Server server = new Server(8080);

        // SocketConnector connector = new SocketConnector();
        // connector.setPort(8080);

        // server.addConnector(connector);

        // 创建自签名的证书时，注意加密方式，一般都指定为RSA。
        // 未指定加密方式时，默认用的是DSA，Client端不一定支持。
        SslSocketConnector sslSocketConnector = new SslSocketConnector();
        sslSocketConnector.setPort(8443);
        SslContextFactory sslContextFactory = sslSocketConnector.getSslContextFactory();
        sslContextFactory.setKeyStorePath("./web/src/main/etc/ssl/priv.jks");
        sslContextFactory.setKeyStorePassword("privilege");
        sslContextFactory.setKeyManagerPassword("rootsa");
        // sslContextFactory.setKeyStoreType("jks");
        // sslContextFactory.setCertAlias("root");
        /*
        sslContextFactory.setIncludeCipherSuites(new String[]{
                "SSL_RSA_WITH_RC4_128_MD5"
                , "SSL_RSA_WITH_RC4_128_SHA"
                , "TLS_RSA_WITH_AES_128_CBC_SHA"
                , "TLS_RSA_WITH_AES_256_CBC_SHA"
                , "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"
                , "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"
                , "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"
                , "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"
                , "SSL_RSA_WITH_3DES_EDE_CBC_SHA"
                , "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"
                , "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"
                , "SSL_RSA_WITH_DES_CBC_SHA"
                , "SSL_DHE_RSA_WITH_DES_CBC_SHA"
                , "SSL_DHE_DSS_WITH_DES_CBC_SHA"
                , "SSL_RSA_EXPORT_WITH_RC4_40_MD5"
                , "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"
                , "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"
                , "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"
                , "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"
        });
        sslContextFactory.setNeedClientAuth(false);
        sslContextFactory.setWantClientAuth(false);
        sslContextFactory.setTrustAll(true);
        sslContextFactory.setValidateCerts(false);
        sslContextFactory.setValidatePeerCerts(false);
        sslContextFactory.setAllowRenegotiate(false);*/

        server.addConnector(sslSocketConnector);

        WebAppContext webAppContext = new WebAppContext();
        // String resource = "./src/main/webapp";
        String resource = "./web/src/main/webapp";
        webAppContext.setDescriptor(resource + "/WEB-INF/web.xml");
        webAppContext.setResourceBase(resource);
        webAppContext.setClassLoader(Thread.currentThread().getContextClassLoader());
        webAppContext.setContextPath("/b-p-web");
        webAppContext.setParentLoaderPriority(true);

        server.setHandler(webAppContext);

        server.start();

        server.join();

    }

}
