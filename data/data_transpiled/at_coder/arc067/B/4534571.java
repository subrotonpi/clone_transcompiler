public static void main ( int n , int a , int b ) {
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = i ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) ans += Math . min ( a * ( x [ i + 1 ] - x [ i ] ) , b ) ;
  System . out . println ( ans ) ;
}
