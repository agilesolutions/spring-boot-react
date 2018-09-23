package ch.agilesolutions.jdo.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DomainRepository extends CrudRepository <Domain, Long> {
	// Fetch profiles by name
	List<Domain> findByName(@Param("name") String name);
}
