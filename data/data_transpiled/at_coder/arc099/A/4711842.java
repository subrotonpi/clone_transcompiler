public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  int p = K ;
  int ans = 1 ;
  do {
    if ( p >= N ) break ;
    p += K - 1 ;
    ans ++ ;
  }
  while ( true ) ;
  return ans ;
}
