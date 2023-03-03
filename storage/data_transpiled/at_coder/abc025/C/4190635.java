public static List < List < Integer >> B = new ArrayList < > ( ) {
  {
    for ( int i = 0 ;
    i < 2 ;
    i ++ ) {
      B . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
    }
  }
}
;
List < List < Integer >> C = new ArrayList < > ( ) {
  {
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      C . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
    }
  }
}
private static List < Integer > dp = new ArrayList < > ( 1 << 18 ) {
  private static final long serialVersionUID = 1L ;
  @ Override public int [ ] dfs ( int s , int t , int h ) {
    if ( dp . get ( s << 9 | t ) != null ) return dp . get ( s << 9 | t ) ;
    if ( h == 9 ) {
      int [ ] g = new int [ 9 ] ;
      for ( int i = 0 ;
      i < 9 ;
      i ++ ) g [ i ] = s >> i & 1 ? 1 : 2 ;
      int [ ] r = new int [ ] {
        0 , 0 }
        ;
        for ( int i = 0 ;
        i < 2 ;
        i ++ ) for ( int j = 0 ;
        j < 3 ;
        j ++ ) r [ g [ i * 3 + j ] != g [ ( i + 1 ) * 3 + j ] ] += B . get ( i ) . get ( j ) ;
        for ( int i = 0 ;
        i < 3 ;
        i ++ ) for ( int j = 0 ;
        j < 2 ;
        j ++ ) r [ g [ i * 3 + j ] != g [ i * 3 + j + 1 ] ] += C . get ( i ) . get ( j ) ;
        dp . set ( s << 9 | t ) ;
        return r ;
      }
    }
  }
  ;
  List < Integer > cnd = new ArrayList < > ( 9 ) ;
  cnd . add ( i ) ;
  List < Integer > wei = map ( cnd , i -> dfs ( s | ( 1 << i ) * ( ~ h & 1 ) , t | ( 1 << i ) * ( h & 1 ) , h + 1 ) ) ;
  dp . set ( s << 9 | t ) ;
  return wei ;
}
