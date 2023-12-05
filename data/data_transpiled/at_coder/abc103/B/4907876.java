static final String input ( ) {
  String s = input ( ) ;
  String t = input ( ) ;
  int n = s . length ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . substring ( i ) + s . substring ( 0 , i ) . equals ( t ) ) {
      System . out . println ( "Yes" ) ;
      System . exit ( 0 ) ;
    }
  }
  System . out . println ( "No" ) ;
}
