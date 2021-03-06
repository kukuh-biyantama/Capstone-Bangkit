package com.capstonebangkit.skin_diagnosis_app.ui.ui.saran

import com.google.firebase.database.IgnoreExtraProperties

@IgnoreExtraProperties
data class message(
    val text: String? = null,
    val name: String? = null,
    val photoUrl: String? = null,
    val timestamp: Long? = null
) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}
