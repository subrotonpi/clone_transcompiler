public static boolean inside ( int u , int v , List < Integer > polygon ) {
  if ( polygon . contains ( u ) && polygon . contains ( v ) ) return true ;
  else return false ;
  /* cut polygon */
  int ui = polygon . indexOf ( u ) ;
  int vi = polygon . indexOf ( v ) ;
  if ( ui > vi ) {
    int tmp = u ;
    int tmpi = ui ;
    u = v ;
    ui = vi ;
    v = tmp ;
    vi = tmpi ;
  }
  int [ ] p1 = new int [ vi + 1 ] ;
  int [ ] p2 = new int [ vi + 1 ] ;
  System . arraycopy ( polygon . toArray ( ) , 0 , p1 , 0 , vi ) ;
  System . arraycopy ( polygon . toArray ( ) , 0 , p2 , 0 , vi ) ;
  /* print the colors */
  for ( int color : colorList ) {
    System . out . println ( color + 1 + ":" ) ;
  }
  System . out . println ( ) ;
  int T = input . nextInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] Us = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] Vs = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] polygon = new int [ N + 1 ] ;
    List < int [ ] > polygons = new ArrayList < int [ ] > ( ) ;
    polygons . add ( polygon ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int u = Us [ i ] ;
      int v = Vs [ i ] ;
      for ( int j = 0 ;
      j < polygons . size ( ) ;
      j ++ ) {
        if ( inside ( u , v , polygons . get ( j ) ) ) {
          int [ ] p1 = cut ( polygons . get ( j ) , u , v ) ;
          int [ ] p2 = cut ( polygons . get ( j ) , u , v ) ;
          polygons . remove ( j ) ;
          polygons . add ( p1 ) ;
          polygons . add ( p2 ) ;
          break ;
        }
      }
    }
    int maxPoint = Math . max ( ArrayUtil . size ( polygons ) , 0 ) ;
    boolean finish = false