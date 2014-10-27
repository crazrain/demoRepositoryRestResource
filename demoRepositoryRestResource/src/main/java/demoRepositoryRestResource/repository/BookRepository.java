package demoRepositoryRestResource.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import demoRepositoryRestResource.domain.Book;

@RepositoryRestResource
public interface BookRepository extends PagingAndSortingRepository<Book, String> {
	Iterable<Book> findByAuthor(@Param("author") String author);
}
