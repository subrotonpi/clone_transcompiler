public static int N ( ) {
  int ans = 0 ;
  for ( int A : map . values ( ) ) {
    while ( A % 2 == 0 ) {
      A /= 2 ;
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
