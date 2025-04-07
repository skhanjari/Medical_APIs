package com.example.rahmaproject;

import com.example.rahmaproject.application.service.ConsultationService;
import com.example.rahmaproject.application.service.OrdonnanceService;
import com.example.rahmaproject.application.service.PatientService;
import com.example.rahmaproject.application.usecase.*;
import com.example.rahmaproject.domain.repository.ConsultationRepository;
import com.example.rahmaproject.domain.repository.OrdonnanceRepository;
import com.example.rahmaproject.domain.repository.PatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {

    @Bean
    public PatientService patientService(SavePatientUseCase savePatientUseCase,
                                         GetListPatientsUseCase getListPatientsUseCase,
                                         GetPatientUseCase getPatientUseCase){
        return new PatientService(savePatientUseCase, getListPatientsUseCase, getPatientUseCase);
    }

    @Bean
    public SavePatientUseCase savePatientUseCase(PatientRepository patientRepository){
        return new SavePatientUseCase(patientRepository);
    }

    @Bean
    public GetListPatientsUseCase getListPatientsUseCase(PatientRepository patientRepository){
        return new GetListPatientsUseCase(patientRepository);
    }

    @Bean
    public GetPatientUseCase getPatientUseCase(PatientRepository patientRepository){
        return new GetPatientUseCase(patientRepository);
    }
    @Bean
    public OrdonnanceService ordonnanceService(CreateOrdonnanceUseCase  createOrdonnanceUseCase,
                                               GetOrdonnanceUseCase getOrdonnanceUseCase,
                                               GetListOrdonnancesUseCase getListOrdonnancesUseCase,
                                               UpdateOrdonnanceUseCase updateOrdonnanceUseCase,
                                               DeleteOrdonnanceUseCase deleteOrdonnanceUseCase){
        return new OrdonnanceService(createOrdonnanceUseCase, getListOrdonnancesUseCase,getOrdonnanceUseCase,updateOrdonnanceUseCase,deleteOrdonnanceUseCase);

    }
    @Bean
    public CreateOrdonnanceUseCase createOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository)
    {
        return new CreateOrdonnanceUseCase(ordonnanceRepository);

    }
    @Bean
    public GetListOrdonnancesUseCase getListOrdonnancesUseCase(OrdonnanceRepository ordonnanceRepository){
        return new GetListOrdonnancesUseCase(ordonnanceRepository);
    }
    @Bean
    public GetOrdonnanceUseCase getOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository){
        return new GetOrdonnanceUseCase(ordonnanceRepository);
    }
    @Bean
    public UpdateOrdonnanceUseCase updateOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository)
    {
        return new UpdateOrdonnanceUseCase(ordonnanceRepository);
    }
    @Bean
    public DeleteOrdonnanceUseCase deleteOrdonnanceUseCase(OrdonnanceRepository ordonnanceRepository)
    {
        return new DeleteOrdonnanceUseCase(ordonnanceRepository);
    }

    @Bean
    public ConsultationService consultationService(CreateConsultationUseCase  createConsultationUseCase,
                                                   GetConsultationUseCase getConsultationUseCase,
                                                   GetAllConsultationsUseCase getAllConsultationsUseCase,
                                                   UpdateConsultationUseCase updateConsultationUseCase,
                                                   DeleteConsultationUseCase deleteConsultationUseCase){
        return new ConsultationService(createConsultationUseCase, getAllConsultationsUseCase, getConsultationUseCase, updateConsultationUseCase, deleteConsultationUseCase);

    }
    @Bean
    public CreateConsultationUseCase createConsultationUseCase(ConsultationRepository consultationRepository)
    {
        return new CreateConsultationUseCase(consultationRepository);
    }

    @Bean
    public GetAllConsultationsUseCase getAllConsultationsUseCase(ConsultationRepository consultationRepository)
    {
        return new GetAllConsultationsUseCase(consultationRepository);
    }
    @Bean
    public GetConsultationUseCase getConsultationUseCase(ConsultationRepository consultationRepository)
    {
        return new GetConsultationUseCase(consultationRepository);
    }
    @Bean
    public UpdateConsultationUseCase updateConsultationUseCase(ConsultationRepository consultationRepository)
    {
        return new UpdateConsultationUseCase(consultationRepository);
    }
    @Bean
    public DeleteConsultationUseCase deleteConsultationUseCase(ConsultationRepository consultationRepository)
    {
        return new DeleteConsultationUseCase(consultationRepository);
    }

}
