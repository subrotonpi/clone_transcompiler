static final String print ( String [ ] args ) {
  int inf = 10 * 20 ;
  int mod = 10 * 9 + 7 ;
  {
    int [ ] li = new LinkedList ( ) ;
    int [ ] ii = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      li [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] ii = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ii [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] ls = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ls [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] r = new int [ n ] ;
    int s = sum ( a ) ;
    int t = inf ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int ai = b [ i ] ;
      int bi = b [ i ] ;
      if ( bi == 0 ) {
        r [ 0 ] += s ;
        break ;
      }
      int ti = ( ai - b [ i + 1 ] ) * ( i + 1 ) ;
      if ( t > bi ) t = bi ;
      r [ t ] += ti ;
      s -= ti ;
    }
    return r [ 0 ] ;
  }
}
