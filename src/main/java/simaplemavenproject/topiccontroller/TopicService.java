package simaplemavenproject.topiccontroller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "Spring", "Spring Frame Work"),
			new Topic("java", "java", "Java EE Edition"),
			new Topic("javascript", "javascript", "JavaScript EE Editions")));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		System.out.println("Inside post");
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {

		for (int i = 0; i < topics.size(); i++) {
			Topic topic2 = topics.get(i);
			if (topic2.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}

	}

	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}

}
