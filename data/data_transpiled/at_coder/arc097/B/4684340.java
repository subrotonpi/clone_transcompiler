static final class UnionFind {
  private final int [ ] par ;
  private final int [ ] rank = new int [ n + 1 ] ;
  private int [ ] rank = new int [ n + 1 ] ;
  public int size ( int x ) {
    return - 1 * par [ find ( x ) ] ;
  }
  public int indexOf ( int x ) {
    if ( ( par [ x ] < 1 ) || ( par [ x ] > rank [ x ] ) ) return x ;
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
    if ( ( size ( x ) < size ( y ) ) || ( size ( y ) > rank [ x ] ) ) x = y ;
    par [ x ] += par [ y ] ;
    par [ y ] = x ;
    return true ;
  }
  public void solve ( int N , int M , String p , String x , String y ) {
    UnionFind uf = new UnionFind ( N ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) uf . union ( x [ i ] , y [ i ] ) ;
    int ans = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) if ( ( uf . sameCheck ( p [ i ] , i + 1 ) ) && ( ans < N ) ) ans ++ ;
    System . out . println ( ans ) ;
    return ;
  }
  public void main ( String [ ] args ) {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNextLine ( ) ) {
      String line = scanner . nextLine ( ) ;
      while ( line . length ( ) > 0 ) {
        scanner . close ( ) ;
      }
    }
    String [ ] tokens = new String [ N ] ;
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int M = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [ ] p = new int [ N ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) p [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int [