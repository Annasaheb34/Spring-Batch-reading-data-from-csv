package com.sample;
//package com.sample;
//import org.springframework.batch.test.context.SpringBatchTest;
//import org.junit.After;
//import org.junit.runner.RunWith;
//import org.springframework.batch.core.JobParameters;
//import org.springframework.batch.core.JobParametersBuilder;
//import org.springframework.batch.test.JobLauncherTestUtils;
//import org.springframework.batch.test.JobRepositoryTestUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.annotation.DirtiesContext.ClassMode;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
//import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
//
//import com.sample.SpringBatchExampleJobConfig;
//
//@RunWith(SpringRunner.class)
//@EnableAutoConfiguration
//@SpringBatchTest
//@SpringBootTest
//@ContextConfiguration(classes = { SpringBatchExampleJobConfig.class })
//@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, 
//  DirtiesContextTestExecutionListener.class})
//@DirtiesContext(classMode = ClassMode.AFTER_CLASS)
//public class SpringBatchIntegrationTest {
//
//    @Autowired
//    private JobLauncherTestUtils jobLauncherTestUtils;
//  
//    @Autowired
//    private JobRepositoryTestUtils jobRepositoryTestUtils;
//  
//    @After
//    public void cleanUp() {
//        jobRepositoryTestUtils.removeJobExecutions();
//    }
//
//    private JobParameters defaultJobParameters() {
//        JobParametersBuilder paramsBuilder = new JobParametersBuilder();
////        paramsBuilder.addString("file.input", TEST_INPUT);
////        paramsBuilder.addString("file.output", TEST_OUTPUT);
//        return paramsBuilder.toJobParameters();
//   }
//}
