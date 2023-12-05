static final String print ( String s ) {
  final int w = s . length ( ) ;
  final int [ ] [ ] grid = s . split ( " " ) ;
  final int [ ] [ ] cands ;
  {
    final int [ ] [ ] cands ;
    {
      this . w = grid . length ;
      this . grid = grid ;
    }
  }
  {
    final int [ ] [ ] cands = new int [ w ] [ ] ;
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      cands [ i ] = grid [ i ] [ j ] ;
    }
    {
      final int [ ] [ ] nqueries = new int [ w ] ;
      for ( int i = 0 ;
      i < nqueries . length ;
      i ++ ) {
        nqueries [ i ] = s . length ;
      }
      final int [ ] queries = new int [ w ] ;
      for ( int i = 0 ;
      i < queries . length ;
      i ++ ) {
        queries [ i ] = s . length ;
      }
      assert queries . length == nqueries . length ;
      System . out . println ( "Case #" + ( i ) + ":" + ( j ) ) ;
      final Squ s = new Squ ( grid ) ;
      for ( int q : queries ) {
        s . find ( q ) ;
      }
    }
  }
  {
    final int [ ] [ ] ns = new int [ w ] ;
    for ( int i = 0 ;
    i < ns . length ;
    i ++ ) {
      ns [ i ] = neighbours [ i ] [ j ] ;
    }
    Arrays . sort ( ns , new Comparator < Integer > ( ) {
      @ Override public int compare ( Integer ij , Integer cs ) {
        if ( cs . charAt ( cs . length ( ) - 1 ) == '-' ) cs = cs . substring ( 0 , cs . length ( ) - 1 ) ;
        return new Integer ( cs . charAt ( 0 ) ) ;
      }
    }
    ) ;
  }
  {
    final List < Integer > out = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < w ;
    i ++ ) {
      for ( int j = 0 ;
      j < w ;
      j ++ ) {
        final int c = s . indexOf ( cands [ i ] [ j ] ) ;
        if ( Character . isDigit ( c ) ) {
          cost = 1 ;
          out . add ( new Integer ( cost ) ) ;
        }
      }
    }
    return out . toArray ( new Integer [ out . size ( ) ] ) ;
  }
}
