package com.model.interfaces

interface Question<T> : EmptyQuestion where T: AnswerVariant {
    override val text: String

    val answerVarieties: List<T>
}