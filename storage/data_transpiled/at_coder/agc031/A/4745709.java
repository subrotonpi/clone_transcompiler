public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int MOD = 10 * 9 + 7 ;
  String alp = "abcdefghijklmnopqrstuvwxyz" ;
  int [ ] countAlp = new int [ 26 ] ;
  for ( int i = 0 ;
  i < countAlp . length ;
  i ++ ) {
    countAlp [ alp . indexOf ( s ) ] ++ ;
  }
  for ( int i = 0 ;
  i < countAlp . length ;
  i ++ ) {
    count *= ( countAlp [ i ] + 1 ) ;
  }
  System . out . println ( ( count - 1 ) % MOD ) ;
  return MOD ;
}
