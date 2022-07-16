package com.model.classes.pollanswers

import com.model.classes.User
import com.model.interfaces.Answer
import com.model.interfaces.Ownerable

data class UserAnswer(override val owner: User, val answers: List<Answer>) : Ownerable
