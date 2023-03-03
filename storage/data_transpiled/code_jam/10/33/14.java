static final String getPrintingLine ( ) {
  final String outputLine = "Case #{X:d}: {K:d}" ;
  final Scanner instream = new Scanner ( System . in ) ;
  final PrintWriter outhandle = new PrintWriter ( System . out ) ;
  final int T = Integer . parseInt ( instream . nextLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    final int M = Integer . parseInt ( instream . nextLine ( ) ) ;
    final int N = Integer . parseInt ( instream . nextLine ( ) ) ;
    final int [ ] [ ] bark = new int [ M ] [ N ] ;
    for ( int m = 0 ;
    m < M ;
    m ++ ) {
      final int row = Integer . parseInt ( instream . nextLine ( ) , 16 ) ;
      final int col = Integer . parseInt ( instream . nextLine ( ) , 16 ) ;
      if ( isBoard ( bark , row , col , size ) ) {
        boardSizes [ m ] [ 0 ] ++ ;
        for ( int ri = row ;
        ri < row + size ;
        ri ++ ) {
          for ( int ci = col ;
          ci < col + size ;
          ci ++ ) {
            bark [ ri ] [ ci ] = null ;
          }
        }
      }
      outhandle . println ( bark ) ;
      final Map < Integer , Integer > boardSizes = new HashMap < > ( ) ;
      for ( int size = 1 ;
      size <= Math . min ( M , N ) ;
      size ++ ) {
        for ( int row = 0 ;
        row < M - size + 1 ;
        row ++ ) {
          for ( int col = 0 ;
          col < N - size + 1 ;
          col ++ ) {
            if ( isBoard ( bark , row , col , size ) ) {
              boardSizes . put ( size , 1 ) ;
              for ( int ri = row ;
              ri < row + size ;
              ri ++ ) {
                for ( int ci = col ;
                ci < col + size ;
                ci ++ ) {
                  bark [ ri ] [ ci ] = null ;
                }
              }
            }
          }
        }
      }
      outhandle . println ( outputLine . format ( X = t + 1 , K = boardSizes . size ( ) ) ) ;
      for ( int size : boardSizes . keySet ( ) ) {
        outhandle . println ( size , size ) ;
      }
    }
    return outhandle . toString ( ) ;
  }
  