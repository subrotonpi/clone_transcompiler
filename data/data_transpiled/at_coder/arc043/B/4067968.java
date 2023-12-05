static final int [ ] binarySearch ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    d [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( d ) ;
  int m = 10 * 9 + 7 ;
  int [ ] third = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    third [ i ] = n - binarySearch ( d , d [ i ] * 2 ) ;
  }
  int [ ] sthird = new int [ n + 1 ] ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    sthird [ i ] = ( sthird [ i + 1 ] + third [ i ] ) % m ;
  }
  int [ ] second = new int [ n ] ;
  for ( int i = n ;
  i >= 0 ;
  i -- ) {
    second [ i ] = ( Ssecond [ i + 1 ] + second [ i ] ) % m ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    res = ( res + first [ i ] ) % m ;
  }
  System . out . println ( res ) ;
  return second ;
}
