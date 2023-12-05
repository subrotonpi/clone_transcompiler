public static void main ( String input ) {
  int k = Integer . parseInt ( input ) ;
  int n = 50 ;
  int p = k / n ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = i + p ;
  }
  int m = k % n ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    a [ i ] += n ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i != j ) a [ j ] -- ;
    }
  }
  System . out . println ( n ) ;
  System . out . println ( a ) ;
}
