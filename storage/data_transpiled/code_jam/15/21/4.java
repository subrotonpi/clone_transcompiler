static int solve ( ) {
  final int n ;
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( t ) ;
  i ++ ) {
    if ( k < 10 ) {
      return k ;
    }
    final int b = k % 10 ;
    final int a = ( int ) ( k / 10 ) ;
    final int digits = Integer . toString ( a ) . length ( ) ;
    return b * ( 10 * digits ) + flip ( a ) ;
  }
  final int [ ] solution = new int [ 10 ] ;
  for ( int n : xrange ( 10 ) ) {
    solution [ n ] = n ;
  }
  {
    if ( solution . length <= k ) {
      int best = solution [ k - 1 ] ;
      final int a = flip ( k ) ;
      if ( a < k && flip ( a ) == k ) {
        best = Math . min ( best , solution [ a ] ) ;
      }
      solution [ n ] = best + 1 ;
    }
  }
  {
    sol2 ( n ) ;
  }
  {
    if ( n < 100 ) {
      return sol ( n ) ;
    }
    final int digits = Integer . toString ( n ) . length ( ) ;
    final int m = ( int ) ( ( digits + 1 ) / 2 ) ;
    int target = n - ( n % ( 10 * m ) ) + 1 ;
    if ( n < target ) {
      final int n1 = target - 2 ;
      final int digits = Integer . toString ( n1 ) . length ( ) ;
      final int m = ( int ) ( ( digits + 1 ) / 2 ) ;
      target = n1 - ( n1 % ( 10 * m ) ) + 1 ;
    }
    if ( target == 10 * ( digits - 1 ) + 1 ) {
      final int n1 = target - 2 ;
      final int digits = Integer . toString ( n1 ) . length ( ) ;
      final int m = ( int ) ( ( digits + 1 ) / 2 ) ;
      target = n1 - ( n1 % ( 10 * m ) ) + 1 ;
    }
    return n - target + sol2 ( flip ( target ) ) + 1 ;
  }
  {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    System . out . println ( sol2 ( n ) ) ;
  }
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i : xrange ( t ) ) {
    System . out . println ( "Case #" +