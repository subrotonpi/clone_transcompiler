static final String input ( ) {
  String input = System . console ( ) . readLine ( ) ;
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int ans = ( - 1 ) * K * ( A - B ) ;
  return ( Math . abs ( ans ) <= 10 * * 18 ) ? ans : "Unfair" ;
}
