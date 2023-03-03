public static boolean f ( int n , int g , int e ) {
  int p = Integer . parseInt ( input ( ) ) ;
  int [ ] [ ] s = new int [ n + 1 ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < p ;
  i ++ ) {
    s [ i ] [ n ] = 1 ;
  }
  for ( int i = 0 ;
  i < e ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    s [ a ] [ b ] = 1 ;
    s [ b ] [ a ] = 1 ;
  }
  {
    boolean [ ] v = new boolean [ n + 1 ] ;
    if ( n == 0 ) return true ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ! v [ i ] && s [ i ] [ i ] > 0 ) {
        if ( v [ i ] ) {
          s [ i ] -- ;
          s [ i ] ++ ;
          return true ;
        }
      }
    }
  }
  return false ;
}
