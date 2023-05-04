package org.epos.eposdatamodel;


/**
 * State of the instance, it is used for the Approval process
 */
public enum State {

    /**
     * This instance has been edited but not yet submitted.
     */
    DRAFT,

    /**
     * This instance needs to be approved in order to be published.
     */
    SUBMITTED,

    /**
     * This instance is public, and can be seen in the production EPOS DATA PORTAL.
     */
    PUBLISHED,

    /**
     * This instance hasn't been approved and is waiting to be edited again.
     */
    DISCARDED,

    /**
     * This instance is no longer used.
     */
    ARCHIVED,

    /**
     * used for mark an instance as only partialy created, used when is saved an instance and it has a reference to
     * another instance not yet ingested or saved.
     */
    PLACEHOLDER
}
