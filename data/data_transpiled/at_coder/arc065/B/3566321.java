public static List < Integer > inpl ( ) {
  return Arrays . asList ( Integer . parseInt ( input . readLine ( ) ) ) ;
  class UnionFind implements Comparator < Integer > {
    int [ ] par = new int [ num ] ;
    for ( int i = 0 ;
    i < par . length ;
    i ++ ) par [ i ] = - 1 ;
  }
  @ Override public Integer find ( Integer x ) {
    if ( par [ x ] < 0 ) return x ;
    else {
      x = par [ x ] ;
      return super . find ( x ) ;
    }
  }
  @ Override public void union ( Integer x , Integer y ) {
    int rx = super . find ( x ) ;
    int ry = super . find ( y ) ;
    if ( rx != ry ) {
      if ( par [ rx ] < par [ ry ] ) par [ ry ] = rx ;
      if ( par [ rx ] > par [ ry ] ) par [ rx ] = ry ;
      else {
        par [ rx ] -- ;
        par [ ry ] = rx ;
      }
    }
    return ;
  }
  int N = inpl ( ) ;
  int K = inpl ( ) ;
  int L = inpl ( ) ;
  UnionFind ufk = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int p = inpl ( ) ;
    int q = inpl ( ) ;
    ufk . union ( p - 1 , q - 1 ) ;
  }
  UnionFind ufr = new UnionFind ( N ) ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    int r = inpl ( ) ;
    int s = inpl ( ) ;
    ufr . union ( r - 1 , s - 1 ) ;
  }
  @ SuppressWarnings ( "unchecked" ) Map < Integer , Integer > ans = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) ans . put ( ufk . find ( i ) , ufr . find ( i ) ) ;
  List < Integer > Ans = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ans . add ( ans . get ( ufk . find ( i ) ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Ans . add ( ans . get ( ufr . find ( i ) ) ) ;
  System . out . println ( Ans ) ;
}
