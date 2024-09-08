package main.controllers;

import main.entities.Publisher;
import main.handlers.PublisherHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Publisher")
public class PublisherController {
    @Autowired
    public PublisherHandler publisherHandler;

    @PostMapping
    public Publisher insertPublisher(@RequestBody Publisher publisher)
    {
        publisherHandler.insertPublisherHandler(publisher);
        return publisher;    }

    @GetMapping
    public List<Publisher> getAllPublishers()
    {
        return publisherHandler.getAllPublisherHandler();
    }
}
