package com.codegym.repository;

import com.codegym.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TaskRepository extends PagingAndSortingRepository<Task,Long> {
}
