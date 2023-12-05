public static int K = Integer . parseInt ( input ) {
  int [ ] ans ;
  if ( K % 2 == 0 ) {
    ans = new int [ N ] ;
    ans [ 0 ] = K / 2 ;
    ans [ 1 ] = K ;
  }
  else {
    ans = new int [ N ] ;
    ans [ 0 ] = ( K + 1 ) / 2 ;
  }
  return ans [ N ] ;
}
