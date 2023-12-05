static final String print ( ) {
  System . setProperty ( "line.separator" , " " ) ;
  String input = System . getProperty ( "line.separator" ) ;
  class UnionFind implements UnionFind {
    int [ ] parent = new int [ size ] ;
    int [ ] rank = new int [ size ] ;
    public int indexOf ( int x ) {
      if ( parent [ x ] == x ) return x ;
      else return find ( parent [ x ] ) ;
    }
    public int [ ] union ( int x , int y ) {
      int x = find ( x ) ;
      int y = find ( y ) ;
      if ( x == y ) return null ;
      if ( rank [ x ] < rank [ y ] ) parent [ x ] = y ;
      else {
        parent [ y ] = x ;
        if ( rank [ x ] == rank [ y ] ) rank [ x ] ++ ;
      }
      return null ;
    }
    public boolean same ( int x , int y ) {
      return find ( x ) == find ( y ) ;
    }
    public Set < Integer > component ( ) {
      Set < Integer > comp = new HashSet < Integer > ( ) ;
      for ( int i = 0 ;
      i < parent . length ;
      i ++ ) {
        int p = find ( parent [ i ] ) ;
        comp . add ( p ) ;
      }
      return comp ;
    }
    public String toString ( ) {
      StringBuilder ret = new StringBuilder ( "parents\n" ) ;
      ret . append ( Arrays . toString ( parent ) ) ;
      ret . append ( '\n' ) ;
      ret . append ( Arrays . toString ( rank ) ) ;
      return ret . toString ( ) ;
    }
  }
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  UnionFind Un = new UnionFind ( N + 1 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    Un . union ( a , b ) ;
  }
  int g = Un . component ( ) . size ( ) ;
  System . out . println ( g - 2 ) ;
  return Un . component ( ) ;
}
