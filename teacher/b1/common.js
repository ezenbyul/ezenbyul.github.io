$(document).ready(function(){
    var sc_top = 0;
    $(window).scroll(function(){
        sc_top = parseInt($(window).scrollTop());
        if(sc_top >= 150) {
            $(".hd_bottom_wrap").addClass("active");
        } else {
            $(".hd_bottom_wrap").removeClass("active");
        }
    });
});