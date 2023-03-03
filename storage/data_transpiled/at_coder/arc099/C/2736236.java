@ VisibleForTesting static int [ ] [ ] resCons ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < Integer , Map < Integer , Integer >> G = Maps . newHashMap ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    G . put ( i , Maps . newHashMap ( ) ) ;
    for ( int j = 1 ;
    j <= N ;
    j ++ ) {
      if ( i != j ) {
        G . get ( i ) . put ( j , 1 ) ;
      }
    }
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    final int [ ] resCon = new int [ N + 1 ] ;
    final int [ ] doneList = new int [ N + 1 ] ;
    doneList [ 0 ] = 1 ;
    doneList [ 0 ] = 1 ;
    int core = 1 ;
    while ( core != 0 ) {
      final Queue < Integer > queue = new LinkedList < Integer > ( ) ;
      queue . add ( core ) ;
      boolean resFlag = true ;
      int sizeA = 1 ;
      int sizeB = 0 ;
      doneList [ 0 ] = 1 ;
      while ( queue . size ( ) > 0 ) {
        final int a = queue . poll ( ) ;
        for ( final int b : G . get ( a ) . keySet ( ) ) {
          if ( doneList [ b ] == doneList [ a ] ) {
            resFlag = false ;
            break ;
          }
          else if ( doneList [ b ] == 0 ) {
            doneList [ b ] = - 1 * doneList [ a ] ;
            if ( doneList [ a ] == 1 ) {
              sizeB ++ ;
            }
            else {
              sizeA ++ ;
            }
            queue . add ( b ) ;
          }
        }
      }
      resCon [ i ] = sizeA ;
      if ( resFlag == false ) {
        break ;
      }
      core = 0 ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        if ( doneList [ i ] == 0 ) {
          core = i ;
          break ;
        }
      }
    }
    int [ ] res ;
    if ( resFlag == false ) {
      res = 0 ;
    }
    else {
      int [ ] resCanS = new int [ N + 1 ] ;
      for ( int [ ] rr : resCon ) {
        final