public static String oneTest ( ) {
  String s = input . nextLine ( ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    res = Math . max ( s . charAt ( i ) + res , res + s . charAt ( i ) ) ;
  }
  return res ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= t ;
  i ++ ) {
    System . out . println ( "Case #" + i + ": " + oneTest ( ) ) ;
  }
  return "" ;
}
