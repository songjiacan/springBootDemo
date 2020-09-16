package co.nz.springBootDemo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class ToDo implements Serializable {
    @ApiModelProperty(value = "Id of to do task")
    private Integer id;

    @ApiModelProperty(value = "Status do task, 0 means uncompleted, 1 means completed")
    private Boolean completed;

    @ApiModelProperty(value = "Context of the todo task")
    private String text;

    public ToDo(){ }

    public ToDo(@JsonProperty("id") int id, @JsonProperty("text") String text, @JsonProperty("completed") boolean completed){
        this.id = id;
        this.text = text;
        this.completed = completed;
    }

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", completed=").append(completed);
        sb.append(", text=").append(text);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}