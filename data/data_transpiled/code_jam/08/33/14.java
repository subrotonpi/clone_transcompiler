@ VisibleForTesting static final Scanner scan = new Scanner ( System . in ) {
  private int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
  private int [ ] A = new int [ N ] ;
  private int [ ] Lsort = new int [ N ] ;
  {
    int n = 0 , m = 0 , X = 0 , Y = 0 , Z = 0 ;
  }
  @ Override public void process ( ) {
    int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int m = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int X = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int Y = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int Z = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [ ] A = new int [ n ] ;
    for ( int i = 0 ;
    i <= m ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
    }
    int [ ] L = new int [ n ] ;
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      L [ i ] = new int [ n ] ;
      for ( int j = 0 ;
      j <= n ;
      j ++ ) {
        L [ i ] [ j ] = ( A [ i % m ] ) ;
        A [ i ] [ j ] = 1 ;
        A [ i ] [ j ] = ( X * A [ i % m ] + Y * ( j + 1 ) ) % Z ;
      }
    }
    int [ ] [ ] Lsort = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i <= n ;
    i ++ ) {
      int x = Arrays . binarySearch ( Lsort [ i ] , ( int ) L [ i ] [ 0 ] ) ;
      for ( int k = 0 ;
      k <= x ;
      k ++ ) {
        if ( Lsort [ k ] [ 0 ] == L [ i ] [ 0 ] ) continue ;
        L [ i ] = new int [ x ] ;
      }
      insort ( Lsort , ( int ) L [ i ] [ 0 ] ) ;
    }
    int ret = 0 ;
    for ( int i = 0 ;
    i < L . length ;
    i ++ ) {
      ret += L [ i ] [ 1 ] % 1000000007 ;
    }
    return ret % 1000000007 ;
  }
}
