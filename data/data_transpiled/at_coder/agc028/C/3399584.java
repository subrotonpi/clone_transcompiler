public static int [ ] [ ] getPairs ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > pairs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String tmp = input . nextLine ( ) ;
    pairs . add ( Arrays . asList ( tmp . split ( " " ) ) ) ;
  }
  List < Pair < Integer , Integer >> posAndVals = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < pairs . size ( ) ;
  i ++ ) {
    Pair < Integer , Integer > pair = pairs . get ( i ) ;
    Pair < Integer , Integer > pair = pair . get ( 0 ) ;
    Pair < Integer , Integer > pair = pair . get ( 1 ) ;
    posAndVals . add ( pair ) ;
  }
  List < Pair < Integer , Integer >> posAndValsSorted = new ArrayList < > ( posAndVals ) ;
  Collections . sort ( posAndValsSorted , ( o1 , o2 ) -> {
    int fromVal = o1 . second ;
    int toVal = o2 . second ;
    return ( fromVal < toVal ) ? - 1 : 1 ;
  }
  ) ;
  List < Pair < Integer , Integer >> posAndValsSortedToN = posAndValsSorted . subList ( 0 , N ) ;
  boolean [ ] [ ] directions = new boolean [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    directions [ i ] [ 0 ] = false ;
  }
  Iterator < Pair < Integer , Integer >> it = posAndValsSortedToN . iterator ( ) ;
  Pair < Integer , Integer > bestOne = it . next ( ) ;
  Integer firstDirection = it . next ( ) . second ;
  int bestOne = it . next ( ) . first ;
  if ( Arrays . equals ( directions [ 0 ] , firstDirection ) ) {
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    bestOne = bestOne ;
    