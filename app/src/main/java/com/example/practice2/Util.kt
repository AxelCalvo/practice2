package com.example.practice2

import java.time.LocalDate

fun hasPermission(employee: Employe, date: LocalDate, permissions: List<Permissions>): Boolean {
    val permission = permissions.firstOrNull{it.date==date && it.employee==employee}
    return (permission!=null)
}