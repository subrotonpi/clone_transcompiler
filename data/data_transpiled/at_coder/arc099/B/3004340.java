static final Function < Integer , List < Integer >> s = new Function < Integer , List < Integer >> ( ) {
  @ Override public List < Integer > apply ( Integer n ) {
    return Ints . asList ( Integer . parseInt ( String . valueOf ( n ) ) ) ;
  }
}
