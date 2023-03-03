public static int N = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int MOD = 10 * 9 + 7 ;
  int [ ] chars = new int [ 30 ] ;
  for ( String s : S . toCharArray ( ) ) chars [ ( s ) - 97 ] ++ ;
  int res = 1 ;
  for ( int c : chars ) res = ( res * c ) % MOD ;
  res = ( res - 1 ) % MOD ;
  System . out . println ( res ) ;
  return res ;
}
