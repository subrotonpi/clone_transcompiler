public static List < Integer > read ( Function < String , Integer > parse ) {
  return read ( new Scanner ( System . in ) ) ;
  /*solve the number of times in the input*/
  int B = read ( Integer . MAX_VALUE ) ;
  int N = read ( Integer . MAX_VALUE ) ;
  int [ ] ar = read ( Integer . MAX_VALUE ) ;
  if ( N <= B ) {
    return N ;
  }
  /*count the number of times in the input*/
  int lo = 0 ;
  int hi = N * Math . min ( ar . length , ar . length ) ;
  while ( lo < hi ) {
    int mid = ( lo + hi ) / 2 ;
    if ( count ( mid ) >= N - B ) {
      hi = mid ;
    }
    else {
      lo = mid + 1 ;
    }
  }
  int place = ( N - B ) - count ( lo - 1 ) ;
  List < Integer > list = new ArrayList < > ( B ) ;
  for ( int x = 0 ;
  x < ar . length ;
  x ++ ) {
    if ( lo % ar [ x ] == 0 ) {
      list . add ( x ) ;
    }
  }
  /*solve the list */
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . printf ( "Case #%d: %d%n" , t , solve ( ) ) ;
  }
  return list ;
}
