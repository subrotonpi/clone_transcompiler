public static String [ ] [ ] getStrings ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] s = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = input . nextLine ( ) ;
  String [ ] [ ] ans = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ans [ i ] = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) ans [ i ] [ N - j - 1 ] [ i ] = s [ N - j - 1 ] [ i ] ;
    System . out . println ( ans [ i ] ) ;
  }
  return ans ;
}
