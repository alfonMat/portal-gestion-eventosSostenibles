const imagenes = document.querySelectorAll('.carrusel-imagenes img');
const textoEvento = document.getElementById('texto-evento');
const btnIzquierda = document.querySelector('.carrusel-btn.izquierda');
const btnDerecha = document.querySelector('.carrusel-btn.derecha');
let indice = 0;

const textos = [
    "Taller de Reciclaje Creativo",
    "Conferencia de Energías Renovables",
    "Jornada de Limpieza de Playa"
];

function mostrarImagen(indice) {
    imagenes.forEach((img, i) => {
        img.classList.remove('activo');
        if (i === indice) {
            img.classList.add('activo');
            textoEvento.textContent = textos[i]; // Actualiza el texto
        }
    });
}

btnDerecha.addEventListener('click', () => {
    indice = (indice + 1) % imagenes.length;
    mostrarImagen(indice);
});

btnIzquierda.addEventListener('click', () => {
    indice = (indice - 1 + imagenes.length) % imagenes.length;
    mostrarImagen(indice);
});

// Inicializa el carrusel
mostrarImagen(indice);
