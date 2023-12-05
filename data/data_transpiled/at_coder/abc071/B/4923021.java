public static void input ( ) {
  s = input ( ) ;
  int [ ] is_inS = new int [ 26 ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    is_inS [ ( s . charAt ( i ) - 97 ) ] = 1 ;
  }
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( is_inS [ i ] == 0 ) {
      System . out . println ( ( char ) ( i + 97 ) ) ;
      exit ( ) ;
    }
  }
  System . out . println ( "None" ) ;
}
