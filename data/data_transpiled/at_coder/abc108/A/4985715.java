public static int K = Integer . parseInt ( input ) {
  int gu = 0 ;
  int ki = 0 ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      gu ++ ;
    }
    else {
      ki ++ ;
    }
  }
  return ( ki * gu ) ;
}
