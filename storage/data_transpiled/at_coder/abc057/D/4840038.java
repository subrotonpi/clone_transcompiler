public static long fuct ( @ Nonnegative int n ) {
  if ( n <= 1 ) {
    return 1 ;
  }
  else {
    return n * fuct ( n - 1 ) ;
  }
  /* main program */
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > v = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    v . add ( i ) ;
  }
  Collections . sort ( v , Collections . reverseOrder ( ) ) ;
  System . out . println ( sum ( v , 0 , a ) / a ) ;
  long res = 0 ;
  if ( v . get ( 0 ) == v . get ( a - 1 ) ) {
    int vn = v . stream ( ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
    for ( int r = a ;
    r <= b ;
    r ++ ) {
      res += fuct ( vn ) / ( fuct ( vn - r ) * fuct ( r ) ) ;
    }
  }
  else {
    int vn = v . stream ( ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
    int r = v . stream ( ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
    res += fuct ( vn ) / ( fuct ( vn - r ) * fuct ( r ) ) ;
  }
  System . out . println ( res ) ;
  if ( getClass ( ) . isAnonymousClass ( ) ) {
    System . out . println ( "main program" ) ;
  }
  return res ;
}
