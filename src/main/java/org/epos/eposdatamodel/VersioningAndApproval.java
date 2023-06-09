package org.epos.eposdatamodel;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * Contains all the fields to have in place the versiong and the approval process
 */
public abstract class VersioningAndApproval {

    /**
     * instanceId is the id of the instance
     */
    private String instanceId;

    /**
     * metaId is the id of the entity, is the same across all the different instances
     */
    private String metaId;

    /**
     * instanceId of the previous version of the instance
     */
    private String instanceChangedId;

    /**
     * timestamp when the last change happened
     */
    private LocalDateTime changeTimestamp;

    /**
     * last operation type
     */
    private String operation;

    /**
     * metaId of the editor
     */
    private String editorId;

    /**
     * comment of the user when he create the draft
     */
    private String changeComment;

    /**
     * version tag
     */
    private String version;

    /**
     * State of the instance
     */
    private State state;

    /**
     * Mark an entity to be deleted when the fake instance in the approval process is published.
     */
    private String toBeDelete;

    /**
     * If ingested it contains from which file it was ingested.
     */
    private String fileProvenance;

    /**
     * list of group which the entity belong
     */
    private List<Group> groups;


    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getMetaId() {
        return metaId;
    }

    public void setMetaId(String metaId) {
        this.metaId = metaId;
    }

    public String getInstanceChangedId() {
        return instanceChangedId;
    }

    public void setInstanceChangedId(String instanceChangedId) {
        this.instanceChangedId = instanceChangedId;
    }

    public LocalDateTime getChangeTimestamp() {
        return changeTimestamp;
    }

    public void setChangeTimestamp(LocalDateTime changeTimestamp) {
        this.changeTimestamp = changeTimestamp;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getEditorId() {
        return editorId;
    }

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    public String getChangeComment() {
        return changeComment;
    }

    public void setChangeComment(String changeComment) {
        this.changeComment = changeComment;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getToBeDelete() {
        return toBeDelete;
    }

    public void setToBeDelete(String toBeDelete) {
        this.toBeDelete = toBeDelete;
    }

    public String getFileProvenance() {
        return fileProvenance;
    }

    public void setFileProvenance(String fileProvenance) {
        this.fileProvenance = fileProvenance;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "VersioningAndApproval{" +
                "instanceId='" + instanceId + '\'' +
                ", metaId='" + metaId + '\'' +
                ", instanceChangedId='" + instanceChangedId + '\'' +
                ", changeTimestamp=" + changeTimestamp +
                ", operation='" + operation + '\'' +
                ", editorId='" + editorId + '\'' +
                ", changeComment='" + changeComment + '\'' +
                ", version='" + version + '\'' +
                ", state=" + state +
                ", toBeDelete='" + toBeDelete + '\'' +
                ", fileProvenance='" + fileProvenance + '\'' +
                ", groups=" + groups +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VersioningAndApproval that = (VersioningAndApproval) o;
        return Objects.equals(getInstanceId(), that.getInstanceId()) && Objects.equals(getMetaId(), that.getMetaId()) && Objects.equals(getInstanceChangedId(), that.getInstanceChangedId()) && Objects.equals(getChangeTimestamp(), that.getChangeTimestamp()) && Objects.equals(getOperation(), that.getOperation()) && Objects.equals(getEditorId(), that.getEditorId()) && Objects.equals(getChangeComment(), that.getChangeComment()) && Objects.equals(getVersion(), that.getVersion()) && getState() == that.getState() && Objects.equals(getToBeDelete(), that.getToBeDelete()) && Objects.equals(getFileProvenance(), that.getFileProvenance());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getInstanceId(), getMetaId(), getInstanceChangedId(), getChangeTimestamp(), getOperation(), getEditorId(), getChangeComment(), getVersion(), getState(), getToBeDelete(), getFileProvenance());
    }
}
