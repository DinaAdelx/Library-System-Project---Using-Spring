package main.handlers;

import lombok.AllArgsConstructor;
import main.entities.Publisher;
import main.services.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Transactional
@Service
public class PublisherHandler {
    @Autowired
    public PublisherService publisherService;

    //insert Publisher
    public Publisher insertPublisherHandler(Publisher publisher)
    {
        publisherService.insertPublisherService(publisher);
        return publisher;
    }

    //get all publishers
    public List<Publisher> getAllPublisherHandler()
    {
        return  publisherService.getAllPublishersService();
    }
}
