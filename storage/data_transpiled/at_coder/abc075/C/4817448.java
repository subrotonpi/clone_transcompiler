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
    if ( ( size ( x ) < size ( y ) ) || ( y == x ) ) x = y ;
    par [ x ] += par [ y ] ;
    par [ y ] = x ;
    return true ;
  }
  public void solve ( int N , int M , String [ ] a , String [ ] b ) {
    int ans = 0 ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      UnionFind uf = new UnionFind ( N ) ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        if ( ( j == i ) || ( j == j ) ) continue ;
        else uf . union ( a [ j ] , b [ j ] ) ;
      }
      if ( ( ! uf . sameCheck ( a [ i ] , b [ i ] ) ) ) ans ++ ;
    }
    System . out . println ( ans ) ;
    return ;
  }
  public static void main ( String [ ] args ) {
    String [ ] tokens ;
    try {
      BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
      String line ;
      while ( ( line = br . readLine ( ) ) != null ) {
        for ( String word : line . split ( " " ) ) {
          System . out . println ( word ) ;
        }
      }
    }
    catch ( IOException e ) {
      e . printStackTrace ( ) ;
    }
    String [ ] tokens = tokens ;
    N = Integer . parseInt ( tokens [ 0 ] ) ;
    M = Integer . parseInt ( tokens [ 1 ] ) ;
    int [ ] a = new int [ M ] ;
    int [ ] b = new int [ M