@ VisibleForTesting static void fractions ( Scanner input ) {
  final int X = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = 2 * X / Y ;
  boolean f = false ;
  for ( ;
  N <= N ;
  N = N - 5 ) {
    if ( N <= 0 ) continue ;
    if ( X * N % Y != 0 ) continue ;
    final Fraction M = new Fraction ( N * ( N + 1 ) - new Fraction ( 2 * X * N , Y ) , 2 ) ;
    if ( M . denominator ( ) == 1 && 1 <= M . compareTo ( N ) <= 0 ) {
      System . out . println ( N + " " + ( int ) M . numerator ( ) ) ;
      f = true ;
    }
  }
  if ( f == false ) System . out . println ( "Impossible" ) ;
}
