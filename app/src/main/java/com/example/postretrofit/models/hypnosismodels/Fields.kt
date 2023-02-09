package com.example.postretrofit.models.hypnosismodels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import javax.annotation.Generated

@Generated("jsonschema2pojo")
class Fields {
    @SerializedName("instructionTitle")
    @Expose
    var instructionTitle: InstructionTitle? = null

    @SerializedName("videoThumbnail")
    @Expose
    var videoThumbnail: VideoThumbnail? = null

    @SerializedName("courseName")
    @Expose
    var courseName: CourseName? = null

    @SerializedName("isFree")
    @Expose
    var isFree: IsFree? = null

    @SerializedName("videoDescription")
    @Expose
    var videoDescription: VideoDescription? = null

    @SerializedName("length")
    @Expose
    var length: Length? = null

    @SerializedName("link")
    @Expose
    var link: Link? = null

    @SerializedName("name")
    @Expose
    var name: Name? = null

    @SerializedName("Time")
    @Expose
    var time: Time? = null

    @SerializedName("instructionDescription")
    @Expose
    var instructionDescription: InstructionDescription? = null

    @SerializedName("ID")
    @Expose
    var id: Id? = null

    @SerializedName("courseID")
    @Expose
    var courseID: CourseID? = null

    @SerializedName("isVideo")
    @Expose
    var isVideo: IsVideo? = null

    @SerializedName("tagline")
    @Expose
    var tagline: Tagline? = null

    @SerializedName("Tag")
    @Expose
    var tag: Tag? = null

    @SerializedName("pdf")
    @Expose
    var pdf: Pdf? = null
}