public static int D = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = ( 100 * D ) * N ;
  if ( N == 100 ) {
    System . out . println ( ( 100 * D ) * 101 ) ;
  }
  else {
    System . out . println ( ans ) ;
  }
  return ans ;
}
