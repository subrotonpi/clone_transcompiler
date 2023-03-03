public static int is753 ( String s ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Integer . parseInt ( s ) > N ) return 0 ;
  int ret = 1 ;
  for ( char c : "753" ) ret += is753 ( s + c ) ;
  return ret ;
}
