@ Pulp static public void pulse ( String ... input ) {
  int tc = Integer . parseInt ( input . trim ( ) ) ;
  for ( int t = 0 ;
  t < tc ;
  t ++ ) {
    String [ ] f = input . split ( " " ) ;
    int n = Integer . parseInt ( f [ 0 ] ) ;
    float v = Float . parseFloat ( f [ 1 ] ) ;
    float x = Float . parseFloat ( f [ 2 ] ) ;
    LpVariable [ ] m = n * new LpVariable [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      m [ i ] = new LpVariable ( "" + i , 0 ) ;
    }
    LpVariable [ ] var = new LpVariable [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      var [ i ] = new LpVariable ( "" + i , 0 ) ;
    }
    LpVariable res = new LpVariable ( "r" , 0 ) ;
    LpProblem prob = new LpProblem ( "myProblem" , LpMinimize . class ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      prob . add ( res >= var [ i ] ) ;
    }
    prob . add ( lpSum ( m [ i ] . x * var [ i ] ) == v ) ;
    prob . add ( lpSum ( m [ i ] . x * m [ i ] . y / v * var [ i ] ) == x ) ;
    prob . add ( res ) ;
    int status = prob . solve ( ) ;
    if ( status != 1 ) {
      System . out . println ( "Case #" + ( t + 1 ) + ": IMPOSSIBLE" ) ;
    }
    else {
      System . out . printf ( "Case #" + ( t + 1 ) + ": %0.8f%n" , value ( res ) ) ;
    }
  }
}
