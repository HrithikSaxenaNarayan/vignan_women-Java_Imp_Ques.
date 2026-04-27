let hrt = document.querySelector(".heart");
let postHrt = document.querySelector(".post-heart");
let postImg = document.querySelector(".post img");
let like = false;

postImg.addEventListener("click", () => {
    postHrt.style.trasform = "scale(1)";
    postHrt.style.opacity = 0.8;

    setTimeout(() => {
        postHrt.style.opacity = 0;
    }, 1000);

    setTimeout(() => {
        postHrt.style.trasform = "scale(0)";
    }, 2000);

    hrt.classList.remove("ri-heart-line");
    hrt.classList.add("ri-heart-fill");
});


hrt.addEventListener("click", function () {
    if (like == false) {
        hrt.classList.add("ri-heart-line");
        hrt.classList.remove("ri-heart-fill");
        like = true;
    }
    else {
        hrt.classList.remove("ri-heart-line");
        hrt.classList.add("ri-heart-fill");
        like = false;
    }
});