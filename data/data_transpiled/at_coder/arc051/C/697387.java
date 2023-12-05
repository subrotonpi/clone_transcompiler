static final Function < String , Iterable < Integer >> F = new Function < String , Iterable < Integer >> ( ) {
  @ Override public Iterable < Integer > apply ( String input ) {
    return map ( Integer . parseInt ( input ) ) ;
  }
}
