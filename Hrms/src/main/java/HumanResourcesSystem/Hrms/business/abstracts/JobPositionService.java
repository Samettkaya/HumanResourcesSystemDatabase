package HumanResourcesSystem.Hrms.business.abstracts;

import java.util.List;

import HumanResourcesSystem.Hrms.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
}
