public static int [ ] getPrime ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = 0 ;
  List < Integer > ans = new ArrayList < Integer > ( ) ;
  /* prime */
  int j = 2 ;
  while ( j * j <= n ) {
    if ( j % j == 0 ) {
      return false ;
    }
    j ++ ;
  }
  for ( int i = 6 ;
  i < 55556 ;
  i += 5 ) {
    if ( k == n ) {
      ans . add ( i ) ;
      k ++ ;
    }
  }
  return ans . toArray ( ) ;
}
