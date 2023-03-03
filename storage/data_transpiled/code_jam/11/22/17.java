public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    C = Integer . parseInt ( readLine ( ) ) ;
    D = Integer . parseInt ( readLine ( ) ) ;
    List < Integer > PV = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < xrange ( C ) ;
    j ++ ) PV . add ( Integer . parseInt ( readLine ( ) ) ) ;
    Collections . sort ( PV ) ;
    N = Integer . valueOf ( PV . get ( 1 ) ) ;
    int [ ] pos = Arrays . stream ( PV . toArray ( ) ) . mapToInt ( i -> ( new Integer ( pv [ 0 ] ) * pv [ 1 ] ) ) . mapToInt ( i -> - 10 * 10 ) . toArray ( ) ;
    int [ ] left = new int [ N + 2 ] , right = new int [ N + 2 ] ;
    for ( int j : xrange ( 2 , N + 1 ) ) left [ j ] = Math . max ( 0 , left [ j - 1 ] + D - pos [ j ] + pos [ j - 1 ] ) ;
    for ( int j : xrange ( N - 1 , 0 , - 1 ) ) right [ j ] = Math . max ( 0 , right [ j + 1 ] + D - pos [ j + 1 ] + pos [ j ] ) ;
    System . out . printf ( "Case #%d: %.1f%n" , i + 1 , Math . max ( Math . min ( left [ j ] , right [ j ] ) + Math . abs ( left [ j ] - right [ j ] ) * .5 ) ) ;
  }
}
