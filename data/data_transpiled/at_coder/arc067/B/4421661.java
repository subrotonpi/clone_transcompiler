public static void main ( String input , int n , int a , int b ) {
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = i ;
  int ret = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    ret += Math . min ( a * ( x [ i + 1 ] - x [ i ] ) , b ) ;
  }
  System . out . println ( ret ) ;
}
