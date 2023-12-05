public static int N ( int M ) {
  int ans = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( ( N != 1 ) && ( M != 1 ) ) ) ans = ( N - 2 ) * ( M - 2 ) ;
  else ans = 1 ;
  return ans ;
}
