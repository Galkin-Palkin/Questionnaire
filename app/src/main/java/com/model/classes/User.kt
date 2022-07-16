package com.model.classes

import com.model.interfaces.Imaged
import com.model.interfaces.Named

data class User(override val name: String, override val imageSource: String) : Named, Imaged
