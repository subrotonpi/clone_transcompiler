public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  int aMax = Collections . max ( a ) ;
  int aMin = Collections . min ( a ) ;
  if ( aMax > aMin + 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  int k = aMax ;
  if ( aMax == aMin ) {
    if ( k == n - 1 || 2 * k <= n ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    int uni = a . stream ( ) . mapToInt ( k - 1 ) . sum ( ) ;
    if ( k >= uni + 1 && k <= uni + ( n - uni ) / 2 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
