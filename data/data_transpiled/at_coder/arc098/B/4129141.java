public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int r = 0 ;
  int tmp = 0 ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    while ( r < N && ( tmp & A [ r ] ) == 0 ) {
      tmp += A [ r ] ;
      r ++ ;
    }
    tmp -= A [ l ] ;
    ans += r - l ;
  }
  System . out . println ( ans ) ;
}
