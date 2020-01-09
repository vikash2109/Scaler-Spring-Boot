package com.academy.dashboard.topicss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics= new ArrayList<Topic>(Arrays.asList(
			new Topic("1","Array","Easy"),
			new Topic("2","Math","Easy"),
			new Topic("3","Serching","Easy"),
			new Topic("4","Sorting","Hard")));
	
	public List<Topic> getTopics(){
		return topics;
	}

	public Topic getTopic(String id) {
		
		for(Topic topic:topics) {
			if(topic.getId().equals(id))
				return topic;
		}
		
		return null;
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}
}
