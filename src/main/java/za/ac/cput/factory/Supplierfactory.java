package za.ac.cput.factory;

import za.ac.cput.domain.Supplier;

/**
 * SupplierFactory.java
 * Author: Inam Ngqokomashe (222660155)
 * Date: 16 March 2026
 */

public class Supplierfactory {

    public static Supplier createSupplier(String supplierId, String supplierName, String supplierAddress, String supplierPhone, String supplierContactPerson, String supplierEmail) {

        return new Supplier.Builder()
                .supplier(supplierId, supplierName, supplierAddress, supplierPhone)
                .build();
    }
}
