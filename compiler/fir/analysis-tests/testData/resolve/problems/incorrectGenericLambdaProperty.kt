fun main(args: Array<String>) {
    val <!LOCAL_VARIABLE_WITH_TYPE_PARAMETERS!><T><!> passIt = { <!COMPONENT_FUNCTION_MISSING, VALUE_PARAMETER_WITH_NO_TYPE_ANNOTATION!>(t: <!UNRESOLVED_REFERENCE!>T<!>)<!> -> t }
    <!INAPPLICABLE_CANDIDATE, NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>passIt<!><Int>(1)
    <!NEW_INFERENCE_NO_INFORMATION_FOR_PARAMETER!>passIt<!>(1)
}
