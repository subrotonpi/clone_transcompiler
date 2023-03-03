public static double getDoubleDouble ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = - 1 ;
  double [ ] X = new double [ n ] ;
  double [ ] Y = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    X [ i ] = null ;
    Y [ i ] = null ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n ;
    j ++ ) {
      if ( ( ans < ( ( X [ j ] - X [ i ] ) * ( X [ j ] - X [ i ] ) + ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( X [ j ] - X [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) * ( Y [ j ] - Y [ i ] ) ) ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
