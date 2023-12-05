public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int bColor = - 1 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( bColor == a [ i ] ) {
      count ++ ;
      bColor = - 1 ;
      continue ;
    }
    bColor = a [ i ] ;
  }
  System . out . println ( count ) ;
}
