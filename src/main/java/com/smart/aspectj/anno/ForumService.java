package com.smart.aspectj.anno;

public class ForumService {
    @NeedTest(value = true)
    public void deleteForum(int forumId){
        System.out.println("Delete forum:" + forumId);
    }

    @NeedTest(value = false)
    public void deleteTopic(int postId){
        System.out.println("Delete topic:" + postId);
    }
}
