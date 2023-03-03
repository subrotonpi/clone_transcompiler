static final String solve ( ) {
  final int [ ] di = new int [ ] {
    - 1 , + 1 , 0 , 0 }
    ;
    final int [ ] dj = new int [ ] {
      0 , 0 , - 1 , + 1 }
      ;
      int [ ] [ ] A = null , W = null ;
      HashMap < String , Integer > cache = null ;
      {
        String key ;
        int ii , jj ;
        int value ;
        int max = 0 ;
        for ( int q = 0 ;
        q < W ;
        q ++ ) {
          for ( int i = 0 ;
          i < W ;
          i ++ ) {
            for ( int j = 0 ;
            j < W ;
            j ++ ) {
              if ( A [ i ] [ j ] == '+' || A [ i ] [ j ] == '-' ) continue ;
              value = solve ( i , j , false , q , length ) ;
              if ( value > max || solution > test ) {
                solution = test ;
              }
            }
            if ( solution != null ) break ;
            max ++ ;
          }
          print ( solution , 1 , max ) ;
        }
        if ( cache == null ) {
          System . setRecursionDesired ( 100000 ) ;
          main ( ) ;
        }
        return null ;
      }
      int [ ] [ ] A = null ;
      int [ ] [ ] W = null ;
      int [ ] [ ] cache = null ;
      {
        int [ ] [ ] A = null ;
        int [ ] [ ] [ ] = null ;
        int [ ] [ ] W = null ;
        for ( int q = 0 ;
        q < W . length ;
        q ++ ) {
          W = W [ q ] ;
        }
        int [ ] [ ] A = null ;
        int [ ] [ ] [ ] = null ;
        for ( int q = 0 ;
        q < W . length ;
        q ++ ) {
          W = W [ q ] ;
        }
        int [ ] [ ] A = null ;
        int [ ] [ ] [ ] = null ;
        for ( int q = 0 ;
        q < W . length ;
        q ++ ) {
          W [ q ] = q ;
        }
        int [ ] [ ] result = new int [ W . length ] [ ] ;
        for ( int i = 0 ;
        i < W . length ;
        i ++ ) {
          result [ i ] = solve ( i , j , false , q , cache [ i ] ) ;
          if ( result [ i ] == 0 ) break ;
        }
        print ( result [ W . length - 1 ] ) ;
      }
      if ( cache != null ) {
        cache . put ( key , cache = new String