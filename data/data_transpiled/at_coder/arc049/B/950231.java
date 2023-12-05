@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> resolve = new ArrayList < > ( ) ;
  for ( int x = 0 ;
  x < n ;
  x ++ ) resolve . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  long maxtime = 0 ;
  for ( Iterator < Integer > iter = resolve . iterator ( ) ;
  iter . hasNext ( ) ;
  ) {
    int x1 = iter . next ( ) ;
    int y1 = iter . next ( ) ;
    int c1 = iter . next ( ) ;
    int x2 = iter . next ( ) ;
    int y2 = iter . next ( ) ;
    int c2 = iter . next ( ) ;
    maxtime = Math . max ( maxtime , c1 * Math . max ( Math . abs ( x1 - x ) , Math . abs ( y1 - y ) ) ) ;
  }
  System . out . println ( maxtime ) ;
  return resolve ;
}
