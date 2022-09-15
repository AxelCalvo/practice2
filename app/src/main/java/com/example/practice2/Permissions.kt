package com.example.practice2

import java.time.LocalDate

data class Permissions (val employee: Employe,
                       val date: LocalDate,
                       val justification: String,
)
