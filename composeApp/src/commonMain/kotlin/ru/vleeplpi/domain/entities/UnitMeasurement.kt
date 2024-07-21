package ru.vleeplpi.domain.entities

import io.realm.kotlin.ext.realmListOf
import io.realm.kotlin.types.RealmList
import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.ObjectId

class UnitMeasurement: RealmObject {
    @PrimaryKey var _id: ObjectId = ObjectId()
    var name : String = ""
    var valueByUnit: Double = 0.0
    var products: RealmList<Product> = realmListOf()

}