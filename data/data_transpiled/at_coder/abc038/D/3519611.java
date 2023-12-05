@ VisibleForTesting static final Comparator < Integer > COMPARATOR_BY_SIZE_AND_ORDERED_LEAF = new Comparator < Integer > ( ) {
  @ Override public int compare ( Integer o1 , Integer o2 ) {
    final int N = Integer . parseInt ( o1 . toString ( ) ) ;
    final int [ ] [ ] sizeArray = new int [ N ] [ N ] ;
    for ( int elem : o1 . toString ( ) . split ( "\\s+" ) ) sizeArray [ elem ] = Integer . parseInt ( o2 . toString ( ) ) ;
    final int maxW = Integer . MAX_VALUE ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int [ ] tails = new int [ N ] ;
      for ( int j = 0 ;
      j < tails . length ;
      j ++ ) {
        tails [ j ] = Integer . parseInt ( tails [ j ] ) ;
      }
      final int size = 0 ;
      for ( int j = 0 ;
      j < size ;
      j ++ ) {
        final int w = bitArray [ j ] ;
        final int [ ] bit = new int [ w ] ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          bit [ i ] = bitMax ( bit , w - 1 ) + 1 ;
        }
        final int [ ] bit = new int [ w ] ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          bit [ i ] = bitMax ( bit , w - 1 ) ;
        }
        final int [ ] bit = new int [ w ] ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          bit [ i ] = bitMax ( bit , w - 1 ) + 1 ;
        }
        final int [ ] bit = new int [ w ] ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          bit [ i ] = bitMax ( bit , w - 1 ) ;
        }
        final int [ ] bit = new int [ w ] ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          bit [ i ] = bitMax ( bit , w - 1 ) ;
        }
        final int [ ] bit = new int [ w ] ;
        for ( int i = 0 ;
        i < w ;
        i ++ ) {
          bit [ i ] = bitMax ( bit , w - 1 ) ;
        }
        return bit [ w ] ;
      }
      return bit [ w ] ;
    }
  }
  ;
  return new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2