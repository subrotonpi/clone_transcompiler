public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String [ ] w = input . split ( " " ) ;
  int ct = 0 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    if ( w [ i ] . equals ( "TAKAHASHIKUN" ) || w [ i ] . equals ( "Takahashikun" ) || w [ i ] . equals ( "takahashikun" ) ) ct ++ ;
  }
  System . out . println ( ct ) ;
}
