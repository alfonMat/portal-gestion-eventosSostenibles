document.addEventListener("DOMContentLoaded", () => {
    const imagenes = document.querySelectorAll(".carrusel-imagenes img");
    const btnIzquierda = document.querySelector(".carrusel-btn.izquierda");
    const btnDerecha = document.querySelector(".carrusel-btn.derecha");
    let indice = 0;

    const mostrarImagen = (i) => {
        imagenes.forEach((img, index) => {
            img.classList.remove("activo");
            if (index === i) {
                img.classList.add("activo");
            }
        });
    };

    btnIzquierda.addEventListener("click", () => {
        indice = (indice - 1 + imagenes.length) % imagenes.length;
        mostrarImagen(indice);
    });

    btnDerecha.addEventListener("click", () => {
        indice = (indice + 1) % imagenes.length;
        mostrarImagen(indice);
    });

    // Rotación automática
    setInterval(() => {
        indice = (indice + 1) % imagenes.length;
        mostrarImagen(indice);
    }, 5000);
});
