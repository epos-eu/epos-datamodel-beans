# EPOS Data Model Beans

Inside this repository there are all the beans that represent the EPOS Data Model. 

The aim is to have only one implementation of the EPOS Data Model to be sure that all the different 
service use the same version of the beans. Also, all the changes are easily propagated to every service.

## How to use
The EPOS Data Model Beans are intended to use inside a java project. The beans can be imported using the maven:

```xml
  <dependency>
      <groupId>org.epos-eu.ics-c</groupId>
      <artifactId>epos-data-model-beans</artifactId>
      <version>1.1.1</version>
  </dependency>
```

Check inside the tags list of the repository which is the last tag available.

## The Project
The project is a maven project with only one package (`org.epos.eposdatamodel`). The classes can be distinguished in three different groups: 
1. The Epos Data Model classes, i.e. the classes which actually contains the metadata.
2. The Support classes, i.e. the classes which allow a more complete representation of the actual Epos Data Model classes. 
3. The Functional classes, i.e. the classes which doesn't exist in the Epos Data Model because they don't contain any metadata, they are only useful to better handle all the operation on the metadata itself, for instance the approval process and the versioning, but also for better use all the java object-oriented features.

| Class group | Classes of the group |
| ----------- | -------------------- |
| Epos Data Model classes | DataProduct, ContactPoint, Person, Organization, Facility, Equipment, Distribution, Operation, Publication, Service, SoftwareApplication, SoftwareSourceCode, WebService, Contract. |
| Support classes | Address, Category, CategorySchema, DataProductImplementationStatus, Documentation, Identifier, Location, Mapping, Parameter, PeriodOfTime, QuantitativeValue, ServiceImplementationStatus.
| Functional classes | EPOSDataModelEntity, LinkedEntity, State, VersioningAndApproval. |

### Relation between entities
The relation between the different classes can be of two kind, direct of indirect:
- A relation between an EPOS Data Model class and a Support class is a direct relation, for instance an Organization and its Address, the Organization has as field an object Address. The same happen for Operation and the Mapping objects or the DataProduct and its Identifiers. 
- A relation between two Epos Data Model classes is a indirect relation and is handles with the use of a LinkedEntity Object. In this way the object which store the LinkedEntity object have se information of the instanceId, the uid and the metaId of the related object and is trasparent of the change of the version of the related object.

### Documentation of the Classes
To go deep in details about each different class, and to know the use of each field is available a detailed documentation [here as javadoc.](https://www.javadoc.io/doc/org.epos-eu.ics-c/epos-data-model-beans/latest/org/epos/eposdatamodel/package-summary.html) 