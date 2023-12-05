static final int Q = Integer . parseInt ( input ) {
  final IntBinaryOperator num = ( x ) -> Math . max ( 0 , ( x - 1 ) / K ) ;
  final IntBinaryOperator sub = ( xs , ys ) -> xs . stream ( ) . mapToInt ( x -> x - ys . min ( ) ) . sum ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    final int A = Integer . parseInt ( input . nextLine ( ) ) ;
    final int B = Integer . parseInt ( input . nextLine ( ) ) ;
    final int C = Integer . parseInt ( input . nextLine ( ) ) ;
    final int D = Integer . parseInt ( input . nextLine ( ) ) ;
    final double K = Math . ceil ( Math . max ( A , B ) / ( Math . min ( A , B ) + 1 ) ) ;
    int l = 0 , r = A + 1 ;
    while ( r - l > 1 ) {
      final int m = ( l + r ) / 2 ;
      final int rA = sub . apply ( ( A , B ) -> num . apply ( m ) ) ;
      final int rB = sub . apply ( ( A , B ) -> num . apply ( m ) ) ;
      l = ( ( m < rA ) ? r : m ) ;
      r = ( ( l < rA ) ? rA : m ) [ ( rA + 1 ) * K < rB ] : rB ;
    }
    final StringBuffer sb = new StringBuffer ( ) ;
    for ( int i = C - 1 ;
    i < D ;
    i ++ ) {
      int na = num . apply ( l ) ;
      int nb = num . apply ( B ) ;
      if ( i < na + nb ) {
        sb . append ( i < nb ? ( 'A' + i ) : ( 'B' + i ) ) ;
      }
      else {
        nb = num . apply ( B - nb ) ;
        int j = A + B - i - 1 ;
        sb . append ( j < na ? ( 'B' + j ) : ( 'B' + j ) ) ;
      }
    }
    System . out . println ( sb ) ;
  }
  return 0 ;
}
