public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] ww = input . nextLine ( ) . split ( " " ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < ww . length ;
  i ++ ) {
    String w = ww [ i ] ;
    if ( i == n - 1 ) w = w . substring ( 0 , w . length ( ) - 1 ) ;
    if ( w . equals ( "TAKAHASHIKUN" ) || w . equals ( "Takahashikun" ) || w . equals ( "takahashikun" ) ) {
      res ++ ;
    }
  }
  System . out . println ( res ) ;
}
