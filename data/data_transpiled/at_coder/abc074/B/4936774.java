public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) x [ i ] = Integer . parseInt ( input ( ) ) ;
  int s = 0 ;
  for ( int x_ : x ) s += ( Math . min ( x_ , Math . abs ( k - x_ ) ) * 2 ) ;
  System . out . println ( s ) ;
}
