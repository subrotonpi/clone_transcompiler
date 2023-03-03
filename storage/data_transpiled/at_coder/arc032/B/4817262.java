static final class UnionFind {
  private final int [ ] par ;
  private final int [ ] rank = new int [ n + 1 ] ;
  public int size ( int x ) {
    return - 1 * par [ indexOf ( x ) ] ;
  }
  public int indexOf ( int x ) {
    if ( ( par [ x ] < 1 ) && ( rank [ x ] > 0 ) ) return x ;
    par [ x ] = find ( par [ x ] ) ;
    return par [ x ] ;
  }
  public boolean sameCheck ( int x , int y ) {
    return indexOf ( x ) == find ( y ) ;
  }
  public boolean union ( int x , int y ) {
    int x = indexOf ( x ) ;
    int y = indexOf ( y ) ;
    if ( ( x == y ) && ( x < 0 ) ) return false ;
    if ( ( size ( x ) < size ( y ) ) && ( size ( y ) < 0 ) ) x = y ;
    par [ x ] += par [ y ] ;
    par [ y ] = x ;
    return true ;
  }
  public void solve ( int N , int M , @ Nonnull String a , @ Nonnull String b ) {
    UnionFind uf = new UnionFind ( N ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) uf . union ( a [ i ] , b [ i ] ) ;
    List < Integer > v = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < uf . par . length ;
    i ++ ) v . add ( uf . par [ i ] * ( - 1 ) ) ;
    if ( ( v . size ( ) == 1 ) && ( i < n ) ) System . out . println ( 0 ) ;
    else System . out . println ( v . size ( ) - 1 ) ;
    return ;
  }
  public void main ( String [ ] args ) {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNext ( ) ) {
      String line = scanner . next ( ) ;
      for ( String word : line . split ( " " ) ) {
        scanner . next ( ) ;
      }
    }
    scanner . close ( ) ;
  }
}
