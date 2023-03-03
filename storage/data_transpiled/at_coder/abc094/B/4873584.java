static int n ( int m , int x ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = i ;
  final int l = Arrays . binarySearch ( a , x ) ;
  System . out . println ( min ( l , m - l ) ) ;
  return l ;
}
