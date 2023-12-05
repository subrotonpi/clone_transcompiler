@ SafeVarargs public static < T > void unionFind ( ) {
  class UnionFind {
    int [ ] table = new int [ size ] ;
    int i ;
    int j ;
    int i ;
    int i ;
    int j ;
    UnionFind < T > union = new UnionFind < T > ( ) {
      int [ ] table = new int [ size ] ;
      {
        table [ i ] = - 1 }
        ;
      }
      @ Override public T root ( T x ) {
        while ( table [ x ] >= 0 ) {
          x = table [ x ] ;
        }
        return x ;
      }
      @ Override public void unite ( T x , T y ) {
        int s1 = union . root ( x ) ;
        int s2 = union . root ( y ) ;
        if ( s1 != s2 ) {
          if ( table [ s1 ] > table [ s2 ] ) {
            s1 = s2 ;
            s2 = s1 ;
          }
          table [ s1 ] += table [ s2 ] ;
          table [ s2 ] = s1 ;
        }
        return ;
      }
      @ Override public boolean same ( T x , T y ) {
        return union . root ( x ) == union . root ( y ) ;
      }
      @ Override public int size ( T x ) {
        return - table [ root ( x ) ] ;
      }
    }
    ;
    n = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    m = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    final int ... t = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    UnionFind < T > u = new UnionFind < T > ( n + 1 ) ;
    final TreeMap < T , Integer > f = new TreeMap < T , Integer > ( ) ;
    final TreeMap < T , Integer > e = new TreeMap < T , Integer > ( ) ;
    for ( int l = 0 , r = t [ 0 ] ;
    l < t . length ;
    l ++ ) {
      u . unite ( l , r ) ;
      e . put ( l , new Integer ( r ) ) ;
    }
    for ( int i = 0 ;
    i < n + 1 ;
    i ++ ) {
      f . put ( u . root ( i ) , i ) ;
    }
    for ( int t : f . values ( ) ) {
      if ( t . length < 3 ) continue ;
      TreeMap < T , Integer > outs = new TreeMap < T , Integer > ( ) ;
      int [ ] ins = new int [ t . length ] ;
      for ( int i = 0 ;
      i <