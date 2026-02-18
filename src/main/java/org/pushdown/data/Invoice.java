package org.pushdown.data;

import java.util.Objects;

public class Invoice {
    private int id;
    private String customer_name;
    private InvoiceStatus status;

    public Invoice(int id, String customer_name, InvoiceStatus status) {
        this.id = id;
        this.customer_name = customer_name;
        this.status = status;
    }

    public Invoice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public InvoiceStatus getStatus() {
        return status;
    }

    public void setStatus(InvoiceStatus status) {
        this.status = status;
    }

    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Invoice invoice = (Invoice) object;
        return id == invoice.id && java.util.Objects.equals(customer_name, invoice.customer_name) && java.util.Objects.equals(status, invoice.status);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), id, customer_name, status);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Invoice{" +
                "id=" + id +
                ", customer_name='" + customer_name + '\'' +
                ", status=" + status +
                '}';
    }
}
