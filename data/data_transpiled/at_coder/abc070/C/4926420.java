static final int [ ] gcd ( int n ) {
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = t [ 0 ] ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    ans = ans * t [ i ] / gcd ( ans , t [ i ] ) ;
  }
  System . out . println ( ans ) ;
}
