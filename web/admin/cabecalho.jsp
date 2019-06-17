<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale = 1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="shortcout icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="shortcout icon" href="images/favicon.png">
    <title>Wiki Heroes</title>

    <!-- Seo -->

    <!-- MAIN SEO -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <META NAME="Googlebot" CONTENT="index,follow">
    <META NAME="robots" CONTENT="index,follow">
    <META NAME="Identifier-URL" CONTENT="http://www.evolveme.">
    <META NAME="url" CONTENT="http://www.">
    <META NAME="Language" CONTENT="PT-BR">
    <META NAME="content-language" CONTENT="pt-br">
    <META NAME="distribution" CONTENT="Global">
    <META NAME="coverage" CONTENT="Worldwide">
    <META NAME="Author" CONTENT="Vitor Régis de Ramos - Front-End Developer">
    <META NAME="Generator" CONTENT="">
    <meta name="description" content="" />

    <!-- SOCIAL METAS -->
    <meta property="og:title" content="European Travel Destinations">
    <meta property="og:description" content="Offering tour packages for individuals or groups.">
    <meta property="og:image" content="http://euro-travel-example.com/thumbnail.jpg">
    <meta property="og:url" content="http://euro-travel-example.com/index.htm">
    <meta property="og:type" content="website" />
    <meta name="twitter:card" content="summary_large_image">
    <meta property="og:site_name" content="European Travel, Inc.">
    <meta name="twitter:image:alt" content="Alt text for image">
    <meta property="fb:app_id" content="your_app_id" />
    <meta name="twitter:site" content="@website-username">

    <script type="application/x-javascript">
        addEventListener("load", function () {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>

    <!-- CSS FILES -->
    <script src="../vendor/jquery/jquery-3.3.1.min.js" defer></script>
    <script src="../vendor/bootstrap/bootstrap.min.js" defer></script>
    <script src="../vendor/isotope-layout/dist/isotope.pkgd.min.js" defer></script>
    <script src="../vendor/lazyload/lazyload.js" defer></script>
    <script src="../vendor/lightbox2/dist/js/lightbox.min.js" defer></script>
    <script src="../vendor/owl.carousel/owl.carousel.min.js" defer></script>
    <script src="../vendor/wowjs/dist/wow.min.js" defer></script>
    <script src="../js/main.min.js" defer></script>
    <script src="../js/webp.js" defer></script>
    <script src="../js/jquery.mask.min.js" defer></script>

    <link rel="stylesheet" href="../vendor/animate.css/animate.min.css">
    <link rel="stylesheet" href="../vendor/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="../vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../vendor/jquery/jquery-ui.css">
    <link rel="stylesheet" href="../vendor/lightbox2/dist/css/lightbox.min.css">
    <link rel="stylesheet" href="../vendor/owl.carousel/owl.carousel.min.css">
    <link rel="stylesheet" href="../css/main.min.css">
    <link href="https://fonts.googleapis.com/css?family=Poppins:200, 300,400,600,700" rel="stylesheet">
</head>
<body class="scrollbar-inner wow fadeIn">
    <header id="main-header">
        <nav id="main-nav" class="navbar navbar-expand-lg fixed-top">
            <div class="container">
                <a href="../admin/ClienteWS"><div class="navbar-brand wow fadeInLeft"><span class="logo">WikiHeroes</span></div></a>
                <button class="navbar-toggler wow bounceInDown" type="button" data-toggle="collapse"
                    data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                    aria-label="Toggle navigation">
                    <span></span>
                    <span></span>
                    <span></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNav">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item wowNonMobile fadeInDown" data-wow-delay="0.6s">
                            <a class="nav-link active" href="../admin/ClienteWS">Clientes</a>
                            <a class="nav-link active" href="../admin/GibiWS">Gibis</a>
                            <a class="nav-link active" href="../heroi/HeroiWS">Heróis</a>
                            <a class="nav-link" href="../liga/LigaWS">Ligas</a>
                            <a class="nav-link" href="../principal/LogarWS?txtAcao=logout" style="color: red;">Sair</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>