package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Shipment;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ShipmentFactoryTest {

    @Test
    public void testCreateShipment() {
        String shipmentId = "SHP123";
        String orderId = "ORD456";
        LocalDate shipmentDate = LocalDate.of(2026, 3, 15);
        LocalDate deliveryDate = LocalDate.of(2026, 3, 20);
        String status = "Pending";
        String carrier = "FastShip";

        Shipment shipment = ShipmentFactory.createShipment(shipmentId, orderId, shipmentDate, deliveryDate, status, carrier);

        assertNotNull(shipment);
        assertEquals(shipmentId, shipment.getShipmentId());
        assertEquals(orderId, shipment.getOrderId());
        assertEquals(shipmentDate, shipment.getShipmentDate());
        assertEquals(deliveryDate, shipment.getDeliveryDate());
        assertEquals(status, shipment.getStatus());
        assertEquals(carrier, shipment.getCarrier());
    }
}
