static final void solve ( int n , int [ ] models ) {
  final Model m = new Model ( "fashion" ) ;
  m . setParam ( "OutputFlag" , 0 ) ;
  final HashMap < Integer , Integer > xVar = new HashMap < Integer , Integer > ( ) ;
  final HashMap < Integer , Integer > pVar = new HashMap < Integer , Integer > ( ) ;
  final HashMap < Integer , Integer > oVar = new HashMap < Integer , Integer > ( ) ;
  for ( int c = 1 ;
  c <= n ;
  c ++ ) {
    for ( int r = 1 ;
    r <= n ;
    r ++ ) {
      xVar . put ( ( Integer ) r , m . addVar ( new Double ( r ) , modelsOut . size ( ) ) ) ;
      models . clear ( ) ;
      for ( int j = 1 ;
      j <= m . size ( ) ;
      j ++ ) {
        int t = Integer . parseInt ( input . nextLine ( ) ) ;
        int r = Integer . parseInt ( input . nextLine ( ) ) ;
        int c = Integer . parseInt ( input . nextLine ( ) ) ;
        models . add ( new Integer ( t ) ) ;
        models . add ( new Integer ( r ) ) ;
        models . add ( new Integer ( r ) ) ;
        models . add ( new Integer ( c ) ) ;
      }
      int [ ] result = solve ( n , models ) ;
      System . out . println ( "Case #" + i + ": " + result [ 0 ] + " " + result [ 1 ] ) ;
      for ( int j = 2 ;
      j <= result . length ;
      j ++ ) {
        int el = result [ j ] ;
        System . out . println ( "" + el [ 0 ] + " " + el [ 1 ] + " " + el [ 2 ] ) ;
      }
    }
  }
  m . update ( ) ;
  for ( int c = 1 ;
  c <= n ;
  c ++ ) {
    m . addConstr ( quicksum ( oVar . get ( ( Integer ) r ) + xVar . get ( ( Integer ) r ) ) <= 1 ) ;
  }
  for ( int c = 1 ;
  c <= n ;
  c ++ ) {
    m . addConstr ( quicksum ( oVar . get ( ( Integer ) r ) + pVar . get ( ( Integer ) r ) + pVar . get ( ( Integer ) r ) ) <= 1 ) ;
  }
  for ( int d = 0 ;
  d <= n ;
  