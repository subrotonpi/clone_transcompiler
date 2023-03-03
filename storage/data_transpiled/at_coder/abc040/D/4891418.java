public static void UnionFind ( @ Nonnull final int size ) {
  final int M = size ;
  final int [ ] root = new int [ size ] ;
  Arrays . fill ( root , - 1 ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    root [ i ] = i ;
  }
  {
    if ( root [ i ] < 0 ) {
      return ;
    }
    root [ i ] = i ;
  }
  {
    boolean same = false ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      int rx = i ;
      int ry = i ;
      if ( rx == ry ) {
        return ;
      }
      if ( root [ ry ] < root [ rx ] ) {
        rx = ry ;
        ry = rx ;
      }
      root [ rx ] += root [ ry ] ;
      root [ ry ] = rx ;
    }
    {
      int rx = i ;
      return - root [ rx ] ;
    }
  }
  {
    int rx = i ;
    int ry = i ;
  }
  {
    int [ ] ret = new int [ Q ] ;
    UnionFind uf = new UnionFind ( N ) ;
    int ei = 0 ;
    Arrays . sort ( edges , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return - o1 [ 2 ] ;
      }
    }
    ) ;
    Arrays . sort ( queries , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return - o1 [ 2 ] ;
      }
    }
    ) ;
    for ( int i = 0 ;
    i < Q ;
    i ++ ) {
      int w = i ;
      int v = queries [ i ] ;
      w = - w ;
      while ( ei < M && edges [ ei ] [ 2 ] > w ) {
        int s = edges [ ei ] ;
        int t = queries [ ei ] [ 2 ] ;
        uf . unite ( s - 1 , t - 1 ) ;
        ei ++ ;
      }
      ret [ i ] = uf . size ( v - 1 ) ;
    }
  }
}
