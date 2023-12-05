public static void inpl ( ) {
  inpl ( ) ;
  String S = input . nextLine ( ) ;
  int ans = 0 ;
  int g = 0 ;
  int p = 0 ;
  for ( String s : S . split ( " " ) ) {
    if ( g == p ) {
      g ++ ;
      if ( s . equals ( "g" ) ) {
      }
      else if ( s . equals ( "p" ) ) {
        ans -- ;
      }
    }
    else {
      p ++ ;
      if ( s . equals ( "g" ) ) {
        ans ++ ;
      }
      else if ( s . equals ( "p" ) ) {
      }
    }
  }
  System . out . println ( ans ) ;
}
