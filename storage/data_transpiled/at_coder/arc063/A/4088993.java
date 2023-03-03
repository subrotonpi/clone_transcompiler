public static void input ( ) {
  s = input ( ) ;
  int [ ] stones = new int [ s . length ] ;
  for ( int i = 0 ;
  i < stones . length ;
  i ++ ) {
    stones [ i ] = 1 if ( s [ i ] == 'W' ) {
    }
  }
  int cnt = 0 ;
  for ( int a = 0 ;
  a < stones . length ;
  a ++ ) {
    if ( stones [ a ] ^ stones [ b ] ) {
      cnt ++ ;
    }
  }
  System . out . println ( cnt ) ;
}
