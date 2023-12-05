@ VisibleForTesting static int [ ] [ ] createRanks ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] table = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    table [ i ] [ i ] = 1 ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    table [ a - 1 ] [ b - 1 ] = 0 ;
    table [ b - 1 ] [ a - 1 ] = 0 ;
  }
  final boolean visit [ ] = new boolean [ N ] ;
  final int [ ] color = new int [ N ] ;
  Arrays . fill ( color , - 1 ) ;
  final int [ ] r = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final Queue < Integer > q = new LinkedList < Integer > ( ) ;
    q . add ( i ) ;
    color [ i ] = 0 ;
    visit [ i ] = true ;
    r [ 0 ] ++ ;
    while ( q . size ( ) > 0 ) {
      final int x = q . poll ( ) ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        if ( table [ x ] [ j ] == 0 ) {
          continue ;
        }
        if ( visit [ j ] ) {
          if ( ( color [ x ] == color [ j ] ) && ( color [ x ] == color [ j ] ) ) {
            System . out . println ( - 1 ) ;
            System . exit ( 0 ) ;
          }
          continue ;
        }
        q . add ( j ) ;
        color [ j ] = ( color [ x ] + 1 ) % 2 ;
        r [ color [ j ] ] ++ ;
        visit [ j ] = true ;
      }
    }
  }
  final int [ ] ans = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ! visit [ i ] ) ans [ i ] = i ;
  }
  final int [ ] [ ] r = new int [ ans . length ] [ ] ;
  for ( int i = 1 ;
  i < ans . length ;
  i ++ ) {
    r [ i ] [ 0 ] = ans [ i ] [ 1 ] ;
  }
  System . out