public static int N = Integer . parseInt ( input ) {
  String S = input ;
  int res = 0 ;
  int tmp = 0 ;
  for ( String s : S . split ( " " ) ) {
    if ( s . equals ( "I" ) ) tmp ++ ;
    if ( s . equals ( "D" ) ) tmp -- ;
    res = Math . max ( tmp , res ) ;
  }
  System . out . println ( res ) ;
  return res ;
}
