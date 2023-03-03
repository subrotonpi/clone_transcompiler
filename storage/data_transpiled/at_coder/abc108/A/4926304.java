public static int K = Integer . parseInt ( input ) {
  int [ ] odd = new int [ K ] ;
  int [ ] even = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( i % 2 == 0 ) even [ i ] = i ;
    else odd [ i ] = i ;
  }
  return even . length * odd . length ;
}
