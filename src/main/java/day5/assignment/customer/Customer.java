package day5.assignment.customer;

import java.util.List;

public class Customer {

    private String name;
    private String custId;
    private List<String> documentList;

    public Customer(String name, String custId, List<String> documentList) {
        this.name = name;
        this.custId = custId;
        this.documentList = documentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public List<String> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<String> documentList) {
        this.documentList = documentList;
    }
}
