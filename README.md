ServerLess Archi (Run Spring Boot on AWS Lambda)

follow the read. (따라해주세요)

Required Installation (필수 설치)
sam,aws-cli 
![image](https://github.com/user-attachments/assets/a884d454-9285-48c0-a0ff-bfe31e08ae96)


sam build in the same directory below(하단 동일 경로에서 sam build)
![image](https://github.com/user-attachments/assets/5b4b2f9e-6005-464a-904a-2f4b6ffa37e8)


CI/CD Sequence
"You don't need to do these steps yourself; the SAM CLI automatically sets up the infrastructure through AWS CloudFormation. There's no need to do it manually."

After completing sam build in the same directory below, proceed with sam deploy (initially, you need to work with sam build --guided). (하단 동일 경로에서 sam build 완료 후 sam deploy (처음엔 sam build --guided로 작업 필요))
Write the same below and then deploy. (하단 동일하게 작성 후 배포)
![image](https://github.com/user-attachments/assets/eb8a103b-df25-4d60-a307-838ea3d01cc9)

CI/CD Structure(CI/CD 구조)
Build file is uploaded to S3. (build 파일 S3에 업로드	됨)	
![image](https://github.com/user-attachments/assets/623544dc-8f32-4f59-85f6-307a6d74c09d)

Build file is uploaded from S3 to Lambda. (build파일 S3 -> Lambda로 업로드)			
![image](https://github.com/user-attachments/assets/45ad90fb-648c-4550-9abb-9dc802d26220)

Attach the API Gateway to the Lambda function. Access must be through the Invoke URL of the Prod stage in Stages. (Lambda 함수에 apigateway 부착	반드시 Stages의 Prod의 Invoke URL로 접근)		
![image](https://github.com/user-attachments/assets/01e2cd43-a51a-468f-9070-1e6b8b785437)

do Test (테스트)
![image](https://github.com/user-attachments/assets/a0937596-3109-47ae-8202-4d909b5f81ad)

Track server execution logs in CloudWatch. (서버 실행 로그 추적 cloudwatch 에서 추적)	
![image](https://github.com/user-attachments/assets/b197f37d-0a4b-442c-b8c5-138422eede19)


Track logs during the sam deploy process (track in CloudFormation). (sam deploy 과정에서 로그 추적 (cloudformation 에서 추적))	
![image](https://github.com/user-attachments/assets/220feb6e-d74b-4990-8b84-261bf640f70e)



