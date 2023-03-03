public static void trib ( int n ) {
  int a = 0 , b = 0 , c = 1 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    a = b ++ ;
    b = c ++ ;
  }
  System . out . println ( a ) ;
}
