public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int color = 0 ;
  int num = 1 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a [ i ] == color ) {
      num ++ ;
    }
    else {
      color = a [ i ] ;
      if ( num >= 2 ) {
        count += num / 2 ;
      }
    }
  }
  System . out . println ( count ) ;
}
