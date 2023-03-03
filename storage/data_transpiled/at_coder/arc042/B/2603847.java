public static final double [ ] getPolynomial ( ) {
  final double tX = Integer . parseInt ( input . nextLine ( ) ) ;
  final double tY = Integer . parseInt ( input . nextLine ( ) ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> poly = new ArrayList < > ( ) ;
  for ( String e : System . console ( ) . readLine ( ) . split ( " " ) ) {
    poly . add ( Collections . singletonList ( Integer . parseInt ( e ) ) ) ;
  }
  final List < Double > ans = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final List < Integer > p1 = poly . get ( i - 1 ) ;
    final List < Integer > p2 = poly . get ( i ) ;
    final Complex p = new Complex ( p2 . get ( 0 ) - p1 . get ( 0 ) , p2 . get ( 1 ) - p1 . get ( 1 ) ) ;
    final Complex t = new Complex ( tX - p1 . get ( 0 ) , tY - p1 . get ( 1 ) ) ;
    t . mul ( p . conjugate ( ) / Math . abs ( p ) ) ;
    ans . add ( Math . abs ( t . imag ( ) ) ) ;
  }
  System . out . println ( Math . min ( ans ) ) ;
  return ans . toArray ( ) ;
}
