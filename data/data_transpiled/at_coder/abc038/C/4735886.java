public static void print ( int n ) {
  int [ ] A = list ( Integer . parseInt ( input ( ) ) ) ;
  int res = 1 ;
  int tmp = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( A [ i ] > A [ i - 1 ] ) {
      tmp ++ ;
      res += tmp ;
    }
    else {
      tmp = 1 ;
      res += tmp ;
    }
  }
  System . out . println ( res ) ;
}
