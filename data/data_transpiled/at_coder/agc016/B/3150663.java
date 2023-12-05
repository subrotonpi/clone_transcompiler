public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  int Min = Collections . min ( a ) ;
  int Max = Collections . max ( a ) ;
  if ( Max - Min > 1 ) {
    System . out . println ( "No" ) ;
  }
  else if ( Max == Min ) {
    if ( a . get ( 0 ) == n - 1 || a . get ( 0 ) <= n / 2 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    int c_M = a . stream ( ) . mapToInt ( Max :: intValue ) . sum ( ) ;
    int c_M = n - c_M ;
    if ( c_M < Max && Max <= c_M + c_M / 2 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
