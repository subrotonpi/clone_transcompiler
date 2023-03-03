@ Produces @ ApplicationScoped public static void accumulate1 ( @ New @ ApplicationContext ( "ac" ) final Accumulator ac ) {
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final int m = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] s = new int [ n + 1 ] ;
  final List < Integer > [ ] p = new List [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    p [ i ] = Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    s [ p [ i ] . x - 1 ] ++ ;
    s [ p [ i ] . y ] -- ;
  }
  s = Lists . newArrayList ( ac . accumulate ( s ) ) . subList ( 0 , s . length - 1 ) ;
  Arrays . sort ( s ) ;
  Arrays . sort ( s ) ;
  final List < Integer > k = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    if ( s [ p [ i ] . y ] - s [ p [ i ] . x - 1 ] == 0 ) {
      k . add ( i + 1 ) ;
    }
  }
  System . out . println ( k . size ( ) ) ;
  for ( int i : k ) {
    System . out . println ( i ) ;
  }
}
