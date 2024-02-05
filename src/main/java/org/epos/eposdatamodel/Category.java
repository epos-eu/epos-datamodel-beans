package org.epos.eposdatamodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A subject of a Class.
 */
public class Category extends EPOSDataModelEntity {
    /**
     * This property contains a description of the category
     */
    private String description;

    /**
     * Relates a resource (for example a concept) to a concept scheme in which it is included.
     */
    private String inScheme;

    /**
     * This property contains a preferred label of the category
     */
    private String name;
    
    /**
     * This property contains a name of the category scheme.
     */
    private String uid;
    
    /**
     * This property contains a name of the category scheme.
     */
    private List<String> broader;
    
    /**
     * This property contains a name of the category scheme.
     */
    private List<String> narrower;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInScheme() {
        return inScheme;
    }

    public void setInScheme(String inScheme) {
        this.inScheme = inScheme;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public List<String> getBroader() {
		return broader;
	}

	public void setBroader(List<String> broader) {
		this.broader = broader;
	}

	public List<String> getNarrower() {
		return narrower;
	}

	public void setNarrower(List<String> narrower) {
		this.narrower = narrower;
	}
	
	public void addNarrower(String narrower) {
        if (this.getNarrower() == null) {
            ArrayList<String> narrowers = new ArrayList<>();
            narrowers.add(narrower);
            this.setNarrower(narrowers);
        } else {
            this.getNarrower().add(narrower);
        }
    }
	
	public void addBroader(String broader) {
        if (this.getBroader() == null) {
            ArrayList<String> broaders = new ArrayList<>();
            broaders.add(broader);
            this.setBroader(broaders);
        } else {
            this.getBroader().add(broader);
        }
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(broader, description, inScheme, name, narrower, uid);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(broader, other.broader) && Objects.equals(description, other.description)
				&& Objects.equals(inScheme, other.inScheme) && Objects.equals(name, other.name)
				&& Objects.equals(narrower, other.narrower) && Objects.equals(uid, other.uid);
	}

	@Override
	public String toString() {
		return "Category [description=" + description + ", inScheme=" + inScheme + ", name=" + name + ", uid=" + uid
				+ ", broader=" + broader + ", narrower=" + narrower + "]";
	}
	
}