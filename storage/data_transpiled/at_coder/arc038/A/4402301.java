public static void print ( int N ) {
  int L = Integer . parseInt ( input ( ) ) ;
  Collections . sort ( L ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( i % 2 == 0 ) {
      res += L [ N - i - 1 ] ;
    }
  }
  System . out . println ( res ) ;
}
