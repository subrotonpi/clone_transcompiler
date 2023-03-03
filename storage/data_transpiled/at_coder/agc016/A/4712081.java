@ VisibleForTesting static String from ( String input ) {
  String s = input . trim ( ) ;
  int ans = 100 ;
  for ( char c : asciiLowercase ) {
    ans = Math . min ( ans , Math . max ( s . length ( ) , c ) ) ;
  }
  System . out . println ( ans ) ;
  return s ;
}
