package com.ml.redditreaderapp.domain

import com.google.gson.annotations.SerializedName

data class Children (
	@SerializedName("kind") val kind : String,
	@SerializedName("data") val data : PostData
)