package org.epos.eposdatamodel;


import java.util.Objects;

/**
 * This class allow to represent the implementation status of a Data Product made available by a Data Provider.
 */
public class DataProductImplementationStatus extends EPOSDataModelEntity {

    /**
     * This property refers to the Data Provider (Organization) which is responsible to
     * implement and make available a Data Product.
     **/
    private String dataProvider = null;

    /**
     * This property refers to the Data Product implemented by a specific Data Provider.
     **/
    private String dataProduct = null;

    /**
     * Level of implementation (implemented/design phase/not ready) of a Data Product implemented by a Data Provider.
     **/
    private String status = null;


    public DataProductImplementationStatus dataProvider(String dataProvider) {
        this.dataProvider = dataProvider;
        return this;
    }

    /**
     * This property refers to the Data Provider (Organization) which is responsible to
     * implement and make available a Data Product.
     *
     * @return dataProvider
     **/

    public String getDataProvider() {
        return dataProvider;
    }

    public void setDataProvider(String dataProvider) {
        this.dataProvider = dataProvider;
    }


    public DataProductImplementationStatus dataProduct(String dataProduct) {
        this.dataProduct = dataProduct;
        return this;
    }

    /**
     * This property refers to the Data Product implemented by a specific Data Provider.
     *
     * @return dataProduct
     **/

    public String getDataProduct() {
        return dataProduct;
    }

    public void setDataProduct(String dataProduct) {
        this.dataProduct = dataProduct;
    }


    public DataProductImplementationStatus status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Level of implementation (implemented/design phase/not ready) of a Data Product implemented by a Data Provider.
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
        return "DataProductImplementationStatus{" +
                "dataProvider='" + dataProvider + '\'' +
                ", dataProduct='" + dataProduct + '\'' +
                ", status='" + status + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DataProductImplementationStatus that = (DataProductImplementationStatus) o;
        return Objects.equals(getDataProvider(), that.getDataProvider()) && Objects.equals(getDataProduct(), that.getDataProduct()) && Objects.equals(getStatus(), that.getStatus());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDataProvider(), getDataProduct(), getStatus());
    }
}
