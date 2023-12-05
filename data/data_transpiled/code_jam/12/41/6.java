@ Sys public static void main ( ) throws IOException {
  final int ntest = input . nextInt ( ) ;
  for ( int test = 0 ;
  test < ntest ;
  test ++ ) {
    final int n = input . nextInt ( ) ;
    final int [ ] d = new int [ n ] ;
    final int [ ] l = new int [ n ] ;
    final int [ ] maxlen = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final String [ ] line = input . nextLine ( ) . split ( " " ) ;
      d [ i ] = Integer . parseInt ( line [ 0 ] ) ;
      l [ i ] = Integer . parseInt ( line [ 1 ] ) ;
    }
    final int D = input . nextInt ( ) ;
    boolean success = false ;
    maxlen [ 0 ] = d [ 0 ] ;
    for ( int i : xrange ( n ) ) {
      maxlen [ i ] = Math . min ( l [ i ] , maxlen [ i ] ) ;
      if ( maxlen [ i ] >= D - d [ i ] ) {
        success = true ;
        break ;
      }
      int j = i + 1 ;
      while ( ( j < n ) && ( maxlen [ i ] >= d [ j ] - d [ i ] ) ) {
        maxlen [ j ] = Math . max ( maxlen [ j ] , d [ j ] - d [ i ] ) ;
        j = j + 1 ;
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + ( success ? "YES" : "NO" ) ) ;
  }
}
