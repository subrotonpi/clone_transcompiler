public static void main ( String input , int n , int a , int b ) {
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = Integer . parseInt ( input ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ans += Math . min ( ( x [ i + 1 ] - x [ i ] ) * a , b ) ;
  }
  System . out . println ( ans ) ;
}
