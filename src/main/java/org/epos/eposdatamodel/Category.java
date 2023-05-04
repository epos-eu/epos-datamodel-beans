package org.epos.eposdatamodel;

import java.util.Objects;

/**
 * A subject of a Class.
 */
public class Category {
    /**
     * This property contains a description of the category
     */
    private String description;

    /**
     * Relates a resource (for example a concept) to a concept scheme in which it is included.
     */
    private CategoryScheme inScheme;

    /**
     * This property contains a preferred label of the category
     */
    private String name;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryScheme getInScheme() {
        return inScheme;
    }

    public void setInScheme(CategoryScheme inScheme) {
        this.inScheme = inScheme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "description='" + description + '\'' +
                ", inScheme=" + inScheme +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(getDescription(), category.getDescription()) && Objects.equals(getInScheme(), category.getInScheme()) && Objects.equals(getName(), category.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getInScheme(), getName());
    }
}
