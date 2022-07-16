package com.model.classes

import com.model.interfaces.EmptyQuestion
import com.model.interfaces.Named
import com.model.interfaces.Ownerable
import com.model.interfaces.Question

data class Poll(override val owner: User, override val name: String,
                val questions: List<EmptyQuestion>) : Named, Ownerable
