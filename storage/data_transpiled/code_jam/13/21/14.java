static final String getTaskName ( ) throws IOException {
  final String taskName = "A" ;
  InputStream input = null ;
  {
    final String readStr = ( String ) input . read ( ) . trim ( ) ;
    final List < Integer > list = CollectionUtils . toList ( readStr . split ( " " ) ) ;
    return list . get ( 0 ) ;
  }
  {
    final int [ ] list = readIntList ( ) ;
    assert list . length == 1 ;
    return list [ 0 ] ;
  }
  {
    final int [ ] best = new int [ 1 ] ;
    {
      int currentSize = list . length ;
      final int n = list [ 0 ] ;
      final int [ ] motes = list . toArray ( ) ;
      assert motes . length == n ;
      if ( currentSize <= 1 ) {
        return motes . length ;
      }
      final int [ ] best = new int [ 1 ] ;
      {
        int currentSize = list . length ;
        {
          int n = list [ 0 ] ;
          int [ ] motes = list [ 1 ] ;
          assert n == n ;
          if ( currentSize <= 1 ) {
            return motes . length ;
          }
          int [ ] motes = new int [ n ] ;
          {
            int n = list [ 0 ] ;
            int actions = 0 ;
            for ( int i = n ;
            i < motes . length ;
            i ++ ) {
              motes [ i ] = list [ i ] ;
            }
            int actions = 0 ;
            for ( int i = 0 ;
            i < n ;
            i ++ ) {
              motes [ i ] = list [ i ] ;
              actions ++ ;
            }
            motes [ i ] = best [ i ] ;
            actions ++ ;
          }
        }
      }
    }
  }
  {
    final int currentSize = list . length ;
    final int n = list . length ;
    final int [ ] motes = list . toArray ( ) ;
    int actions = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int mote = list [ i ] ;
      checkBest ( actions + motes . length - n ) ;
      while ( mote >= currentSize ) {
        currentSize += currentSize - 1 ;
        actions ++ ;
      }
      currentSize += mote ;
    }
    checkBest ( actions ) ;
    return best [ 0 ] ;
  }
  {
    final long tstart = System . nanoTime ( ) ;
    input = new FileInputStream ( taskName ) ;
    final OutputStream output = new FileOutputStream ( taskName ) ;
    final int casecount = list . length ;
    for ( int i = 1 ;
    i <= casecount ;
    i ++ ) {
      