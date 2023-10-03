<!DOCTYPE html>
<html lang="en">
    <head>

        <meta name="keywords" content="florist,flower,cake,weddings,decoration,beverage" />
        <title>Login & Register | Hana's Garden</title>
        <link href="../nav-footer_styles.css" rel="stylesheet" type="text/css" />
        <link href="login.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link href="https://unpkg.com/ionicons@4.5.10-0/dist/css/ionicons.min.css" rel="stylesheet" type="text/css" />
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    </head>
    <body>
        <header>
            <nav class="main">
                <div class="logo">
                    <a href="../home/home.html"><img src="../Hana's Garden Logo.png"></a>
                </div>

                <div class="main-icons">
                    <i class="icon ion-md-menu"></i>
                    <i class="icon ion-md-close"></i>
                </div>

                <ul class="nav-list">
                    <li>
                        <a href="../Products/products.html">Products
                            <i class="icon ion-md-arrow-dropdown"></i>
                        </a>
                        <ul class="sub-nav-list">
                            <li><a href="../Flower/flowers.html">Flowers</a></li>
                            <br>
                            <li><a href="../Food&Beverage/food&beverage.html">Food & Beverage</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="../About Us/about-us.html">About Us</a>
                    </li>
                    <li>
                        <a>Occasional Promotions
                            <i class="icon ion-md-arrow-dropdown"></i>
                        </a>
                    
                        <ul class="sub-nav-list">
                            <li><a href="../Everyday/everyday.html">Everyday</a></li>
                            <br>
                            <li><a href="../Love/love.html">Love</a></li>
                            <br>
                            <li><a href="../Season/season.html">Seasonal</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="../Services/services.html">Services
                            <i class="icon ion-md-arrow-dropdown"></i>
                        </a>
                        <ul class="sub-nav-list">
                            <li><a href="../Events/events.html">Event</a></li>
                            <br>
                            <li><a href="../Weddings/weddings.html">Wedding</a></li>
                            <br>
                            <li><a href="../Decoration/decoration.html">Decoration</a></li>
                        </ul>
                    </li>                    
                    <li>
                        <a>Workshops & Activities
                            <i class="icon ion-md-arrow-dropdown"></i>
                        </a>
                    
                        <ul class="sub-nav-list">
                            <li><a href="../workshops/workshops.html">Workshops</a></li>
                            <br>
                            <li><a href="../activities/activities.html">Activities</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="../vacancy/vacancy.html">Vacancy</a>
                    </li>
                    <li>
                        <a href="../Contact Us/contact us.html">Contact us</a>
                    </li>
                </ul>
            </nav>
            <a href="../order/order.html"><img src="../shopping-cart-icon.png" alt="cart" width="40px" style="position: fixed; z-index: 100; top: 32px; right: 110px; opacity: 0.4;"></a>
            <a href="../Login/login.html"><img src="../login.png" alt="login" width="40px" style="position: fixed; z-index: 100; top: 30px; right: 40px; opacity: 0.4;"></a>
        </header>

        <div class="flower">
            <div class="form-box">
                <div class="button-box">
                    <div id="btn"></div>
                    <button type="button" class="tonggle-btn" onclick=login()>Login</button>
                    <button type="button" class="tonggle-btn" onclick=register()>Register</button>
                </div>

                <form id="login" class="input-group" action="../login">
                    
                    <input type="text" class="input-field" placeholder="Email / Username" name="name" required>
                    <input id="password" type="password" class="input-field" placeholder="Enter Password" name="password" required>
                    <h4><a href="forgot.html" >Forgot Your Password?</a></h4>
                    <p> <input type="checkbox" class="checkbox"><span class="login">Remember Password</span></p>
                    <button type="submit" class="submit">Login</button>

                    
                    
                </form>
                <form id="register" class="input-group">
                    <input type="text" class="input-field" placeholder="Username" required>
                    <input type="email" class="input-field" placeholder="Email" required>
                    <input id="password" class="input-field" placeholder="Enter Password" required>
                    <input type="checkbox" class="checkbox"><span class="login">I agree to the Terms and Condition</span>
                    <button type="submit" class="submit">Register</button>
                </form>
            </div>
        </div>

        <script>
            var x= document.getElementById("login");
            var y= document.getElementById("register");
            var z= document.getElementById("btn");

            function login(){
                x.style.left= "50px";
                y.style.left= "450px";
                z.style.left= "0px";
            }

            function register(){
                x.style.left= "-400px";
                y.style.left= "50px";
                z.style.left= "110px";
            }
        </script>


<footer>
    <div class="footer">
        <div class="footer-content">
            <div class="footer-section about">
                <h1><span>HANA'S GARDEN</span></h1>
                <br>
                <p>Malaysia's most popular florist, Hana's Garden is all about creating memories with your loved ones. This is a one stop place for you to find the perfect flower for that moment of happiness.</p>
                <br>
                <div class="contact">
                    <span><i class="fa fa-phone"></i> &nbsp; Phone:<a href="tel:+60123456789"> 012 - 3456789</a></span>
                    <br>
                    <span><i class="fa fa-envelope"></i> &nbsp; Email:<a href="mailto:hanasgarden@gmail.com"> hanasgarden@gmail.com</a></span>
                </div>
                <br>
                <div class="socials">
                    <a href="https://www.facebook.com/bloomthis/"><i class="fa fa-facebook"></i></a>
                    <a href="https://www.instagram.com/bloomthis/"><i class="fa fa-instagram"></i></a>
                    <a href="https://twitter.com/floristmagazine?lang=en"><i class="fa fa-twitter"></i></a>
                    <a href="https://www.youtube.com/channel/UCbJINtwDRB-0lvaqJFH7L_g"><i class="fa fa-youtube"></i></a>
                </div>
            </div>
            <div class="footer-section info">
                <h2>Information</h2>
                <br>
                <ul>
                    <a href="https://www.flowerchimp.com/pages/faq"><li>FAQs</li></a>
                    <a href="../vacancy/vacancy.html"><li>Vacancy</li></a>
                    <a href="https://www.flowerchimp.com/pages/terms-conditions"><li>Terms & Conditions</li></a>
                    <a href="https://www.flowerchimp.com/pages/privacy-policy"><li>Privacy Policy</li></a>
                </ul>
            </div>
            <div class="footer-section newsletter">
                <h2>Newsletter</h2>
                <br>
                <p>Sign up to be kept up to date with our latest offer and exclusive deals and stand a chance to get 10% off your first order.</p>
                <br>
                <form action="home.html" method="post">
                    <input type="email" name="email" id="email" class="newsletter-input" placeholder="Enter your email address">
                    <br>
                    <input type="submit" class="subcribe-button" value="SUBCRIBE">
                </form>
            </div>
        </div>

        <div class="footer-bottom">
            &copy; 2020 Hana's Garden | hanasgarden.com | Designed by Hana
        </div>
    </div>
</footer>
    </body>
        
</html>