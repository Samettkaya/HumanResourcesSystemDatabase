package HumanResourcesSystem.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import HumanResourcesSystem.Hrms.entities.concretes.JobPosition;


public interface JobPositionDao  extends JpaRepository<JobPosition, Integer> {
	
	
}
