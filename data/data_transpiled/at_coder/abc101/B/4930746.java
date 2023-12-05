public static void input ( ) {
  int sum = 0 ;
  for ( int i = 0 ;
  i < n . length ;
  i ++ ) {
    sum += ( int ) n [ i ] ;
  }
  System . out . println ( ( int ) n % sum == 0 ? "Yes" : "No" ) ;
}
