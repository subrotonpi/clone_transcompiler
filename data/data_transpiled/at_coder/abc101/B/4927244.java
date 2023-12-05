public static int N = Integer . parseInt ( input ) {
  String N_s = Lists . newArrayList ( String . valueOf ( N ) ) ;
  int len = Lists . newArrayList ( Integer . valueOf ( N_s ) ) . size ( ) ;
  return N % ( sum ( N_s ) == 0 ? 'Yes' : 'No' ) ;
}
