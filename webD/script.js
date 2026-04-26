let hrt = document.querySelector(".heart");
let like = false;

hrt.addEventListener("click", function () {
    if (like) {
        hrt.classList.remove("ri-heart-line");
        hrt.classList.add("ri-heart-fill");
        like = false;
    }
    else {
        hrt.classList.add("ri-heart-line");
        hrt.classList.remove("ri-heart-fill");
        like = true;
    }
})