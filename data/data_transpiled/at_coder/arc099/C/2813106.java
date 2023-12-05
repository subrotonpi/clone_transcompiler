@ VisibleForTesting static int [ ] [ ] getSortedArrays ( ) {
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
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    table [ a - 1 ] [ b - 1 ] = 0 ;
    table [ b - 1 ] [ a - 1 ] = 0 ;
  }
  final boolean [ ] visit = new boolean [ N ] ;
  final int [ ] color = new int [ N ] ;
  Arrays . fill ( color , - 1 ) ;
  final int [ ] [ ] q = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    q [ i ] = new int [ N ] ;
    q [ i ] [ 0 ] = i ;
    color [ i ] = 0 ;
    visit [ i ] = true ;
    r [ 0 ] ++ ;
    while ( q [ i ] > 0 ) {
      final int x = q [ i ] ;
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
        q [ i ] = j ;
        color [ j ] = ( color [ x ] + 1 ) % 2 ;
        r [ color [ j ] ] ++ ;
        visit [ j ] = true ;
      }
    }
  }
  final int [ ] ans = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ! visit [ i ] ) ans [ i ] = i ;
  }
  final Set [ ] dp = new HashSet [ N ] ;
  dp [ 0 ] . add ( 0 ) ;
  final int L = N / 2 + 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    for