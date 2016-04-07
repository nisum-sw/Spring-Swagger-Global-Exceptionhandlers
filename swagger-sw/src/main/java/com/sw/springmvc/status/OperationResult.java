package com.sw.springmvc.status;


public class OperationResult<T> {

    public static enum Status {SUCCESS,ERROR, WARNING, UNKNOWN}

    private Status status;
    private  String message;
    private T data;

    public OperationResult() {
    }

    public OperationResult(Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
