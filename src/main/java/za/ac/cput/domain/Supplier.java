package za.ac.cput.domain;

/**
 * Supplier.java
 * Supplier model class
 * Author: Inam Ngqokomashe (222660155)
 *Date: 09 March 2026
 */

public class Supplier {

    private String supplierId;
    private String supplierName;
    private String supplierAddress;
    private String supplierPhone;
    private String supplierContactPerson;
    private String supplierEmail;

    public Supplier(Builder builder) {
        this.supplierId = builder.supplierId;
        this.supplierName = builder.supplierName;
        this.supplierAddress = builder.supplierAddress;
        this.supplierPhone = builder.supplierPhone;
        this.supplierContactPerson = builder.supplierContactPerson;
        this.supplierEmail = builder.supplierEmail;
    }

    @Override
    public String toString() {
        return "Supplier: "
                + supplierId + ", "
                + supplierName + ", "
                + supplierAddress + ", "
                + supplierPhone + ", "
                + supplierContactPerson + ", "
                + supplierEmail;
    }

    public static class Builder {
        private String supplierId;
        private String supplierName;
        private String supplierAddress;
        private String supplierPhone;
        private String supplierContactPerson;
        private String supplierEmail;


       public Builder supplier(String supplierId, String supplierName, String supplierAddress, String supplierPhone) {
           this.supplierId = supplierId;
           this.supplierName = supplierName;
           this.supplierAddress = supplierAddress;
           this.supplierPhone = supplierPhone;
           this.supplierContactPerson = supplierContactPerson;
           this.supplierEmail = supplierEmail;
           return this;
       }

        public void setSupplierId(String supplierId) {
            this.supplierId = supplierId;
        }

        public void setSupplierEmail(String supplierEmail) {
            this.supplierEmail = supplierEmail;
        }

        public void setSupplierContactPerson(String supplierContactPerson) {
            this.supplierContactPerson = supplierContactPerson;
        }

        public void setSupplierPhone(String supplierPhone) {
            this.supplierPhone = supplierPhone;
        }

        public void setSupplierAddress(String supplierAddress) {
            this.supplierAddress = supplierAddress;
        }

        public void setSupplierName(String supplierName) {
            this.supplierName = supplierName;
        }

        public Supplier build() {
            return new Supplier(this);
        }
    }
}

