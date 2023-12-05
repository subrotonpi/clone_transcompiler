public static int [ ] [ ] getNegativeInstances ( ) {
  int [ ] s = new int [ 2 ] ;
  if ( s [ 0 ] == s [ 1 ] ) {
    System . out . println ( 1 + " " + 2 ) ;
    exit ( ) ;
  }
  for ( int i = 2 ;
  i < s . length ;
  i ++ ) {
    if ( s [ i ] == s [ i - 1 ] || s [ i ] == s [ i - 2 ] ) {
      System . out . println ( i - 1 + " " + i + 1 ) ;
      break ;
    }
  }
  else {
    System . out . println ( - 1 + " " + - 1 ) ;
  }
  return s ;
}
