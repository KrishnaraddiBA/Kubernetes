package com.KubernetesExample.payload;

public class ApiResponse<T> {

    private String message;
    private int status;
    private T getResponse;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getGetResponse() {
        return getResponse;
    }

    public void setGetResponse(T getResponse) {
        this.getResponse = getResponse;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", getResponse=" + getResponse +
                '}';
    }
}
