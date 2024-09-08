package main.repositories;

import main.entities.BorrowedBy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowedByRepository extends CrudRepository<BorrowedBy,Integer> {
}
