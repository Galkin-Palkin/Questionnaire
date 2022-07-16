package com.model.classes.pollanswers

import com.model.interfaces.Answer

data class MultipleAnswer(val answers: List<Boolean>) : Answer
