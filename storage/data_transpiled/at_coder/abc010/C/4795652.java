public static void print ( String txa , String tya , String txb , String tyb , double T , double V ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] xy = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xy [ i ] [ 0 ] = Integer . parseInt ( input ( ) ) ;
    xy [ i ] [ 1 ] = Integer . parseInt ( input ( ) ) ;
  }
  boolean flag = false ;
  for ( int i = 0 ;
  i < xy . length ;
  i ++ ) {
    if ( ( ( txa - xy [ i ] [ 0 ] ) * ( txa - xy [ i ] [ 0 ] ) + ( tya - xy [ i ] [ 1 ] ) * ( tya - xy [ i ] [ 1 ] ) ) * 0.5 + ( ( xy [ i ] [ 0 ] - txb ) * ( tyb - xy [ i ] [ 1 ] ) + ( tyb - xy [ i ] [ 1 ] ) * ( tyb - xy [ 1 ] ) ) * 0.5 <= T * V ) {
      flag = true ;
      break ;
    }
  }
  System . out . println ( flag ? "YES" : "NO" ) ;
}
