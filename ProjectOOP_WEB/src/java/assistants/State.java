/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assistants;

/**
 *
 * @author CAMILO
 */
public enum State {

    ACTIVE("The post is currently active and can be accessed."),
    REPORTED("The post has been reported."),
    INACTIVE("The post is inactive and can not be accessed.");

    private String description;

    private State(String description) {
        this.setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
