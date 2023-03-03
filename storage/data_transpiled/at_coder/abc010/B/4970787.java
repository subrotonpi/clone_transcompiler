public static int n ( ) {
  int ans = 0 ;
  for ( int a : map . values ( ) ) {
    while ( a % 2 == 0 || a % 3 == 2 ) {
      ans ++ ;
      a -- ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
