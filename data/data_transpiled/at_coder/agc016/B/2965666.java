public static void print ( String s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] s = input . split ( " " ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l . add ( Integer . parseInt ( s [ i ] ) ) ;
  }
  Collections . sort ( l ) ;
  if ( l . get ( 0 ) == l . get ( l . size ( ) - 1 ) ) {
    if ( l . get ( 0 ) <= n / 2 || l . get ( 0 ) == n - 1 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
  else if ( l . get ( l . size ( ) - 1 ) - l . get ( 0 ) > 1 ) {
    System . out . println ( "No" ) ;
  }
  else {
    int a = l . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
    int b = l . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
    if ( a + 1 <= l . get ( l . size ( ) - 1 ) && a + b <= b / 2 ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
