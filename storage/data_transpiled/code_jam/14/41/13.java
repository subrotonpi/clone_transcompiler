public static void mtree ( int [ ] v , int i , int j ) {
  if ( j - i == 1 ) {
    int x = new int ( ) {
    }
    ;
    x . m = v [ i ] ;
    x . l = x . r = null ;
    return ;
  }
  int k = i + j >>> 1 ;
  int x = new int ( ) {
  }
  ;
  x . l = mtree ( v , i , k ) ;
  x . r = mtree ( v , k , j ) ;
  x . m = Math . max ( x . l . m , x . r . m ) ;
  /* rem */
  if ( v [ i ] < t ) {
    return ;
  }
  if ( v [ i ] > t ) {
    if ( v [ i ] >= t ) {
      rem ( v [ i ] , t ) ;
      v [ i ] = Math . max ( v [ i ] . m , v [ i ] . r . m ) ;
    }
    else {
      rem ( v [ i ] , t ) ;
      v [ i ] = Math . max ( v [ i ] . m , v [ i ] . r . m ) ;
    }
  }
  else {
    v [ i ] = - 10 * 100 ;
  }
  /* getmax */
  int ww = 0 ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int cas = 1 ;
  cas <= z ;
  cas ++ ) {
    n = Integer . parseInt ( input . nextLine ( ) ) ;
    x = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] v = new int [ n ] ;
    for ( int vv = 0 ;
    vv < v . length ;
    vv ++ ) {
      v [ vv ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    Arrays . sort ( v ) ;
    int tree = mtree ( v , 0 , v . length ) ;
    TreeMap < Integer , Integer > count = new TreeMap < Integer , Integer > ( ) ;
    for ( int vv : v ) {
      count . put ( vv , ++ ans ) ;
    }
    int ans = 0 ;
    for ( int i = xrange ( v . length - 1 , n , - 1 ) ;
    i >= 0 ;
    i -- ) {
      if ( count . get ( v [ i ] ) == null ) continue ;
      count . put ( v [ i ] , -- ans ) ;
      rem ( tree , v [ i ] ) ;
      ans ++ ;
      w = getmax ( tree , x -