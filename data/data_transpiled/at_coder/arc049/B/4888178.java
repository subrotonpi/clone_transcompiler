@ VisibleForTesting static void solve ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> info = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    info . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  }
  /* solve the ans */
  List < Integer > x = new ArrayList < > ( ) ;
  List < Integer > y = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x . add ( info . get ( i ) . get ( 0 ) - ans / info . get ( i ) . get ( 2 ) ) ;
    y . add ( info . get ( i ) . get ( 0 ) + ans / info . get ( i ) . get ( 2 ) ) ;
  }
  Collections . sort ( x ) ;
  Collections . sort ( y ) ;
  long ok = 10000000000 ;
  long ng = 0 ;
  while ( Math . abs ( ok - ng ) > 10 * ( - 6 ) ) {
    long mid = ( ok + ng ) / 2 ;
    if ( solve ( mid ) ) {
      ok = mid ;
    }
    else {
      ng = mid ;
    }
  }
  System . out . println ( mid ) ;
}
