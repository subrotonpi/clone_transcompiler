static final class UnionFind {
  private final int [ ] par ;
  private final int [ ] rank = new int [ n + 1 ] ;
  public int size ( int x ) {
    return - 1 * par [ find ( x ) ] ;
  }
  public int [ ] sizeList ( ) {
    return Arrays . copyOf ( par , par . length ) ;
  }
  public int indexOf ( int x ) {
    if ( ( par [ x ] < 1 ) || ( par [ x ] > 1 ) ) return x ;
    par [ x ] = find ( par [ x ] ) ;
    return par [ x ] ;
  }
  public boolean sameCheck ( int x , int y ) {
    return find ( x ) == find ( y ) ;
  }
  public boolean union ( int x , int y ) {
    int x = find ( x ) ;
    int y = find ( y ) ;
    if ( ( x == y ) || ( x == y ) ) return false ;
    if ( ( size ( x ) < size ( y ) ) || ( size ( y ) > 0 ) ) x = y ;
    par [ x ] += par [ y ] ;
    par [ y ] = x ;
    return true ;
  }
  public void solve ( int N , int M , String a , String b ) {
    UnionFind uf = new UnionFind ( N ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) uf . union ( a [ i ] , b [ i ] ) ;
    List < Integer > v = uf . sizeList ( ) ;
    if ( ( v . size ( ) == 1 ) && ( v . get ( 0 ) == 0 ) ) System . out . println ( 0 ) ;
    else System . out . println ( v . size ( ) - 1 ) ;
    return ;
  }
  public static void main ( String [ ] args ) {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNextLine ( ) ) {
      String line = scanner . nextLine ( ) ;
      while ( line . length ( ) > 0 ) {
        String word = line . split ( " " ) [ 0 ] ;
        scanner . advance ( word ) ;
      }
    }
    scanner . close ( ) ;
  }
}
