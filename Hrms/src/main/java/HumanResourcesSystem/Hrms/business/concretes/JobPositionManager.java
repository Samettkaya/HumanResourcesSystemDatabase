package HumanResourcesSystem.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HumanResourcesSystem.Hrms.business.abstracts.JobPositionService;
import HumanResourcesSystem.Hrms.dataAccess.abstracts.JobPositionDao;
import HumanResourcesSystem.Hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosition> getAll() {
		
		return this.jobPositionDao.findAll();
	}

}
