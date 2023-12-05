public static void main ( String [ ] args ) {
  int A = Integer . parseInt ( input ) ;
  int x = A * A ;
  int y = ( A + 1 ) * ( A + 1 ) ;
  ArrayList < Integer > xlst = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > ylst = new ArrayList < Integer > ( ) ;
  while ( ( y > 0 ) && ( x != 0 ) ) {
    xlst . add ( x % 100 ) ;
    x /= 100 ;
    ylst . add ( y % 100 ) ;
    y /= 100 ;
  }
  int xans = 0 ;
  while ( ( xlst . size ( ) - 1 ) == ylst . size ( ) && ( sum ( xlst ) > 0 ) ) {
    xans = xans * 100 + xlst . get ( xlst . size ( ) - 1 ) ;
    xlst . remove ( xlst . size ( ) - 1 ) ;
    ylst . remove ( ylst . size ( ) - 1 ) ;
  }
  int yans = xans ;
  do {
    if ( sum ( xlst ) > 0 ) {
      xans = xans * 100 + xlst . get ( xlst . size ( ) - 1 ) ;
      yans = yans * 100 + ylst . get ( ylst . size ( ) - 1 ) ;
      xlst . remove ( xlst . size ( ) - 1 ) ;
      ylst . remove ( ylst . size ( ) - 1 ) ;
      if ( ( sum ( xlst ) > 0 ) && ( yans > xans + 1 || sum ( ylst ) > 0 ) ) {
        System . out . println ( xans + 1 ) ;
        exit ( ) ;
      }
    }
    else {
      System . out . println ( xans ) ;
      exit ( ) ;
    }
  }
  while ( ( xlst . size ( ) - 1 ) > 0 ) ;
}
