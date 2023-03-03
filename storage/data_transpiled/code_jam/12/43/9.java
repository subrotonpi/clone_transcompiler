@ Sys public static void main ( String [ ] args ) {
  final int ntest = input . nextInt ( ) ;
  for ( int test = 0 ;
  test < ntest ;
  test ++ ) {
    final int n = input . nextInt ( ) ;
    final int [ ] x = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) x [ i ] = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    final int [ ] y = new int [ n ] ;
    final boolean [ ] fixed = new boolean [ n ] ;
    boolean possible = true ;
    for ( int i : xrange ( n - 1 ) ) {
      fixed [ x [ i ] ] = true ;
      if ( true == fixed [ i + 1 ] ) {
        possible = false ;
        break ;
      }
      for ( int j : xrange ( i + 1 , x [ i ] ) ) y [ j ] = y [ j ] - x [ i ] + j ;
    }
    Arrays . sort ( y ) ;
    final String result = possible ? StringUtil . join ( y , " " ) : "Impossible" ;
    System . out . println ( "Case #" + ( test + 1 ) + ": " + result ) ;
  }
}
