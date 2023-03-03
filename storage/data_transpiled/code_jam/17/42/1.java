static final String solve ( ) {
  final int i = 0 ;
  final int h = i ;
  int l = i + 1 ;
  int MOD = 10 * 9 + 7 ;
  final double INF = Double . MAX_VALUE ;
  int [ ] byPos = new int [ MOD ] ;
  for ( int j = 0 ;
  j < MOD ;
  j ++ ) {
    int [ ] cache = new int [ MOD ] ;
    int n = readInts ( ) ;
    int c = readInts ( ) ;
    int m = readInts ( ) ;
    byPos [ m ] = new int [ M ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int pos = readInts ( ) ;
      byPos [ pos ] [ i ] = id ++ ;
    }
    int ans = solve ( n , c , byPos , byPos ) ;
    System . out . printf ( "Case #%d: %s%n" , j + 1 , ans [ 0 ] , ans [ 1 ] ) ;
  }
  final Runnable pr = new Runnable ( ) {
    public void run ( ) {
      System . out . println ( Arrays . toString ( args ) ) ;
    }
  }
  ;
  final Runnable epr = new Runnable ( ) {
    public void run ( ) {
      System . err . println ( Arrays . toString ( args ) ) ;
    }
  }
  ;
  final Runnable die = new Runnable ( ) {
    public void run ( ) {
      pr . run ( ) ^ exit ( 0 ) ;
    }
  }
  ;
  final Runnable readStr = new Runnable ( ) {
    public void run ( ) {
      final int [ ] byPos = new int [ M ] ;
      final List < Integer > toCut = new ArrayList < Integer > ( byPos . length ) ;
      for ( int pos : new ArrayList < Integer > ( byPos ) ) {
        if ( byPos [ pos ] . size ( ) > h ) {
          toCut . add ( pos ) ;
        }
      }
      if ( toCut . isEmpty ( ) ) {
        return 0 ;
      }
      int ans = 0 ;
      for ( int dst : xrange ( 1 , 2000 ) ) {
        while ( byPos [ dst ] . size ( ) < h ) {
          int src = toCut . get ( byPos [ dst ] . size ( ) - 1 ) ;
          if ( src <= dst ) {
            return ;
          }
          byPos [ dst ] . add ( byPos [ src ] . iterator ( ) . next ( ) ) ;
          ans ++ ;
          if ( byPos [ src ] . size ( ) <= h ) {
            toCut