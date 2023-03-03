public static void print ( int n ) {
  int i ;
  n = input . nextInt ( ) ;
  if ( n == 3 ) System . out . println ( 2 + 3 + 25 ) ;
  else if ( n < 15003 ) {
    System . out . print ( 3 + 9 + " " ) ;
    if ( n % 3 != 0 ) {
      for ( i = 1 ;
      i < n - 1 ;
      i ++ ) System . out . print ( 2 * i + " " ) ;
    }
    else {
      System . out . print ( 2 + 4 + " " ) ;
      for ( i = 4 ;
      i < n ;
      i ++ ) System . out . print ( 2 * i + " " ) ;
    }
  }
  else {
    for ( i = 2 ;
    i < 30000 ;
    i += 2 ) System . out . print ( i + " " ) ;
    if ( n % 2 != 0 ) {
      for ( i = 0 ;
      i < n - 14999 ;
      i ++ ) System . out . print ( 6 * i + 3 + " " ) ;
    }
    else {
      System . out . print ( 30000 + " " ) ;
      for ( i = 0 ;
      i < n - 15000 ;
      i ++ ) System . out . print ( 6 * i + 3 + " " ) ;
    }
  }
}
