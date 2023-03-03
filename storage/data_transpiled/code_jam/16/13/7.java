static final int [ ] readInts ( Reader in ) throws IOException {
  final int [ ] b = new int [ 10 ] ;
  final int [ ] [ ] result = new int [ 10 ] [ 10 ] ;
  {
    readInts ( in ) ;
  }
  {
    final int N = Integer . parseInt ( in . read ( ) ) ;
    final int [ ] [ ] F = readInts ( in ) ;
  }
  {
    final int [ ] [ ] result = new int [ N ] [ ] ;
    {
      readInts ( in , b ) ;
    }
  }
  {
    final int [ ] [ ] R = new int [ N ] [ ] ;
    final Map < Integer , Double > D = Maps . newTreeMap ( ) ;
    for ( int i = 0 ;
    i < R . length ;
    i ++ ) {
      result [ i ] = F [ i ] ;
    }
    {
      int [ ] [ ] res = new int [ N ] [ ] ;
      for ( int i = 0 ;
      i < res . length ;
      i ++ ) {
        result [ i ] = D . get ( i ) ;
      }
      {
        int T = Integer . parseInt ( in . read ( ) ) ;
        int [ ] [ ] r = new int [ T ] [ ] ;
        for ( int j = 0 ;
        j < T ;
        j ++ ) {
          r [ j ] = r [ j ] ;
        }
        res [ i ] = r ;
      }
    }
    {
      Set < Integer > bestLoop = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < res . length ;
      i ++ ) {
        if ( res [ i ] [ 0 ] == res [ i ] [ res . length - 1 ] ) {
          Set < Integer > loop = new HashSet < Integer > ( ) ;
          loop . addAll ( res [ i ] ) ;
          if ( loop . size ( ) > bestLoop . size ( ) ) bestLoop = loop ;
        }
      }
      Set < Integer > chosen = new HashSet < Integer > ( ) ;
      while ( true ) {
        Set < Integer > best = new HashSet < Integer > ( ) ;
        for ( int i = 0 ;
        i < res . length ;
        i ++ ) {
          for ( int j = i + 1 ;
          j < res . length ;
          j ++ ) {
            if ( res [ i ] [ res . length - 1 ] == res [ i ] [ j - 2 ] && res [ i ] [ res . length - 2 ] == res [ j ] [ res . length - 1 ] ) {
              bestLoop . add ( i ) ;
              