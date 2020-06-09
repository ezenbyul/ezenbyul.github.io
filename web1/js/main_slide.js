
/******************************/
/*           SildeShow        */
/*****************************/
var slideindex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("ban_fade_img");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
    }
    slideindex++;
    if (slideindex > x.length) {
        slideindex = 1
    }
    x[slideindex - 1].style.display = "block";
    setTimeout(carousel, 2000);
}
