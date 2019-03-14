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
import java.util.HashMap;
import assistants.PostType;

public class Reaction {
    public static int reactionsIds = 0;
	public static HashMap<Integer, Reaction> reactions = new HashMap<>();
	private int id;
	private int userId;
	private int postId;
	private PostType postType;
	private String reaction;
	
	public Reaction(int userId, int postId, PostType postType, String reaction) {
		super();
		this.setUserId(userId);
		this.setPostId(postId);
		this.setPostType(postType);
		this.setReaction(reaction);
		Reaction.upIds();
		this.setId(Reaction.reactionsIds);
		Reaction.reactions.put(this.id, this);
	}
	
	public static void upIds() {
		Reaction.reactionsIds++;
	}
	
	public PostType getPost_type() {
		return postType;
	}

	public void setPostType(PostType post_type) {
		this.postType = post_type;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUserId(Integer user) {
		this.userId = user;
	}

	public void setPostId(Integer post) {
		this.postId = post;
	}

	public void setReaction(String reaction) {
		this.reaction = reaction;
	}

	public int getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public Integer getPostId() {
		return postId;
	}

	public String getReaction() {
		return reaction;
	}
}
