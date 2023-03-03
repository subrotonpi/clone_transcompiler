public static void print ( int n , int l ) {
  int [ ] arr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) arr [ i ] = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( arr ) ;
  int ans = n ;
  ans += ( int ) ( ( l - sum ( arr ) ) / arr [ 0 ] ) ;
  System . out . println ( ans ) ;
}
