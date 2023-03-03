public static void unite ( int n , int m ) {
  List < List < Integer >> ab = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ab . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  }
  class UnionFind implements Comparable {
    int [ ] parent = new int [ size ] ;
    int [ ] rank = new int [ size ] ;
    for ( int i = 0 ;
    i < size ;
    i ++ ) {
      ab . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
    }
  }
  public int find ( int x ) {
    if ( parent [ x ] == x ) {
      return x ;
    }
    else {
      return find ( parent [ x ] ) ;
    }
  }
  public boolean unite ( int x , int y ) {
    int x = find ( x ) ;
    int y = find ( y ) ;
    if ( x == y ) return true ;
    if ( rank [ x ] < rank [ y ] ) rank [ x ] ++ ;
    return true ;
  }
}
