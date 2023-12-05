public static int N ( ) {
  String [ ] W = input . nextLine ( ) . split ( " " ) ;
  int ans = 0 ;
  for ( String w : W ) {
    w = w . replace ( "." , "" ) ;
    if ( w . equals ( "TAKAHASHIKUN" ) || w . equals ( "Takahashikun" ) || w . equals ( "takahashikun" ) ) {
      ans ++ ;
    }
  }
  return ans ;
}
