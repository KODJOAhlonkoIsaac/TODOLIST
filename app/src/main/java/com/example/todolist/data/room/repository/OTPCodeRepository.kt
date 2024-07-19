package com.example.todolist.data.room.repository

import com.example.todolist.data.room.daos.OTPCodeDao
import com.example.todolist.data.room.models.OTPCode
import kotlinx.coroutines.flow.Flow

class OTPCodeRepository (
    private val otpCodeDao: OTPCodeDao
){

    suspend fun insert(optCode: OTPCode){ otpCodeDao.insert(optCode)}

    fun checkOtpCode(email: String, code: String): Flow<List<OTPCode>> = otpCodeDao.checkOtpCode(email,code)
}