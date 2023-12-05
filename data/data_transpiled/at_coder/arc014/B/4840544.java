public static String [ ] s = new String [ 3 ] ;
String [ ] k = {
  "LOSE" , "WIN" }
  ;
  for ( int i = 0 ;
  i < Integer . parseInt ( input ) ;
  i ++ ) {
    String d = input . nextLine ( ) ;
    if ( i == 0 ) {
      s [ i ] = d ;
    }
    else if ( s [ i ] . contains ( d ) || s [ s . length - 1 ] [ s . length - 1 ] != d . charAt ( 0 ) ) {
      System . out . println ( k [ i % 2 ] ) ;
      break ;
    }
    else {
      s [ i ] = d ;
    }
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
  return s ;
}
