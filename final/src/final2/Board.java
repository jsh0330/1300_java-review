package final2;

import java.util.HashMap;

class Board {
	HashMap<Integer, Post> posts = new HashMap<>();
	int num = 0;

	public void addPost(String title, String content) {
		Post post = new Post(num, title, content);
		posts.put(num, post);
		num += 1;
	}

	public void deletePost(int id) {
		if (!posts.containsKey(id)) {
			throw new IllegalArgumentException("없는 아이디 입니다");
		}
		posts.remove(id);
	}

	public void getAllPosts() {
	    for (Post post : posts.values()) {
	        System.out.println("ID: " + post.getId() + ", Title: " + post.getTitle() + ", Content: " + post.getContent());
	    }
	}
}