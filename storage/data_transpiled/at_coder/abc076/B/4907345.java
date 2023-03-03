public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( k >= ans ) {
      ans *= 2 ;
    }
    else {
      ans += k ;
    }
  }
  System . out . println ( ans ) ;
}
