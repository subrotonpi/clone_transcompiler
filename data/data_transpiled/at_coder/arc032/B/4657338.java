static final class UnionFind {
  private final int [ ] par ;
  private final int [ ] rank = new int [ n + 1 ] ;
  private int size ;
  private UnionFind ( int n ) {
    this . par = new int [ n + 1 ] ;
    this . rank [ 0 ] = n ;
  }
  public int size ( int x ) {
    return - 1 * this . par [ indexOf ( x ) ] ;
  }
  public int indexOf ( int x ) {
    if ( ( this . par [ x ] < 1 ) || ( this . par [ x ] > rank [ x ] ) ) return x ;
    this . par [ x ] = find ( this . par [ x ] ) ;
    return this . par [ x ] ;
  }
  public boolean sameCheck ( int x , int y ) {
    return indexOf ( x ) == find ( y ) ;
  }
  public boolean union ( int x , int y ) {
    int x = indexOf ( x ) ;
    int y = indexOf ( y ) ;
    if ( ( x == y ) || ( x == 0 ) ) return false ;
    if ( ( size ( x ) < size ( y ) ) || ( size ( y ) > rank [ x ] ) ) x = y ;
    else y = x ;
    par [ x ] += par [ y ] ;
    par [ y ] = x ;
    return true ;
  }
  @ SuppressWarnings ( "unchecked" ) public void solve ( int N , int M , @ SuppressWarnings ( "rawtypes" ) List < Integer > a , @ SuppressWarnings ( "rawtypes" ) List < Integer > b ) {
    UnionFind uf = new UnionFind ( N ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) uf . union ( a . get ( i ) , b . get ( i ) ) ;
    int ans = Arrays . stream ( uf . par ) . filter ( i -> i < 0 ) . count ( ) - 1 ;
    System . out . println ( ans ) ;
    return ;
  }
  public void main ( String [ ] args ) {
    /* Iterate through the input stream */
    Scanner scanner = new Scanner ( System . in ) ;
    while ( scanner . hasNext ( ) ) {
      String line = scanner . nextLine ( ) ;
      while ( line . length ( ) > 0 ) {
        String word = line . split ( " " ) [ 0 ] ;
        scanner . nextLine ( ) ;
      }
    }
  }
  