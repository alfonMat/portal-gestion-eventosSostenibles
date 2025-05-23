document.addEventListener("DOMContentLoaded", () => {
    const inscribirseBtn = document.querySelector("button:not(.cancelar)");
    const cancelarBtn = document.querySelector("button.cancelar");

    if (inscribirseBtn) {
        inscribirseBtn.addEventListener("click", () => {
            alert("¡Te has inscrito con éxito al evento!");
            inscribirseBtn.disabled = true;
            inscribirseBtn.textContent = "Inscrito";
            inscribirseBtn.style.backgroundColor = "#9e9e9e";
        });
    }

    if (cancelarBtn) {
        cancelarBtn.addEventListener("click", () => {
            const confirmacion = confirm("¿Estás seguro de que deseas cancelar este evento?");
            if (confirmacion) {
                alert("El evento ha sido cancelado.");
                cancelarBtn.disabled = true;
                cancelarBtn.textContent = "Evento cancelado";
                cancelarBtn.style.backgroundColor = "#9e9e9e";

                if (inscribirseBtn) {
                    inscribirseBtn.disabled = true;
                    inscribirseBtn.style.backgroundColor = "#9e9e9e";
                }
            }
        });
    }
});
