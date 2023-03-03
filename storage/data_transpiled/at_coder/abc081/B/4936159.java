public static void input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int cau = 0 ;
  boolean flag = true ;
  while ( flag ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( A [ i ] % 2 == 1 ) {
        flag = false ;
        break ;
      }
    }
    if ( flag ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        A [ i ] = A [ i ] / 2 ;
      }
      cau ++ ;
    }
  }
  System . out . println ( cau ) ;
}
