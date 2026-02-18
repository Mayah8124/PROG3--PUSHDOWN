package org.pushdown.data;

import java.util.Objects;

public class InvoiceLine {
    private int id;
    private Invoice invoice_id;
    private String label;
    private Double quantity;
    private Double unit_price;

    public InvoiceLine(int id, Invoice invoice_id, String label, Double quantity, Double unit_price) {
        this.id = id;
        this.invoice_id = invoice_id;
        this.label = label;
        this.quantity = quantity;
        this.unit_price = unit_price;
    }

    public InvoiceLine() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Invoice getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Invoice invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceLine that = (InvoiceLine) o;
        return id == that.id && Objects.equals(invoice_id, that.invoice_id) && Objects.equals(label, that.label) && Objects.equals(quantity, that.quantity) && Objects.equals(unit_price, that.unit_price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, invoice_id, label, quantity, unit_price);
    }

    @Override
    public String toString() {
        return "InvoiceLine{" +
                "id=" + id +
                ", invoice_id=" + invoice_id +
                ", label='" + label + '\'' +
                ", quantity=" + quantity +
                ", unit_price=" + unit_price +
                '}';
    }
}
