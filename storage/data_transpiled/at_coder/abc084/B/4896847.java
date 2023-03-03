public static void main ( String input ) {
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  String s = input . substring ( a , b ) ;
  if ( s . charAt ( a ) != '-' ) {
    System . out . println ( "No" ) ;
  }
  else {
    boolean found = true ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( i != a && ! Character . isDigit ( s . charAt ( i ) ) ) {
        found = false ;
      }
    }
    if ( found ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
  }
}
