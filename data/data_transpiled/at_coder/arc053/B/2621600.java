public static void input ( Scanner in ) {
  int [ ] cnt = new int [ 26 ] ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    cnt [ ( s . charAt ( i ) - 'a' ) & 1 ] ++ ;
  }
  int m = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < cnt . length ;
  i ++ ) {
    m = in . nextInt ( ) & 1 ;
  }
  if ( m == 0 ) {
    System . out . println ( in . nextInt ( ) ) ;
  }
  else {
    System . out . println ( ( ( in . nextInt ( ) - m ) / 2 / m ) * 2 + 1 ) ;
  }
}
