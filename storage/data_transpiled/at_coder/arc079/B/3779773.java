public static int [ ] K = Integer . parseInt ( input ) {
  int i = K / 50 ;
  int j = K % 50 ;
  int [ ] ans = new int [ 50 ] ;
  for ( int k = 0 ;
  k < j ;
  k ++ ) ans [ k ] = 100 + i - j ;
  for ( int k = 0 ;
  k < 50 - j ;
  k ++ ) ans [ k ] = 50 + i - 1 - j ;
  System . out . println ( 50 ) ;
  return ans ;
}
