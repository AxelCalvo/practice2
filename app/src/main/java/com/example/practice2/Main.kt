package com.example.practice2

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.Period
@RequiresApi(Build.VERSION_CODES.O)
fun main (){

val employee = Employe(
    id = 2,
    fullName = "Juan Del Diablo",
    curp = "CXCA001020HOCLRXA0",
    dateOfAdmission = LocalDate.parse("2010-09-08"),
    budgetKey = "ABCDE12346",
    academicLevel = AcademicLevel.BACHELOR
)
val period =com.example.practice2.Period(
initialDate = LocalDate.parse("2022-09-08"),
finalDate = LocalDate.parse("2023-09-08"),
description = "QUIENCENA"
)

 var listDetails = arrayListOf<Schedule.Detail>(
        Schedule.Detail(
            DayOfWeek.FRIDAY,
            LocalTime.parse("08:00"),
            LocalTime.parse("15:00")
        ),
        Schedule.Detail(
            DayOfWeek.TUESDAY,
            LocalTime.parse("09:00"),
            LocalTime.parse("13:00")
        ))
val schedule =Schedule.Builder(employee = employee, period= period)
    .addOne(Schedule.Detail(dayOfWeek =DayOfWeek.MONDAY,
        checkIn= LocalTime.parse("08:00"),
        checkOut= LocalTime.parse("14:00"))).build()


val listOfCheckInOut = listOf<CheckinOut>(
        CheckinOut(
            LocalDate.parse("2022-09-12"),
            employee,
            LocalTime.parse("08:00"),
            LocalTime.parse("14:00")
        ))
val incident = Incident(employee = employee, currentSchedule = schedule,
    checksInOut = listOfCheckInOut, permissions = listOf(),
    initialDate =LocalDate.parse("2022-09-12"),
    finalDate = LocalDate.parse("2022-09-16"))
    println("Nombre: ${employee.fullName}")
    println("Genero: ${employee.getGenre()}")
    println("Faltas: ${incident.getAbsences()}")

}




