public static String input ( ) {
  String s = input ( ) ;
  int n = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int l = Integer . parseInt ( input ( ) ) ;
    int r = Integer . parseInt ( input ( ) ) ;
    if ( l != 1 ) {
      s = s . substring ( 0 , l - 1 ) + s . substring ( l - 1 , r ) + s . substring ( r ) ;
    }
    else {
      s = s . substring ( l - 1 , r ) + s . substring ( r ) ;
    }
  }
  System . out . println ( s ) ;
  return s ;
}
