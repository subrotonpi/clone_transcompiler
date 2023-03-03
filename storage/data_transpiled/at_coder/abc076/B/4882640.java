public static void print ( int N ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int a = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( a < K ) {
      a *= 2 ;
    }
    else {
      a += K ;
    }
  }
  System . out . println ( a ) ;
}
