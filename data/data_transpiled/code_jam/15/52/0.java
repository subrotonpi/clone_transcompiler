static final double MAX = 1e8 ;
{
  int n = Integer . parseInt ( readLine ( ) ) ;
  int k = Integer . parseInt ( readLine ( ) ) ;
  LpProblem problem = new LpProblem ( "pname" , LpMinimize . class ) ;
  int [ ] sumi = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    sumi [ i ] = Integer . parseInt ( readLine ( ) ) ;
  }
  LpVariable [ ] xi = new LpVariable [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xi [ i ] = new LpVariable ( "x" + i , - MAX , MAX , LpVariable . Integer ) ;
  }
  LpVariable maxx = new LpVariable ( "maxx" , - MAX , MAX , LpVariable . Integer ) ;
  LpVariable minx = new LpVariable ( "minx" , - MAX , MAX , LpVariable . Integer ) ;
  problem . add ( new LpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLpLp @ @