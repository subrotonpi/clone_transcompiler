public static int [ ] getN ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    B [ i ] = Lists . newArrayList ( ) ;
  }
  int [ ] L = new int [ N ] ;
  boolean [ ] TF = new boolean [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( TF [ i ] == false ) {
      TF [ i ] = true ;
      L [ i ] = cur ;
      cur = B [ i - 1 ] ;
    }
    else {
      iden = cur ;
      break ;
    }
  }
  if ( L . length != B . length ) {
    int [ ] LOOP = new int [ N ] ;
    for ( int j = 0 ;
    j < L . length ;
    j ++ ) {
      if ( L [ j ] == cur ) {
        LOOP = Arrays . copyOfRange ( L , j , L . length ) ;
        break ;
      }
    }
    if ( Integer . MIN_VALUE <= k ) {
      System . out . println ( L [ Integer . MIN_VALUE - k ] ) ;
    }
    else {
      k = Integer . toString ( Integer . MIN_VALUE - k ) ;
      int mod = LOOP . length ;
      int ans = 0 ;
      for ( int n : map . get ( k ) ) {
        ans = ( ans * 10 + n ) % mod ;
      }
      if ( ans == 0 ) {
        System . out . println ( LOOP [ LOOP . length - 1 ] ) ;
      }
      else {
        System . out . println ( LOOP [ ans - 1 ] ) ;
      }
    }
  }
  else {
    int mod = L . length ;
    int ans = 0 ;
    for ( int n : map . get ( k ) ) {
      ans = ( 10 * ans + n ) % mod ;
    }
    if ( ans == 0 ) {
      System . out . println ( L [ L . length - 1 ] ) ;
    }
    else {
      System . out . println ( L [ ans - 1 ] ) ;
    }
  }
  return L ;
}
