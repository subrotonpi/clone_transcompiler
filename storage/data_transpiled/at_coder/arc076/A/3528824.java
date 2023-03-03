static final int factorial ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final int D = 10 * 9 + 7 ;
  if ( Math . abs ( N - M ) >= 2 ) {
    System . out . println ( 0 ) ;
  }
  return D ;
}
