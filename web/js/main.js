(function () {
  'use strict';
  let windowWidth = (window.innerWidth > 0) ? window.innerWidth : screen.width;

  // Navbar stick event
  $(document).on("scroll", function () {
    if ($(document).scrollTop() > 100) {
      $("#main-header").addClass("shrink");
    } else if (!($(".navbar-collapse").hasClass('show'))) {
      $("#main-header").removeClass("shrink");

    }

  });

  // toggles .stick on medium devices when navbar expanded
  $(".navbar-toggler").click(function () {
    if ($(document).scrollTop() < 100) {
      $("#main-header").toggleClass('shrink');
    }
  })

  //close navbar on mobile when clicked
  $('.navbar-nav>li>a').on('click', function () {
    $('.navbar-collapse').collapse('hide');
  });

  //home index animation on scroll
  const areaToGetScrolled = windowWidth > 576 ? 300 : 650;
  $(document).on("scroll", function () {
    if ($(document).scrollTop() > areaToGetScrolled) {
      $("#home").addClass("scrolled");
    } else {
      $("#home").removeClass("scrolled");
    }
  });

  // Works Carousel
  const owlWorkWith = $(".work-with .owl-carousel");
  owlWorkWith.children().each(function (index) {
      $(this).attr("data-position", index)
    }), owlWorkWith.owlCarousel({
      loop: false,
      margin: 0,
      items: 3,
      mouseDrag: false,
      autoplay: false,
      center: true,
      dots: false,
      nav: true,
      navText: ["<i class='owl-nav fa fa-arrow-left'>", "<i class='owl-nav fa fa-arrow-right'>"],
      slideBy: "page",
      dragEndSpeed: 700,
      smartSpeed: 1e3,
      startPosition: 1,
      responsive: {
        0: {
          items: 1
        },
        600: {
          items: 3
        }
      }
    }),

    $(document).on("click", ".work-with .owl-item>div", function () {
      owlWorkWith.trigger("to.owl.carousel", $(this).data("position"))
    }), owlWorkWith.trigger("refresh.owl.carousel");


  // some works carousel

  // Works Carousel
  const owlWorksList = $(".heroes-slider .owl-carousel");
  owlWorksList.children().each(function (index) {
    $(this).attr("data-position", index)
  }), owlWorksList.owlCarousel({
    loop: false,
    margin: 0,
    items: 3,
    mouseDrag: true,
    autoplay: false,
    center: true,
    dots: true,
    nav: false,
    slideBy: "page",
    dragEndSpeed: 700,
    smartSpeed: 1e3,
    startPosition: 2,
    responsive: {
      0: {
        items: 2,
        margin: 30
      },
      600: {
        items: 3
      },
      1210: {
        items: 5,
        margin: 80
      },
    }
  });
  $(document).on("click", ".heroes-slider .owl-item>div", function () {
    owlWorksList.trigger("to.owl.carousel", $(this).data("position"))
  }), owlWorksList.trigger("refresh.owl.carousel");

  // testimonial carousel

  const owlTestimonals = $(".ligas-slider .owl-carousel");
  owlTestimonals.owlCarousel({
    loop: false,
    margin: 0,
    items: 1,
    mouseDrag: false,
    autoplay: false,
    center: true,
    dots: false,
    nav: true,
    navContainer: '.ligas__arrows',
    navText: ["<i class='owl-nav fa fa-arrow-left'>", "<i class='owl-nav fa fa-arrow-right'>"],
    slideBy: "page",
    dragEndSpeed: 700,
    animateOut: 'fadeOut',
    animateIn: 'fadeIn',
    smartSpeed: 1e3,
    startPosition: 2
  });

  // owl carrousel end //

  // wow non mobile init
  new WOW({
    boxClass: 'wowNonMobile',
    mobile: false,
  }).init();

  //normal wow init
  new WOW().init();

  // Smooth Scroll
  $(document).ready(function () {
    $("a").on('click', function (event) {
      if (this.hash !== "") {
        event.preventDefault();
        var hash = this.hash;
        $('html, body').animate({
          scrollTop: $(hash).offset().top
        }, 800, function () {

          window.location.hash = hash;
        });
      }
    });
  });

  //starting lazy load
  $('img.lazy').lazyload();
})();