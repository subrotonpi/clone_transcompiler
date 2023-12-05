public static void print ( int N ) {
  final int [ ] [ ] G = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] G2 = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) G2 [ i ] = FloydWarshall ( G , false ) ;
  if ( Arrays . equals ( G , G2 ) ) System . out . println ( - 1 ) ;
  else {
    G [ G == 0 ? 0 : 1 ] = 2 * 10 * 9 ;
    int t = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) for ( int j = i + 1 ;
    j < N ;
    j ++ ) {
      int n = Math . min ( G [ i ] [ j ] , G2 [ i ] [ j ] ) ;
      if ( n > G [ i ] [ j ] ) t += G [ i ] [ j ] ;
    }
  }
  System . out . println ( t ) ;
}
