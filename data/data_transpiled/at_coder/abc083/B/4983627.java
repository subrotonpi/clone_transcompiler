public static void print ( int n , int a , int b ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    if ( a <= Integer . valueOf ( list ( Integer . toString ( i ) ) ) && b <= Integer . valueOf ( i ) ) {
      ans += i ;
    }
  }
  System . out . println ( ans ) ;
}
