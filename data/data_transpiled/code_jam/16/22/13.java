static final int solve ( String input , String ... args ) {
  final int T = Integer . parseInt ( input ) ;
  /* read the input */
  final int [ ] reads = new int [ T + 1 ] ;
  for ( int i = 1 ;
  i < reads . length ;
  i ++ ) {
    reads [ i ] = Integer . parseInt ( input . substring ( i , i + 1 ) ) ;
  }
  final int T = read ( input ) ;
  /* read the input */
  final String C = input . substring ( 0 , i ) + c + w . substring ( i + 1 ) ;
  /* read the input */
  final String J = input . substring ( i + 1 , i + 1 ) ;
  /* read the input */
  System . err . println ( "Case #{0}" . format ( T ) ) ;
  /* read the input */
  final String C = solve ( C , J ) ;
  /* read the input */
  final String C = solve ( C , C ) ;
  final String J = solve ( J , J ) ;
  /* read the input */
  assert ( C . length ( ) == J . length ( ) ) ;
  if ( ! "?" . equals ( C + J ) ) {
    /* read the input */
    final int i = Math . min ( i , C . length ( ) ) ;
    if ( i > 0 && Integer . parseInt ( C . substring ( 0 , i ) ) < Integer . parseInt ( J . substring ( 0 , i ) ) ) {
      /* read the input */
      C = maximize ( C ) ;
      J = minimize ( J ) ;
      /* read the input */
    }
    else if ( i > 0 && Integer . parseInt ( C . substring ( 0 , i ) ) > Integer . parseInt ( J . substring ( 0 , i ) ) ) {
      /* read the input */
      C = minimize ( C ) ;
      J = maximize ( J ) ;
      /* read the input */
    }
    else {
      /* read the input */
      C = solve ( C , J ) ;
      J = solve ( C , i , prv ( c ) ) ;
      /* read the input */
    }
  }
  return T ;
}
