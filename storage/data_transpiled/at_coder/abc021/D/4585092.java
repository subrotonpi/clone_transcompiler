static final double factorial ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  double a = ( Math . factorial ( n + k - 1 ) ) % ( 10 * * 9 + 7 ) ;
  return a ;
}
