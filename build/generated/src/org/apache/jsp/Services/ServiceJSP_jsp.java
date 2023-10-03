package org.apache.jsp.Services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import domain.*;
import DA.*;
import java.util.*;

public final class ServiceJSP_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"florist,flower,cake,weddings,decoration,beverage\" />\n");
      out.write("        <title>Flowers | Hana's Garden</title>\n");
      out.write("        <link href=\"../nav-footer_styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"services_styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"card.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>test Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <nav class=\"main\">\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"../home/home.html\"><img src=\"../Hana's Garden Logo.png\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"main-icons\">\n");
      out.write("                    <i class=\"icon ion-md-menu\"></i>\n");
      out.write("                    <i class=\"icon ion-md-close\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"nav-list\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../Products/products.html\">Products\n");
      out.write("                            <i class=\"icon ion-md-arrow-dropdown\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"sub-nav-list\">\n");
      out.write("                            <li><a href=\"../Flower/flowers.html\">Flowers</a></li>\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"../Food&Beverage/food&beverage.html\">Food & Beverage</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../About Us/about-us.html\">About Us</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a>Occasional Promotions\n");
      out.write("                            <i class=\"icon ion-md-arrow-dropdown\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    \n");
      out.write("                        <ul class=\"sub-nav-list\">\n");
      out.write("                            <li><a href=\"../Everyday/everyday.html\">Everyday</a></li>\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"../Love/love.html\">Love</a></li>\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"../Season/season.html\">Seasonal</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../Services/services.html\">Services\n");
      out.write("                            <i class=\"icon ion-md-arrow-dropdown\"></i>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"sub-nav-list\">\n");
      out.write("                            <li><a href=\"../Events/events.html\">Event</a></li>\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"../Weddings/weddings.html\">Wedding</a></li>\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"../Decoration/decoration.html\">Decoration</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>                    \n");
      out.write("                    <li>\n");
      out.write("                        <a>Workshops & Activities\n");
      out.write("                            <i class=\"icon ion-md-arrow-dropdown\"></i>\n");
      out.write("                        </a>\n");
      out.write("                    \n");
      out.write("                        <ul class=\"sub-nav-list\">\n");
      out.write("                            <li><a href=\"../workshops/workshops.html\">Workshops</a></li>\n");
      out.write("                            <br>\n");
      out.write("                            <li><a href=\"../activities/activities.html\">Activities</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../vacancy/vacancy.html\">Vacancy</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../Contact Us/contact us.html\">Contact us</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <a href=\"../order/order.html\"><img src=\"../shopping-cart-icon.png\" alt=\"cart\" width=\"40px\" style=\"position: fixed; z-index: 100; top: 32px; right: 110px; opacity: 0.4;\"></a>\n");
      out.write("            <a href=\"../Login/login.html\"><img src=\"../login.png\" alt=\"login\" width=\"40px\" style=\"position: fixed; z-index: 100; top: 30px; right: 40px; opacity: 0.4;\"></a>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        ");

            ArrayList<Service> serviceRecord = new ArrayList<Service>();
            ServiceDA serviceDa = new ServiceDA();
            
            serviceRecord=serviceDa.retrieveServiceRecord();
            
            Service service=null;
            
            for(int i=0;i<serviceRecord.size();i++){
            service=serviceRecord.get(i);
            String serviceID = service.getServiceID();
            String serviceName = service.getServiceName();
            float servicePrice = service.getServicePrice();
        
      out.write("\n");
      out.write("        <form method=\"post\" action=\"reserveJSP.jsp\">\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        <div clas=\"container\">\n");
      out.write("            <div class=\"card-header my-3\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("            <img class=\"card-img-top\" src=\"wedding.jpg\" alt=\"\"style=\"width:286px;height:180px;\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <h5 class=\"card-title\">");
      out.print(service.getServiceName());
      out.write("</h5>\n");
      out.write("                <p class=\"card-text\">");
      out.print(service.getServiceDesc());
      out.write("</p>\n");
      out.write("                <input type=\"submit\" value=\"Reserve Now\" />\n");
      out.write("                <input type=\"hidden\" name=\"serviceID\" value=\"");
      out.print(service.getServiceID());
      out.write("\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>      \n");
      out.write("        </div>     \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("            <a href=\"addServiceJSP.jsp\">add new service</a>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <footer>\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <div class=\"footer-content\">\n");
      out.write("                    <div class=\"footer-section about\">\n");
      out.write("                        <h1><span>HANA'S GARDEN</span></h1>\n");
      out.write("                        <br>\n");
      out.write("                        <p>Malaysia's most popular florist, Hana's Garden is all about creating memories with your loved ones. This is a one stop place for you to find the perfect flower for that moment of happiness.</p>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"contact\">\n");
      out.write("                            <span><i class=\"fa fa-phone\"></i> &nbsp; Phone:<a href=\"tel:+60123456789\"> 012 - 3456789</a></span>\n");
      out.write("                            <br>\n");
      out.write("                            <span><i class=\"fa fa-envelope\"></i> &nbsp; Email:<a href=\"mailto:hanasgarden@gmail.com\"> hanasgarden@gmail.com</a></span>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"socials\">\n");
      out.write("                            <a href=\"https://www.facebook.com/bloomthis/\"><i class=\"fa fa-facebook\"></i></a>\n");
      out.write("                            <a href=\"https://www.instagram.com/bloomthis/\"><i class=\"fa fa-instagram\"></i></a>\n");
      out.write("                            <a href=\"https://twitter.com/floristmagazine?lang=en\"><i class=\"fa fa-twitter\"></i></a>\n");
      out.write("                            <a href=\"https://www.youtube.com/channel/UCbJINtwDRB-0lvaqJFH7L_g\"><i class=\"fa fa-youtube\"></i></a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-section info\">\n");
      out.write("                        <h2>Information</h2>\n");
      out.write("                        <br>\n");
      out.write("                        <ul>\n");
      out.write("                            <a href=\"https://www.flowerchimp.com/pages/faq\"><li>FAQs</li></a>\n");
      out.write("                            <a href=\"../vacancy/vacancy.html\"><li>Vacancy</li></a>\n");
      out.write("                            <a href=\"https://www.flowerchimp.com/pages/terms-conditions\"><li>Terms & Conditions</li></a>\n");
      out.write("                            <a href=\"https://www.flowerchimp.com/pages/privacy-policy\"><li>Privacy Policy</li></a>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-section newsletter\">\n");
      out.write("                        <h2>Newsletter</h2>\n");
      out.write("                        <br>\n");
      out.write("                        <p>Sign up to be kept up to date with our latest offer and exclusive deals and stand a chance to get 10% off your first order.</p>\n");
      out.write("                        <br>\n");
      out.write("                        <form action=\"home.html\" method=\"post\">\n");
      out.write("                            <input type=\"email\" name=\"email\" id=\"email\" class=\"newsletter-input\" placeholder=\"Enter your email address\">\n");
      out.write("                            <br>\n");
      out.write("                            <input type=\"submit\" class=\"subcribe-button\" value=\"SUBCRIBE\">\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"footer-bottom\">\n");
      out.write("                    &copy; 2020 Hana's Garden | hanasgarden.com | Designed by Hana\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
