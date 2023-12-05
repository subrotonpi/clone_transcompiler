@ Sys public static void main ( String [ ] args ) {
  final int [ ] minS = new int [ ] {
    - 1 }
    ;
    Arrays . fill ( minS , ( int ) - 1 ) ;
    Arrays . fill ( minS , ( int ) - 1 ) ;
    final int [ ] maxS = new int [ ] {
      - 1 }
      ;
      Arrays . fill ( maxS , ( int ) - 1 ) ;
      Arrays . fill ( maxS , ( int ) - 1 ) ;
      final int [ ] todo = new int [ 1 ] ;
      todo [ 0 ] = 1 ;
      while ( todo . length > 0 ) {
        int i = todo [ -- i ] ;
        if ( minS [ m [ i ] % i ] == - 1 ) {
          todo [ 0 ] = i ;
          todo [ 1 ] = m [ i ] % i ;
        }
        else {
          minS [ i ] = Math . min ( s [ i ] , minS [ m [ i ] % i ] ) ;
          maxS [ i ] = Math . max ( s [ i ] , maxS [ m [ i ] % i ] ) ;
        }
      }
      final int [ ] [ ] mm = minMax ( args ) ;
      int bestCount = - 1 ;
      for ( int i = 0 ;
      i < mm . length ;
      i ++ ) {
        final int [ ] minS = mm [ i ] ;
        final int [ ] maxS = mm [ i ] ;
        int count = 0 ;
        for ( int j = 0 ;
        j < xrange ;
        j ++ ) {
          if ( minS [ j ] + d < mm [ j ] [ 0 ] ) break ;
          if ( mm [ j ] [ 1 ] <= minS [ j ] + d ) count ++ ;
        }
        if ( count > bestCount ) bestCount = count ;
      }
      System . out . println ( bestCount ) ;
    }
    