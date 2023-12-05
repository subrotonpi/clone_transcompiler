static final String nextLine ( ) {
  final String input = System . console ( ) . readLine ( ) ;
  final int [ ] [ ] SE = new int [ N ] [ ] ;
  final int N = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int S = Integer . parseInt ( input ) ;
    int E = Integer . parseInt ( input ) ;
    S = S - S % 5 ;
    E = E + ( 5 - E ) % 5 ;
  }
  return SE [ 0 ] [ 0 ] ;
}
