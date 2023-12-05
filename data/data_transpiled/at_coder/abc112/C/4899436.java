@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> xyh = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xyh . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  Collections . sort ( xyh , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( xyh . get ( 0 ) , Collections . reverseOrder ( ) ) ;
  return xyh ;
}
