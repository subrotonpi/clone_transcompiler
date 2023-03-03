public static void print ( int n ) {
  String [ ] s = input . nextLine ( ) . replaceAll ( "\\." , "" ) . split ( " " ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s [ i ] . equals ( "TAKAHASHIKUN" ) || s [ i ] . equals ( "Takahashikun" ) || s [ i ] . equals ( "takahashikun" ) ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
