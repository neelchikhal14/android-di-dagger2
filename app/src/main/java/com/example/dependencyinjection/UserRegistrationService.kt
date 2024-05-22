package com.example.dependencyinjection

class UserRegistrationService(
    private val userRepository: UserRepository,
    private val emailService: EmailService
    ) {

    fun registerUser(email:String,password:String){
        userRepository.saveUser(email,password)
        emailService.sendEmail(email,"abc@datatech.com","Welcome to our org")
    }
}