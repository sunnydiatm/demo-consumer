package com.example.consumer.democonsumer.api;

public class Sensor {
    private  Metadata metadata;
    private  String id;

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    private  float acceleration;
    private  float velocity;
    private  float internalTemperature;
    private  float externalTemperature;

    public float getAcceleration() {
        return acceleration;
    }

    public String getId() {
        return id;
    }

    public float getVelocity() {
        return velocity;
    }

    public float getInternalTemperature() {
        return internalTemperature;
    }

    public float getExternalTemperature() {
        return externalTemperature;
    }

    public void setExternalTemperature(float externalTemperature) { this.externalTemperature = externalTemperature; }

    public void setId(String id) {
        this.id = id;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public void setInternalTemperature(float internalTemperature) {
        this.internalTemperature = internalTemperature;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "metadata=" + metadata +
                ", id='" + id + '\'' +
                ", acceleration=" + acceleration +
                ", velocity=" + velocity +
                ", internalTemperature=" + internalTemperature +
                ", externalTemperature=" + externalTemperature +
                '}';
    }
}
