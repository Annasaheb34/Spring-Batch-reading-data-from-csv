//package com.sample;
//
//import static org.mockito.Mockito.verifyZeroInteractions;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
//import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
//import org.springframework.batch.item.ItemReader;
//import org.springframework.batch.item.ItemWriter;
//
//import com.sample.SpringBatchExampleJobConfig;
//import com.sample.StudentDTO;
//
//class SpringBatchExampleJobConfigTest {
//	@Mock
//	private ItemReader<StudentDTO> itemReader;
//	@Mock
//	private ItemWriter<StudentDTO> itemWriter;
//	
//	@Mock
//	private StepBuilderFactory stepBuilderFactory;
//	
//	@Mock
//	private JobBuilderFactory jobBuilderFactory;
//	
//	@Mock
//	private SpringBatchExampleJobConfig jobConfig;
//	
//	
//	@BeforeEach
//	public void setUp() {
//		MockitoAnnotations.initMocks(this);
//		jobConfig = new SpringBatchExampleJobConfig();
//	}
//
////	@Test
////	void testItemReader() {
////		jobConfig.itemReader();
////		
////		verify(stepBuilderFactory, times(1)).get(anyString());
////		verify(itemReader, times(1)).setName(anyString());
////		verify(itemReader, times(1)).setResource(any(ClassPathResource.class));
////		verify(itemReader, times(1)).setLinesToSkip(anyInt());
////		verify(itemReader, times(1)).setLineMapper(any(LineMapper.class));
////		verify(itemReader, times(1)).build();
////	}
//
//	@Test
//	void testItemWriter() {
//		jobConfig.itemReader();
//		verifyZeroInteractions(itemWriter);
//		
//	}
//
////	@Test
////	void testExampleJobStep() {
////		jobConfig.exampleJobStep(itemReader, itemWriter, stepBuilderFactory);
////		
////		verify(stepBuilderFactory, times(1)).get(anyString());
////		verify(stepBuilderFactory, times(1)).<StudentDTO, StudentDTO>chunk(anyInt());
////		
////	}
//
////	@Test
////	void testExampleJob() {
////		fail("Not yet implemented");
////	}
//
//}
//
//
//
