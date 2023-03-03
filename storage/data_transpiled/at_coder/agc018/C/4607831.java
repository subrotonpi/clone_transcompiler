static final long [ ] getMemory ( ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  int z = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = x + y + z ;
  long [ ] a = new long [ n ] ;
  long [ ] b = new long [ n ] ;
  long [ ] c = new long [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    c [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  long [ ] subAB = b . clone ( ) ;
  int [ ] idxArg = new int [ subAB . length ] ;
  int [ ] pqLeft = new int [ n ] ;
  int [ ] pqRight = new int [ n ] ;
  long mem = 0 ;
  int [ ] cls = new int [ n ] ;
  for ( int i = 0 ;
  i < x ;
  i ++ ) {
    mem += a [ idxArg [ i ] ] ;
    heappush ( pqLeft , ( a [ idxArg [ i ] ] - c [ idxArg [ i ] ] ) ) ;
    cls [ idxArg [ i ] ] = 1 ;
  }
  for ( int i = x ;
  i < n ;
  i ++ ) {
    mem += c [ idxArg [ i ] ] ;
    cls [ idxArg [ i ] ] = 3 ;
    heappush ( pqRight , ( c [ idxArg [ i ] ] - b [ idxArg [ i ] ] ) ) ;
    if ( ( pqRight . length > z ) && ( pqLeft [ idxArg [ i ] ] > 0 ) ) {
      final int idx = heappop ( pqRight ) ;
      mem -= c [ idx ] ;
      mem += b [ idx ] ;
      cls [ idx ] = 2 ;
    }
  }
  long ans = mem ;
  for ( int i = x ;
  i < x + z ;
  i ++ ) {
    switch ( cls [ idxArg [ i ] ] ) {
      case 2 : mem -= b [ idxArg [ i ] ] ;
      while ( true ) {
        final int idx = heappop ( pqRight ) ;
        if ( cls [ idx ] == 3 ) {
          mem -= c [ idx ] ;
          mem += b [ idx ] ;
          