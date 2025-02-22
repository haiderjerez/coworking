const API_URL = "http://localhost:8081/api/reservations"; // Ajusta la URL según tu backend

document.addEventListener("DOMContentLoaded", () => {
    loadReservations();

    document.getElementById("form-reservation").addEventListener("submit", async (e) => {
        e.preventDefault();

        const reservation = {
            userName: document.getElementById("userName").value,
            spaceId: document.getElementById("spaceId").value,
            startTime: document.getElementById("startTime").value,
            endTime: document.getElementById("endTime").value
        };

        const response = await fetch(API_URL, {
            method: "POST",
            headers: { "Content-Type": "application/json" },
            body: JSON.stringify(reservation)
        });

        if (response.ok) {
            loadReservations();
            document.getElementById("form-reservation").reset();
        } else {
            alert("Error al crear la reserva");
        }
    });
});

async function loadReservations() {
    const response = await fetch(API_URL);
    const reservations = await response.json();
    const list = document.getElementById("reservations-list");
    list.innerHTML = "";

    reservations.forEach(res => {
        const row = document.createElement("tr");
        row.innerHTML = `
            <td>${res.id}</td>
            <td>${res.userName}</td>
            <td>${res.spaceId}</td>
            <td>${res.startTime}</td>
            <td>${res.endTime}</td>
            <td><button class="delete-btn" onclick="deleteReservation(${res.id})">Eliminar</button></td>
        `;
        list.appendChild(row);
    });
}

async function deleteReservation(id) {
    if (!confirm("¿Seguro que deseas eliminar esta reserva?")) return;

    const response = await fetch(`${API_URL}/${id}`, { method: "DELETE" });

    if (response.ok) {
        loadReservations();
    } else {
        alert("Error al eliminar la reserva");
    }
}
