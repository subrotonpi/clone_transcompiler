public static DisjointSet < Integer > createDisjointSet ( ) {
  int [ ] rank = new int [ N + 1 ] ;
  int [ ] p = new int [ N + 1 ] ;
  DisjointSet < Integer > ds ;
  {
    this . rank = new int [ N + 1 ] ;
    this . p = new int [ N + 1 ] ;
  }
  public void makeSet ( Integer x ) {
    this . p [ x ] = x ;
    this . rank [ x ] = 0 ;
  }
  public boolean same ( Integer x , Integer y ) {
    return findSet ( x ) == findSet ( y ) ;
  }
  public void unite ( Integer x , Integer y ) {
    link ( findSet ( x ) , findSet ( y ) ) ;
  }
  public void link ( Integer x , Integer y ) {
    if ( x == y ) return ;
    if ( ( rank [ x ] > rank [ y ] ) && ( rank [ x ] == rank [ y ] ) ) p [ y ] = x ;
    else {
      p [ x ] = y ;
      if ( ( rank [ x ] == rank [ y ] ) && ( rank [ y ] == 1 ) ) rank [ y ] ++ ;
    }
  }
  public Integer findSet ( Integer x ) {
    if ( ( x != null ) && ( p [ x ] != null ) ) p [ x ] = findSet ( p [ x ] ) ;
    return p [ x ] ;
  }
}
