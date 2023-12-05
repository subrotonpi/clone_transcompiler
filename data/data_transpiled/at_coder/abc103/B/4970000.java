public static String rot ( String s ) {
  String ret = s . substring ( s . length ( ) - 1 ) + s . substring ( 0 , s . length ( ) - 1 ) ;
  return ret ;
  String s1 = input . next ( ) ;
  String s2 = input . next ( ) ;
  String tmp = s1 ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < s1 . length ( ) ;
  i ++ ) {
    tmp = rot ( tmp ) ;
    if ( tmp . equals ( s2 ) ) {
      flag = true ;
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return ret ;
}
