static final class UnionFind implements Comparator < UnionFind > comparator ( int numberOfNodes ) {
  private final ArrayIntIntIntHashMap par = new ArrayIntIntIntHashMap ( numberOfNodes ) ;
  private final ArrayIntIntIntIntHashMap rank = new ArrayIntIntIntIntIntIntHashMap ( ) ;
  public UnionFind ( int numberOfNodes ) {
    this . par = new ArrayIntIntIntIntHashMap ( ) ;
    this . rank = new ArrayIntIntIntIntIntHashMap ( ) ;
    for ( int i = 0 ;
    i < numberOfNodes ;
    i ++ ) {
      this . par [ i ] = par . get ( i ) ;
    }
    return new UnionFind ( numberOfNodes ) {
      @ Override public int root ( int node ) {
        if ( par . get ( node ) == node ) {
          return node ;
        }
        else {
          int r = root ( par . get ( node ) ) ;
          par . put ( node , r ) ;
          return r ;
        }
      }
      @ Override public boolean inTheSameSet ( int node1 , int node2 ) {
        return root ( node1 ) == root ( node2 ) ;
      }
      @ Override public void unite ( int node1 , int node2 ) {
        int x = root ( node1 ) ;
        int y = root ( node2 ) ;
        if ( x == y ) {
        }
        else if ( rank . get ( x ) < rank . get ( y ) ) {
          par . put ( x , y ) ;
        }
        else {
          par . put ( y , x ) ;
          if ( rank . get ( x ) == rank . get ( y ) ) ++ ;
        }
      }
    }
    ;
  }
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int l = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] roads = new int [ k ] ;
  for ( int i = 0 ;
  i < roads . length ;
  i ++ ) {
    roads [ i ] = roads [ i ] ;
  }
  for ( int i = 0 ;
  i < trains . length ;
  i ++ ) {
    trains [ i ] = trains [ i ] ;
  }
  UnionFind uf1 = new UnionFind ( n + 1 ) ;
  uf2 = new UnionFind ( n ) ;
  uf1 . unite ( roads , trains ) ;
  uf2 . unite ( trains , trains ) ;
}
