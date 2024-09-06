package com.juaracoding.model;

import java.util.List;

public class Divisi {

    private Integer id;
    private String namaDivisi;
    private String deskripsiDivisi;
    private Long contohLongDivisi;
    private Double contohLongDouble;
    private List<BuatPassing> lt;

    public List<BuatPassing> getLt() {
        return lt;
    }

    public void setLt(List<BuatPassing> lt) {
        this.lt = lt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public String getDeskripsiDivisi() {
        return deskripsiDivisi;
    }

    public void setDeskripsiDivisi(String deskripsiDivisi) {
        this.deskripsiDivisi = deskripsiDivisi;
    }

    public Long getContohLongDivisi() {
        return contohLongDivisi;
    }

    public void setContohLongDivisi(Long contohLongDivisi) {
        this.contohLongDivisi = contohLongDivisi;
    }

    public Double getContohLongDouble() {
        return contohLongDouble;
    }

    public void setContohLongDouble(Double contohLongDouble) {
        this.contohLongDouble = contohLongDouble;
    }
}
