static final class UnionFind {
  private int [ ] par ;
  private int [ ] rank = new int [ n + 1 ] ;
  public int size ( int x ) {
    return - 1 * par [ find ( x ) ] ;
  }
  public int [ ] sizeList ( ) {
    return Arrays . copyOf ( par , 1 ) ;
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
  public void solve ( int N , int M , String p [ ] , String x [ ] , String y [ ] ) {
    UnionFind uf = new UnionFind ( N ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) uf . union ( x [ i ] , y [ i ] ) ;
    int ans = 0 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) if ( ( uf . sameCheck ( i , p [ i - 1 ] ) ) && ( uf . sameCheck ( i , p [ i ] ) ) ) ans ++ ;
    System . out . println ( ans ) ;
    return ;
  }
  public void main ( String [ ] args ) {
    String line ;
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    String [ ] tokens = br . readLine ( ) . split ( " " ) ;
    N = Integer . parseInt ( tokens [ 0 ] ) ;
    M = Integer . parseInt ( tokens [ 1 ] ) ;
    p = new int [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) p [ i ] = Integer . parseInt ( tokens [ 2 ] ) ;
    int [ ] x = new int [ N ] ;
    int [ ] y = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++