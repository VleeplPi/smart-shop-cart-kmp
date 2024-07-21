package ru.vleeplpi.domain.entities

import io.realm.kotlin.types.RealmInstant
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class Product: RealmObject {
    @PrimaryKey var _id: ObjectId = ObjectId()
    var name: String = ""
    var unitMeasurement: UnitMeasurement? = null
    var createdAt: RealmInstant = RealmInstant.now()
}