public static double [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cost = new int [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) cost [ i ] = Lists . newArrayList ( ) ;
  int [ ] color = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) color [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) color [ i ] = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int m = ( i + j ) % 3 ;
      mod3 [ m ] . add ( color [ i ] [ j ] ) ;
    }
  }
  @ SuppressWarnings ( "unchecked" ) LinkedHashMap < Integer , ArrayList < Integer >> cnts = new LinkedHashMap < Integer , ArrayList < Integer >> ( ) ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) cnts . put ( mod3 [ i ] , new ArrayList < Integer > ( ) ) ;
  double ans = Double . POSITIVE_INFINITY ;
  for ( int [ ] comb : combinations ( C , 3 ) ) {
    for ( int [ ] p : permutations ( comb ) ) {
      double cond = 0 ;
      for ( int i = 0 ;
      i < 3 ;
      i ++ ) for ( int col : cnts . keySet ( ) ) cond += cnts . get ( i ) . get ( col ) * cost [ col ] . get ( p [ i ] ) ;
      ans = Math . min ( ans , cond ) ;
    }
  }
  System . out . println ( ans ) ;
  return cost ;
}
