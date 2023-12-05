public static int input ( ) {
  int [ ] A = input ( ) ;
  int [ ] D = new int [ 26 ] ;
  int ans = 0 ;
  D [ ( A [ 0 ] - ( A [ 0 ] ) ) & 1 ] = 1 ;
  for ( int i = 1 ;
  i < A . length ;
  i ++ ) {
    int a = A [ i ] ;
    ans += i + 1 - D [ ( a - ( a - ( a - 1 ) ) ) & 1 ] ;
    D [ ( a - ( a - 1 ) ) & 1 ] ++ ;
  }
  System . out . println ( ans + 1 ) ;
  return ans ;
}
