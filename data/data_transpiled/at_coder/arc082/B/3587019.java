public static int N = Integer . parseInt ( input ) {
  int [ ] p = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i + 1 == p [ i ] ) {
      buf ++ ;
    }
    else {
      count += ( int ) ( ( buf + 1 ) / 2 ) ;
      buf = 0 ;
    }
  }
  return count ;
}
