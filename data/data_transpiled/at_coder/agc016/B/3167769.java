public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < Integer > a = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input ) ) ;
  }
  int sa = max ( a ) - min ( a ) ;
  if ( sa > 1 ) {
    System . out . println ( "No" ) ;
    exit ( ) ;
  }
  else if ( sa == 0 ) {
    if ( max ( a ) == n - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else if ( max ( a ) <= n / 2 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else {
    int alone = a . stream ( ) . mapToInt ( Integer :: parseInt ) . min ( ) . intValue ( ) ;
    int pair = a . stream ( ) . mapToInt ( Integer :: parseInt ) . max ( ) . intValue ( ) ;
    int ceil = alone + pair / 2 ;
    int floor = alone + 1 ;
    if ( floor <= max ( a ) && max ( a ) <= ceil ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
