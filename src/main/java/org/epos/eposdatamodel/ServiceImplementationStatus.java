package org.epos.eposdatamodel;


import java.util.Objects;

/**
 * This class allow to represent the implementation status of a Service made available by a Service Provider.
 */
public class ServiceImplementationStatus extends EPOSDataModelEntity {

    /**
     * This property refers to the Service Provider (Organization) which is responsible
     * to implement and make available a Service.
     **/
    private String serviceProvider;

    /**
     * This property refers to the Service implemented by a specific Service Provider.
     **/
    private String service;

    /**
     * Level of implementation (implemented/design phase/not ready) of a Service implemented by a Service Provider.
     **/
    private String status;


    public ServiceImplementationStatus serviceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
        return this;
    }

    /**
     * This property refers to the Service Provider (Organization) which is responsible
     * to implement and make available a Service.
     *
     * @return serviceProvider
     **/

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public ServiceImplementationStatus service(String service) {
        this.service = service;
        return this;
    }

    /**
     * This property refers to the Service implemented by a specific Service Provider.
     *
     * @return service
     **/

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ServiceImplementationStatus status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Level of implementation (implemented/design phase/not ready) of a Service implemented by a Service Provider.
     *
     * @return status
     **/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ServiceImplementationStatus{" +
                "serviceProvider='" + serviceProvider + '\'' +
                ", service='" + service + '\'' +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ServiceImplementationStatus that = (ServiceImplementationStatus) o;
        return Objects.equals(getServiceProvider(), that.getServiceProvider()) && Objects.equals(getService(), that.getService()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getServiceProvider(), getService(), getStatus());
    }
}
