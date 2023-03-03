public static int getInt ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) . trim ( ) . split ( "\\s+" ) [ 0 ] ) , M = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
  int ans ;
  if ( N == 1 && M == 1 ) ans = 1 ;
  else if ( N == 1 ) ans = M - 2 ;
  else ans = ( N - 2 ) * ( M - 2 ) ;
  return ans ;
}
