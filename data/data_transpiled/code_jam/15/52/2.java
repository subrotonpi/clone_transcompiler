@ Pulp static public void pulp ( String ... input ) {
  int tc = Integer . parseInt ( input . trim ( ) ) ;
  for ( int t = 0 ;
  t < tc ;
  t ++ ) {
    String [ ] f = input . split ( " " ) ;
    int n = Integer . parseInt ( f [ 0 ] ) ;
    int k = Integer . parseInt ( f [ 1 ] ) ;
    int [ ] s = new int [ n ] ;
    for ( String x : input ) s [ i ] = Integer . parseInt ( x ) ;
    LpVariable [ ] var = new LpVariable [ k - 1 ] ;
    for ( int i = 0 ;
    i <= n - k ;
    i ++ ) var [ i ] = new LpVariable ( "x_" + i , Cat . Integer ) ;
    for ( int i = 0 ;
    i <= n - k ;
    i ++ ) var [ i ] = s [ i ] - sum ( var [ i - ( i + 1 ) ] ) ;
    LpProblem prob = new LpProblem ( "myProblem" , LpMinimize ) ;
    LpVariable x_max = new LpVariable ( "x_max" ) ;
    LpVariable x_min = new LpVariable ( "x_min" ) ;
    int res = x_max . subtract ( x_min ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      prob . add ( x_max . compareTo ( var [ i ] ) >= 0 ) ;
      prob . add ( x_min . compareTo ( var [ i ] ) <= 0 ) ;
    }
    prob . add ( res ) ;
    int status = prob . solve ( ) ;
    if ( status != 1 ) System . out . println ( "Case #" + ( t + 1 ) + ": IMPOSSIBLE" ) ;
    else System . out . println ( "Case #" + ( t + 1 ) + ": " + value ( res ) ) ;
  }
}
