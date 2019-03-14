/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author CAMILO
 */
import java.util.Date;
import java.util.HashMap;
import assistants.State;

public class Post {

    public static int postsIds = 0;
    public static HashMap<Integer, Post> posts = new HashMap<Integer, Post>();
    private String description;
    private int id;
    private int userId;
    private State state = State.ACTIVE;
    private Date date; 
    private HashMap<Integer, Integer> reactionsIds = new HashMap<>();

    public Post(String description, int userId) {
        super();
        this.setDescription(description);
        this.setUserId(userId);
        this.date = new Date();
        Post.upIds();
        this.setId(Post.postsIds);
        Post.posts.put(this.id, this);
    }

    public static void upIds() {
        Post.postsIds++;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer user) {
        this.userId = user;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public HashMap<Integer, Integer> getReactions() {
        return reactionsIds;
    }

    public void setReactions(HashMap<Integer, Integer> reactions) {
        this.reactionsIds = reactions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void addReaction(int reactionId) {
        this.reactionsIds.put(reactionId, reactionId);
    }

}
