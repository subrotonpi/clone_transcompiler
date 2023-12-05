public static int N ( ) {
  int ans = 0 ;
  int i = 0 ;
  while ( i * i <= N ) {
    ans = i * i ;
    i ++ ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
