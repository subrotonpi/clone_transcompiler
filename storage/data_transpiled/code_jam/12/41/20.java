public static void main ( int test , int input ) {
  int n = input ;
  int [ ] d = new int [ n ] ;
  int [ ] l = new int [ n ] ;
  for ( int i : xrange ( n ) ) d [ i ] = Integer . parseInt ( readLine ( ) ) ;
  int D = input ;
  int [ ] m = new int [ n ] ;
  int mp = 1 ;
  m [ 0 ] = d [ 0 ] * 2 ;
  for ( int i : xrange ( n ) ) {
    while ( mp < n && d [ mp ] <= m [ i ] ) m [ mp ++ ] = d [ mp ++ ] + Math . min ( l [ mp ++ ] , d [ mp ++ ] - d [ i ] ) ;
  }
  System . out . println ( "Case #" + ( test + 1 ) + ": " + ( max ( m ) >= D ? "YES" : "NO" ) ) ;
}
