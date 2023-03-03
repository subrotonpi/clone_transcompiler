public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] h = Lists . newArrayList ( Integer . parseInt ( input ) ) . toArray ( ) ;
  int [ ] f_h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    f_h [ i ] = 0 ;
  }
  boolean [ ] judge = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    judge [ i ] = f_h [ i ] != h [ i ] ? false : true ;
  }
  int ct = 0 ;
  while ( false == judge [ 0 ] ) {
    int flg = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( judge [ i ] == false ) {
        if ( i == N - 1 ) {
          f_h [ i ] ++ ;
          ct ++ ;
          if ( f_h [ i ] == h [ i ] ) judge [ i ] = true ;
        }
        else {
          flg = 1 ;
          f_h [ i ] ++ ;
          if ( f_h [ i ] == h [ i ] ) judge [ i ] = true ;
        }
      }
    }
    else {
      if ( flg == 1 ) {
        ct ++ ;
        flg = 0 ;
      }
      else {
      }
    }
  }
  System . out . println ( ct ) ;
}
