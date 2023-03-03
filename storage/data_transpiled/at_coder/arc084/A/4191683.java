static final int [ ] binarySearch ( int n ) {
  int [ ] a = new int [ n ] ;
  int [ ] b = new int [ n ] ;
  int [ ] c = new int [ n ] ;
  Arrays . sort ( a ) ;
  Arrays . sort ( b ) ;
  Arrays . sort ( c ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += binarySearch ( a , b [ i ] ) * ( n - binarySearch ( c , b [ i ] ) ) ;
  }
  System . out . println ( ans ) ;
  return a ;
}
