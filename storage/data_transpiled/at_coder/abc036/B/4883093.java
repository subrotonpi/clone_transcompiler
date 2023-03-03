public static String [ ] [ ] getStrings ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] s = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) s [ i ] [ i ] = new String ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String t = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) t += s [ N - 1 - j ] [ i ] ;
    System . out . println ( t ) ;
  }
  return s ;
}
