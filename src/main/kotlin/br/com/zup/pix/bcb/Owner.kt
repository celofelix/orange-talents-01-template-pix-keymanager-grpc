package br.com.zup.pix.bcb

data class Owner(
    val type: OwnerType = OwnerType.NATURAL_PERSON,
    val name: String,
    val taxIdNumber: String
) {
    enum class OwnerType {
        NATURAL_PERSON
    }
}