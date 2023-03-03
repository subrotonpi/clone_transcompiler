public static int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] dp = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) dp [ i ] = 1 ;
  int [ ] c = new int [ n + 1 ] ;
  c [ 0 ] = - 1 ;
  Map < Integer , Integer > map = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    c [ i ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    if ( map . containsKey ( c [ i ] ) ) {
      int j = map . get ( c [ i ] ) ;
      map . put ( c [ i ] , i ) ;
      if ( c [ i - 1 ] != c [ i ] ) {
        dp [ i ] = dp [ i - 1 ] + dp [ j ] ;
        continue ;
      }
    }
    else {
      dp [ i ] = i ;
    }
    dp [ i ] = dp [ i - 1 ] ;
  }
  return dp ;
}
