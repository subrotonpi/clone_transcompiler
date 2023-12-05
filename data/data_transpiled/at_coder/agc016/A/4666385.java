public static void input ( ) {
  String s = input ( ) ;
  Set < Character > chars = Character . getChars ( s ) ;
  int ans = s . length ( ) ;
  for ( char c : chars ) {
    int maxPartialCharLength = Math . max ( chars . size ( ) , c ) ;
    ans = Math . min ( ans , maxPartialCharLength ) ;
  }
  System . out . println ( ans ) ;
}
