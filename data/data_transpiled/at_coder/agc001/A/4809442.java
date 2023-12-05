public static void print ( int N ) {
  int L = Integer . parseInt ( input ( ) ) ;
  Collections . sort ( L ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    count += L [ 2 * i ] ;
  }
  System . out . println ( count ) ;
}
