package main.services;

import main.entities.Publisher;
import main.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PublisherService {
    @Autowired
    public PublisherRepository publisherRepository;

    //insert
    public Publisher insertPublisherService(Publisher publisher)
    {
        publisherRepository.save(publisher);
        return publisher;
    }

    //get all Publishers
    public List<Publisher>  getAllPublishersService()
    {
        return (List<Publisher>) publisherRepository.findAll();
    }
}
