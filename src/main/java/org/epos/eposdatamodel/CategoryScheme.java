package org.epos.eposdatamodel;

import java.util.Objects;

/**
 * This property contains a name of the category scheme. May be repeated for different versions of the name.
 */
public class CategoryScheme extends EPOSDataModelEntity {

    /**
     * This property contains a description of the category scheme.
     */
    private String description;

    /**
     * This property contains a name of the category scheme.
     */
    private String title;
    
    /**
     * This property contains a name of the category scheme.
     */
    private String code;
    
    
    /**
     * This property contains a name of the category scheme.
     */
    private String uid;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
   

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "CategoryScheme{" +
                "description='" + description + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryScheme that = (CategoryScheme) o;
        return Objects.equals(getDescription(), that.getDescription()) && Objects.equals(getTitle(), that.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getTitle());
    }
}
