public static int solve ( int N , int X , int [ ] [ ] g ) {
  boolean [ ] visited = new boolean [ N ] ;
  HashMap < Integer , Integer > map = new HashMap < Integer , Integer > ( ) ;
  Stack < Integer > st = new Stack < Integer > ( ) ;
  st . push ( new Integer ( 0 ) ) ;
  while ( st . size ( ) > 0 ) {
    int v = st . pop ( ) ;
    int r = g [ v ] [ 0 ] ;
    visited [ v ] = true ;
    if ( map . containsKey ( r ) ) {
      map . put ( r , ++ v ) ;
    }
    else {
      map . put ( r , 1 ) ;
    }
    for ( int i = 0 ;
    i < g [ v ] [ 0 ] ;
    i ++ ) {
      int tpl = g [ v ] [ i ] ;
      int w = tpl ;
      int c = tpl ;
      if ( ! visited [ w ] ) {
        st . push ( new Integer ( w ) ) ;
        st . push ( new Integer ( r ^ c ) ) ;
      }
    }
  }
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > entry : map . entrySet ( ) ) {
    int a = entry . getKey ( ) ;
    int na = entry . getValue ( ) ;
    int b = a ^ X ;
    if ( b == a ) {
      ans += na * ( na - 1 ) ;
    }
    else if ( map . containsKey ( b ) ) {
      ans += na * map . get ( b ) ;
    }
  }
  ans = ans / 2 ;
  return ans ;
}
