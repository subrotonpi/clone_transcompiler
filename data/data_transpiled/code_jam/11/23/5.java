static final int T = Integer . parseInt ( readLine ( ) ) {
  int i ;
  for ( i = 0 ;
  i < T ;
  i ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int [ ] U = new int [ N ] ;
    int [ ] V = new int [ N ] ;
    List < Set < Integer >> roomvertices = new ArrayList < Set < Integer >> ( ) ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      roomvertices . add ( new HashSet < Integer > ( 0 ) ) ;
    }
    Map < Integer , Set < Integer >> cornerRooms = new HashMap < Integer , Set < Integer >> ( ) ;
    for ( i = 0 ;
    i < N ;
    i ++ ) {
      cornerRooms . put ( i , new HashSet < Integer > ( 0 ) ) ;
    }
    for ( i = 0 ;
    i < M ;
    i ++ ) {
      Integer room = ( cornerRooms . get ( V [ i ] ) . containsAll ( cornerRooms . get ( U [ i ] ) ) ) ? cornerRooms . get ( V [ i ] ) : 0 ;
      Set < Integer > oldvertices = roomvertices . get ( room ) ;
      Set < Integer > newvertices = new HashSet < Integer > ( ) ;
      newvertices . add ( U [ i ] ) ;
      newvertices . add ( V [ i ] ) ;
      int cur = ( U [ i ] + 1 ) % N ;
      while ( cur != V [ i ] ) {
        if ( oldvertices . contains ( cur ) ) {
          oldvertices . remove ( cur ) ;
          newvertices . add ( cur ) ;
        }
        cur = ( cur + 1 ) % N ;
      }
      roomvertices . add ( newvertices ) ;
      for ( int vertices : newvertices ) {
        cornerRooms . get ( vertices ) . remove ( room ) ;
        cornerRooms . get ( vertices ) . add ( roomvertices . size ( ) - 1 ) ;
      }
      cornerRooms . get ( U [ i ] ) . add ( room ) ;
      cornerRooms . get ( V [ i ] ) . add ( room ) ;
    }
    int maxC = Math . min ( CollectionUtils . size ( roomvertices ) , M ) ;
    int ansC = - 1 ;
    boolean ans = false ;
    for ( i = 0 ;
    i < maxC ;
    i ++ ) {
      for ( Set < Integer > room : roomvertices ) {
        int