//package com.sample;
//import static org.mockito.ArgumentMatchers.eq;
//import static org.mockito.Mockito.verify;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.batch.core.Job;
//import org.springframework.batch.core.JobParameter;
//import org.springframework.batch.core.JobParameters;
//import org.springframework.batch.core.launch.JobLauncher;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringBootConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//
//import com.sample.SpringBatchExampleJobLauncher;
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//@ExtendWith(MockitoExtension.class)
//@SpringBootConfiguration
//class SpringBatchExampleJobLauncherTest {
//
//	@Mock
//	private JobLauncher jobLauncher;
//	
//	@Autowired
//	private Job job;
//	
//	@BeforeEach
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//	}
//
//	@Test
//	void testRunSpringBatchExampleJob() throws Exception {		
//		MockitoAnnotations.initMocks(this);
//		SpringBatchExampleJobLauncher jobLauncherBean = new SpringBatchExampleJobLauncher(job, jobLauncher);
//		
//		JobParameters jobParameters = newExecution();
//		
//		jobLauncherBean.runSpringBatchExampleJob();
//		
//		verify(jobLauncher).run(eq(job), eq(jobParameters));
//		
//	}
//	@Test
//	private JobParameters newExecution() {
//		Map<String, JobParameter> parameters = new HashMap<>();
//
//        JobParameter parameter = new JobParameter(new Date());
//        parameters.put("currentTime", parameter);
//
//        return new JobParameters(parameters);
//	}
//	
//
//}
