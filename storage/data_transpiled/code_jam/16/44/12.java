static final int solve ( ) {
  final int n = Integer . parseInt ( System . in ) ;
  final int [ ] [ ] c = new int [ n ] [ n ] ;
  boolean verbose = false ;
  {
    int n = Integer . parseInt ( System . in ) ;
    c [ 0 ] [ 0 ] = Integer . parseInt ( System . in ) ;
    for ( int u = 0 ;
    u < n ;
    u ++ ) c [ u ] [ 0 ] = Integer . parseInt ( System . in ) ;
  }
  {
    int processes = Integer . parseInt ( System . in ) ;
    for ( int i = 0 ;
    i < processes ;
    i ++ ) {
      processes = Integer . parseInt ( System . in ) ;
    }
    {
      int n = Integer . parseInt ( System . in ) ;
      int [ ] [ ] cc = new int [ n ] [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) cc [ i ] [ j ] = s [ i * n + j ] ;
      if ( ArrayUtils . contains ( cc [ i ] [ j ] , c [ i ] [ j ] ) ) continue ;
      if ( sum ( cc [ i ] [ j ] ) >= sol ) continue ;
    }
  }
  boolean good = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    LpProblem prob = new LpProblem ( "myProblem" , LpMaximize ) ;
    LpVariable f = new LpVariable ( "f_" + j + "_" + k , LpVariable . lowBound , 0 , ( k == i ? 0 : Math . min ( cc [ k ] [ j ] , cc [ i ] [ j ] ) ) , "cat_Integer" ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) prob . setObjective ( new LpAffineExpression ( new LpAffineExpression ( f . value ( ) , 1 ) ) ) ;
    LpStatus status = prob . solve ( ) ;
    assert LpStatus . get ( status ) == LpStatus . Optimal ;
    int flow = ( int ) Math . pow ( sol , n ) ;
    if ( sol > 0 ) {
      System . err . println ( "solution for " + i + " " + flow ) ;
    }
  }
  int res = sol - sum ( c [ i ] [ j ] ) ;
  if ( verbose ) {
    System . err . println ( res ) ;
  }
  return res ;
}
