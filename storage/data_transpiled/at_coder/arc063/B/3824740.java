static void print ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  final int N = ( Integer ) Integer . parseInt ( input ) ;
  final int T = ( Integer ) Integer . parseInt ( input ) ;
  final int [ ] A = Arrays . copyOf ( A , T ) ;
  for ( int i = N - 2 ;
  i >= 0 ;
  i -- ) {
    if ( A [ i ] > ma ) {
      ma = A [ i ] ;
      mas = 1 ;
    }
    else if ( A [ i ] == ma ) {
      mas ++ ;
    }
    else {
      if ( ma - A [ i ] > resma ) {
        resma = ma - A [ i ] ;
        rescc = 1 ;
      }
      else if ( ma - A [ i ] == resma ) {
        rescc ++ ;
      }
      else {
      }
    }
  }
  System . out . println ( rescc ) ;
}
