static final int [ ] getDaysFraction ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input ) ;
  int [ ] [ ] a = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input ) ;
    x -- ;
    a [ x ] [ i ] = i + 1 ;
  }
  int [ ] dp = new int [ n ] ;
  int [ ] [ ] ya = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ya [ i ] [ 0 ] = i ;
    for ( int j = 0 ;
    j < a [ i ] [ 0 ] ;
    j ++ ) {
      dfs ( j , a [ i ] [ j ] + 1 ) ;
    }
  }
  dfs ( 0 , 0 ) ;
  Arrays . sort ( ya , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return - o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  LinkedList < Integer > tmp = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int bb = ya [ i ] [ 1 ] ;
    for ( int j = a [ bb ] ;
    j < bb ;
    j ++ ) {
      tmp . add ( dp [ j ] ) ;
    }
    tmp . add ( bb ) ;
  }
  Collections . sort ( tmp ) ;
  int dai = 0 ;
  for ( int j = tmp . size ( ) ;
  j > 0 ;
  j -- ) {
    int cc = tmp . remove ( j ) ;
    cc += j ;
    dai = Math . max ( dai , cc ) ;
  }
  dp [ bb ] = dai ;
  return dp ;
}
