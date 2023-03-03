public static void main ( String input ) {
  int n = input . length ( ) ;
  int m = input . length ( ) ;
  int [ ] v = new int [ n ] ;
  int [ ] d = new int [ 2 * n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int s = input . charAt ( i ) ;
    int g = input . charAt ( i + 1 ) ;
    v [ s - 1 ] += 1 << g - 1 ;
  }
  int i = 0 , j = - 1 ;
  for ( ;
  i < n * 2 * n ;
  i ++ ) {
    j ++ ;
    if ( j == n ) {
      i ++ ;
      j = 0 ;
    }
    d [ i | 1 << j ] += d [ i ] * ( i & ( 1 << j | v [ j ] ) < 1 ) ;
  }
  System . out . println ( d [ d . length - 2 ] ) ;
}
