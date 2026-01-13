package hrms.hrms.dto;

import java.time.LocalDateTime;
import hrms.hrms.entity.JobApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobApplicationDto {
	private Integer id;
	private String jobTitle;
	private Integer jobSeekerId;
	private String employerCompanyName;
	private Integer jobAdvertisementId;
	private JobApplicationStatus status;
	private LocalDateTime applicationDate;
}
