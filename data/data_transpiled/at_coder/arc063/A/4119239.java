public static void input ( ) {
  int c = 0 ;
  char t = s [ 0 ] ;
  for ( int i = 1 ;
  i < s . length ;
  i ++ ) {
    if ( t != s [ i ] ) {
      c ++ ;
      t = s [ i ] ;
    }
  }
  System . out . println ( c ) ;
}
