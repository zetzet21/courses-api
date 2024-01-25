package zetzet.exam26.coursesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zetzet.exam26.coursesapi.model.FileEntity;

@Repository
public interface FileRepository extends JpaRepository<FileEntity, String> {
}
