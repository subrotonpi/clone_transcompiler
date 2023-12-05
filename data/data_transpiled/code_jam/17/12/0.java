public static int tc = Integer . parseInt ( input ) {
  for ( int t = 1 ;
  t <= tc ;
  t ++ ) {
    System . out . print ( "Case #" + t + ": " ) ;
    int n = Integer . parseInt ( input . readLine ( ) ) ;
    int p = Integer . parseInt ( input . readLine ( ) ) ;
    int reqs = Integer . parseInt ( input . readLine ( ) ) ;
    int [ ] [ ] pls = new int [ n ] [ p ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) pls [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < p ;
    j ++ ) pls [ i ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    List < Event > events = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < p ;
      j ++ ) {
        int u = pls [ i ] [ j ] ;
        int req = reqs [ i ] ;
        int up = ( 10 * u ) / ( 9 * req ) ;
        int down = ( 10 * u + 11 * req - 1 ) / ( 11 * req ) ;
        if ( down == 0 ) down = 1 ;
        if ( up < down ) continue ;
        events . add ( new Event ( down , false , i , u , j ) ) ;
        events . add ( new Event ( up , true , i , u , j ) ) ;
      }
    }
    Collections . sort ( events ) ;
    int cnt = 0 ;
    int [ ] [ ] counts = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) counts [ i ] [ 0 ] = i ;
    int [ ] remv = new int [ n ] ;
    Iterator < Event > bd = events . iterator ( ) ;
    while ( bd . hasNext ( ) ) {
      Event ev = ( Event ) bd . next ( ) ;
      int i = ( int ) remv [ i ] ;
      int yy = ( int ) remv [ i ] ;
      if ( ev != 0 ) {
        if ( remv [ i ] > 0 ) {
          remv [ i ] -- ;
        }
        else {
          counts [ i ] [ 0 ] = yy ;
          if ( Arrays . binarySearch ( counts , remv ) > 0 ) {
            cnt ++ ;
            for ( int ii = 0 ;
            ii <