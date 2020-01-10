package com.academy.dashboard.topicss;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


	public Topic findByTitle(String title);
	//getTopics
	//getTopic(id)
	//addTopic
	//editTopic
	//deleteTopic
}
