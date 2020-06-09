
/******************************/
/*           SildeShow        */
/*****************************/
var footindex = 0;
footBanSlid();

function footBanSlid() {
    var i;
    var y = document.getElementsByClassName("footslidImg");
    for (i = 0; i < y.length; i++) {
        y[i].style.display = "none";
    }
    footindex++;
    if (footindex > y.length) {
        footindex = 1
    }
    y[footindex - 1].style.display = "block";
    setTimeout(footBanSlid, 2000);
}