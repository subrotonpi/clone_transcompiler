static private int [ ] [ ] [ ] input ( ) {
  final int MAX_INT = Integer . parseInt ( 10e10 ) ;
  final int MIN_INT = - MAX_INT ;
  final int mod = 1000000007 ;
  System . setLibrary ( "python" ) ;
  {
    final int MAX_INT = Integer . parseInt ( input . readLine ( ) ) ;
    final int MAX_W = Integer . parseInt ( input . readLine ( ) ) ;
    final int [ ] [ ] s = new int [ MAX_INT ] [ ] ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] [ i ] = input . readLine ( ) ;
    }
  }
  {
    final int [ ] [ ] IL = new int [ ] [ ] {
      Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) }
      ;
    }
    {
      final int [ ] SL = new int [ ] [ ] {
        Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) }
        ;
        final int [ ] I = new int [ ] {
          Integer . parseInt ( input . readLine ( ) ) }
          ;
          final int [ ] [ ] S = new int [ ] [ ] {
            Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) }
            ;
          }
          {
            final int [ ] [ ] judge = new int [ ] [ ] {
              {
                - 1 , 0 , 1 }
              }
              ;
              int num = 0 ;
              for ( int i = 0 ;
              i < l . length ;
              i ++ ) {
                for ( int j = 0 ;
                j < l . length ;
                j ++ ) {
                  if ( l [ i ] [ j ] == 0 ) {
                    continue ;
                  }
                  else {
                    if ( judge [ a + i ] [ b + j ] ) {
                      num ++ ;
                    }
                  }
                }
              }
              return num ;
            }
            final int H = IL [ 0 ] ;
            final int W = SL [ 1 ] ;
            final int [ ] [ ] s = new int [ H ] [ W ] ;
            for ( int i = 0 ;
            i < H ;
            i ++ ) {
              s [ i ] [ 0 ] = S [ i ] ;
            }
            final int [ ] [ ] ans = new int [ W ] [ H ] ;
            for ( int i = 0 ;
            i < W ;
            i ++ ) {
              ans [ i ] [ 0 ] = "#" ;
              ans [ i ] [ 1 ] = cnt [ i ] [ 1 ] ;
            }
            for ( int i = 0 ;
            i < ans . length ;
            i ++ ) {
              