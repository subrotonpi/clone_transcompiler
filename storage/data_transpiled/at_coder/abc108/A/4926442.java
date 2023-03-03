public static int K = Integer . parseInt ( input ) {
  int [ ] even = new int [ K + 1 ] ;
  int [ ] odd = new int [ K + 1 ] ;
  for ( int i = 1 ;
  i <= K ;
  i ++ ) {
    if ( i % 2 == 0 ) even [ i ] = i ;
    else odd [ i ] = i ;
  }
  return even . length * odd . length ;
}
