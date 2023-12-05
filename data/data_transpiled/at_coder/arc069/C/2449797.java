public static int [ ] getHigherRange ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] lis = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) lis [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int key = lis [ 0 ] ;
  int [ ] num = new int [ n ] ;
  List < Integer > li = new ArrayList < > ( ) ;
  li . add ( key ) ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    if ( lis [ i ] > key ) {
      key = lis [ i ] ;
      num [ i ] = i ;
      li . add ( key ) ;
    }
  }
  int m = li . size ( ) ;
  int [ ] nu = new int [ m ] ;
  for ( int i = 0 ;
  i < m - 1 ;
  i ++ ) nu [ i ] = li . get ( 0 ) ;
  for ( int i = 1 ;
  i < m - 1 ;
  i ++ ) nu [ i ] = li . get ( i + 1 ) - li . get ( i ) ;
  int [ ] he = new int [ m ] ;
  int [ ] cou = new int [ m ] ;
  synchronized ( li ) {
    for ( int k : lis ) {
      int sen = li . get ( k ) ;
      cou [ sen ] += k - li . get ( sen ) ;
      he [ sen ] ++ ;
    }
    key = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      key += he [ i ] ;
      he [ i ] = key ;
    }
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      cou [ i ] += he [ i ] * nu [ i ] ;
    }
  }
  int [ ] ans = new int [ n ] ;
  for ( int i = 0 , c = 0 ;
  i < n ;
  i ++ ) ans [ i ] = c ;
  for ( int r : ans ) System . out . println ( r ) ;
  return ans ;
}
