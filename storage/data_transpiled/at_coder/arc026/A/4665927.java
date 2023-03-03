public static int N ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = 0 ;
  if ( N >= 5 ) t = ( N - 5 ) * A + 5 * B ;
  else t = N * B ;
  return t ;
}
