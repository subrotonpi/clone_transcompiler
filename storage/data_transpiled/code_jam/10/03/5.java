static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int n = scanner . nextInt ( ) ;
  final int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    l [ i ] = scanner . nextInt ( ) ;
  }
  for ( int curCase = 1 ;
  curCase <= Integer . MAX_VALUE ;
  ++ curCase ) {
    final int r = scanner . nextInt ( ) ;
    final int k = scanner . nextInt ( ) ;
    final int n = scanner . nextInt ( ) ;
    final int [ ] l = ArrayUtil . toIntArray ( scanner . nextLine ( ) . split ( " " ) ) ;
    final int [ ] comp = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      comp [ i ] = ( - 1 ) ;
    }
    int begin = 0 ;
    int cur = 0 ;
    final List < Integer > beginlst = new ArrayList < Integer > ( ) ;
    int total = 0 ;
    do {
      begin = cur ;
      int curtotal = 0 ;
      if ( comp [ begin ] == ( - 1 ) ) {
        beginlst . add ( begin ) ;
        while ( curtotal + l [ cur ] <= k ) {
          curtotal += l [ cur ] ;
          cur = ( cur + 1 ) % n ;
          if ( cur == begin ) {
            break ;
          }
        }
        comp [ begin ] = ( curtotal ++ ) ;
        -- r ;
        if ( r == 0 ) {
          break ;
        }
      }
      else {
        final int [ ] loop = beginlst . toArray ( ) ;
        total += ( r / loop . length ) * Integer . MAX_VALUE ;
        r = r % loop . length ;
        for ( int i = 0 ;
        i <= r ;
        ++ i ) {
          final int x = comp [ loop [ i ] ] ;
          total += x ;
        }
        break ;
      }
    }
    while ( true ) ;
  }
  System . out . println ( "Case #" + curCase + ": " + total ) ;
  return scanner ;
}
