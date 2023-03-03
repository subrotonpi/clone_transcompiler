@ VisibleForTesting static Iterable < String > combinations ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > ls = Arrays . asList ( "a" , "b" , "c" ) ;
  for ( String s : ls ) {
    System . out . println ( StringUtils . join ( s , "" ) ) ;
  }
  return ls ;
}
