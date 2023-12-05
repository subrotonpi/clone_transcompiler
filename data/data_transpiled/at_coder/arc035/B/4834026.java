static final int [ ] getDigits ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] L = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( L ) ;
  Arrays . fill ( L , 0 ) ;
  int cnt = 1 ;
  int ans = 1 ;
  long [ ] time = new long [ N + 1 ] ;
  time [ 0 ] = L [ 0 ] ;
  int cur = L [ 0 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( L [ i ] == cur ) {
      cnt ++ ;
    }
    else {
      ans *= Math . factorial ( cnt ) ;
      ans %= ( 10 * 9 + 7 ) ;
      cur = L [ i ] ;
      cnt = 1 ;
    }
    if ( i != N ) {
      time [ i ] = time [ i - 1 ] + L [ i ] ;
    }
  }
  System . out . println ( Arrays . toString ( time ) ) ;
  System . out . println ( ans ) ;
  return time ;
}
