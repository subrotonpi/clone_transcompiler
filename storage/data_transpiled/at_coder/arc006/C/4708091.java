public static void main ( String input ) {
  int n = Integer . parseInt ( input . trim ( ) ) ;
  int [ ] s = new int [ n ] ;
  s [ 0 ] = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    if ( a > s [ i ] ) {
      s [ i ] = a ;
    }
  }
}
