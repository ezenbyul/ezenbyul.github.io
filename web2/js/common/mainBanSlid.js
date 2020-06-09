
/******************************/
/*           SildeShow        */
/*****************************/
var slideindex = 0;
mainBanSlid();

function mainBanSlid() {
    var i;
    var x = document.getElementsByClassName("mainslidImg");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
    }
    slideindex++;
    if (slideindex > x.length) {
        slideindex = 1
    }
    x[slideindex - 1].style.display = "block";
    setTimeout(mainBanSlid, 2000);
}