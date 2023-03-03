static final int solve ( ) {
  psyco . full ( ) ;
  final int INF = 2 * 30 ;
  int M ;
  int res ;
  int M = 0 ;
  int V = 0 ;
  {
    int l ;
    if ( ( l = input . nextInt ( ) ) >= INF ) return memo . get ( ( l = input . nextInt ( ) ) ) ;
    res = calc ( nodes , 1 , V , memo ) ;
    if ( ( l = input . nextInt ( ) ) < INF ) res = String . valueOf ( l ) ;
    else res = "IMPOSSIBLE" ;
    System . out . format ( "Case #%d: %s" , ( M + 1 ) , res ) ;
  }
  solve ( ) ;
  if ( nodes [ u ] [ 1 ] == 'AND' ) {
    if ( V == 1 ) res = calc ( nodes , u * 2 , 1 , memo ) + calc ( nodes , u * 2 + 1 , 1 , memo ) ;
    else res = Math . min ( calc ( nodes , u * 2 , 0 , memo ) , calc ( nodes , u * 2 + 1 , 0 , memo ) ) ;
  }
  else {
    if ( V == 1 ) res = Math . min ( calc ( nodes , u * 2 , 1 , memo ) , calc ( nodes , u * 2 + 1 , 1 , memo ) ) ;
    else res = Math . min ( calc ( nodes , u * 2 , 0 , memo ) , calc ( nodes , u * 2 + 1 , 0 , memo ) ) ;
  }
  int res2 = INF ;
  if ( nodes [ u ] [ 0 ] == 1 ) {
    if ( nodes [ u ] [ 1 ] == 'OR' ) {
      if ( V == 1 ) res2 = 1 + calc ( nodes , u * 2 , 1 , memo ) + calc ( nodes , u * 2 + 1 , 1 , memo ) ;
      else res2 = 1 + Math . min ( calc ( nodes , u * 2 , 0 , memo ) , calc ( nodes , u * 2 + 1 , 0 , memo ) ) ;
    }
  }
  else {
    if ( V == 1 ) res2 = 1 + Math . min ( calc ( nodes , u * 2 , 1 , memo ) , calc ( nodes , u * 2 , 0 , memo ) ) ;
    else res2 = 1 + Math . min ( calc ( nodes , u * 2 , 0 , memo ) , calc ( nodes , u * 2 + 1 , 0 , memo ) ) ;
    