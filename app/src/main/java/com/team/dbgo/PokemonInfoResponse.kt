package com.team.dbgo

data class PokemonInfoResponse (
        var name : String,
        var cp : Int,
        var hp : Int,
        var weight : Int,
        var height : Int,
        var level : Int,
        var catched_at : String,
        var normal_attack_name : String,
        var specail_attack_name : String
)