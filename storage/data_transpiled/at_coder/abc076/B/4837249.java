public static void print ( int N ) {
  int K = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ans < K ) {
      ans *= 2 ;
    }
    else {
      ans += K ;
    }
  }
  System . out . println ( ans ) ;
}
