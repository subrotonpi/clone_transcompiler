public static int N = Integer . parseInt ( input ) {
  String S = String . valueOf ( input ) ;
  int check = 0 ;
  int ans = 0 ;
  for ( String s : S . split ( " " ) ) {
    if ( s . equals ( "I" ) ) check ++ ;
    if ( s . equals ( "D" ) ) check -- ;
    ans = Math . max ( ans , check ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
