const imagenes = document.querySelectorAll('.carrusel-imagenes img');
const textoEvento = document.getElementById('texto-evento');
const btnIzquierda = document.querySelector('.carrusel-btn.izquierda');
const btnDerecha = document.querySelector('.carrusel-btn.derecha');
let indice = 0;

const textos = [
    "Taller de Reciclaje Creativo",
    "Conferencia de Energías Renovables",
    "Jornada de Limpieza de Playa",
];

// Solo funciona para 3 imágenes
function mostrarImagen(indice) {
    imagenes.forEach((img, i) => {
        img.classList.remove('activo', 'anterior', 'siguiente');
    });
    const total = 3;
    const anterior = (indice - 1 + total) % total;
    const siguiente = (indice + 1) % total;

    imagenes[indice].classList.add('activo');
    imagenes[anterior].classList.add('anterior');
    imagenes[siguiente].classList.add('siguiente');

    if (textoEvento && textos[indice]) {
        textoEvento.textContent = textos[indice];
    }
}

// Inicializa el carrusel
mostrarImagen(indice);

// Intervalo automático solo para 3 imágenes
let intervalo = setInterval(() => {
    indice = (indice + 1) % 3;
    mostrarImagen(indice);
}, 3000);

function reiniciarIntervalo() {
    clearInterval(intervalo);
    intervalo = setInterval(() => {
        indice = (indice + 1) % 3;
        mostrarImagen(indice);
    }, 3000);
}

btnDerecha.addEventListener('click', () => {
    indice = (indice + 1) % 3;
    mostrarImagen(indice);
    reiniciarIntervalo();
});

btnIzquierda.addEventListener('click', () => {
    indice = (indice - 1 + 3) % 3;
    mostrarImagen(indice);
    reiniciarIntervalo();
});