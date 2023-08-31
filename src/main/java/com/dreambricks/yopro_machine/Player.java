package com.dreambricks.yopro_machine;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;

@Document(collection = "players")
public class Player {

    @Id
    String id;
    Date dataCadastro;
    byte[] fileEncrypted;

    String telHash;

    String fileName;

    public Player() {
    }

    public Player(String id, Date dataCadastro, byte[] fileEncrypted, String fileName, String telHash) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.fileEncrypted = fileEncrypted;
        this.fileName = fileName;
        this.telHash = telHash;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public byte[] getFileEncrypted() {
        return fileEncrypted;
    }

    public void setFileEncrypted(byte[] fileEncrypted) {
        this.fileEncrypted = fileEncrypted;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getTelHash() {
        return telHash;
    }

    public void setTelHash(String telHash) {
        this.telHash = telHash;
    }
}
