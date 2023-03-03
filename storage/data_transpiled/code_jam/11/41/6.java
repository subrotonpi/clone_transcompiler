@ VisibleForTesting static final double solve ( int [ ] inputs , int S , int R , int T , List < Pair < Integer , Double >> walks ) {
  final Scanner cin = new Scanner ( System . in ) ;
  final double [ ] [ ] input = new double [ inputs . length ] [ ] ;
  int i ;
  int i ;
  int i ;
  int baseTime = input [ 0 ] [ 0 ] * 1.0 / ( input [ 0 ] [ 0 ] + 1 ) ;
  for ( i = 0 ;
  i < output . length ;
  i ++ ) {
    baseTime = input [ i ] [ 0 ] * 1.0 / ( input [ i ] [ 0 ] + 1 ) ;
    if ( ( ( input [ i ] [ 0 ] + R ) * input [ i ] [ 0 ] + 1 ) >= input [ i ] [ 0 ] ) {
      tused = input [ i ] [ 0 ] * 1.0 / input [ i ] [ 0 ] ;
      return ( input [ i ] [ 0 ] * ( input [ i ] [ 1 ] - input [ i ] [ 0 ] ) + baseTime ) ;
    }
    tused = input [ i ] [ 0 ] ;
    a = input [ i ] [ 0 ] * 1.0 - input [ i ] [ 0 ] ;
    return ( input [ i ] [ 0 ] * ( input [ i ] [ 1 ] - input [ i ] [ 0 ] ) + baseTime ) ;
  }
  final Comparator < Pair < Integer , Double >> keyf = new Comparator < Pair < Integer , Double >> ( ) {
    public int compare ( Pair < Integer , Double > o1 , Pair < Integer , Double > o2 ) {
      Pair < Integer , Double > x = better ( o1 . first , o2 . first , T ) ;
      return x . second . compareTo ( x . first ) ;
    }
  }
  ;
  int at = 0 ;
  List < Pair < Integer , Double >> trueWalks = new ArrayList < Pair < Integer , Double >> ( ) ;
  for ( i = 0 ;
  i < walks . size ( ) ;
  i ++ ) {
    final int start = walks . get ( i ) . first ;
    final int end = walks . get ( i ) . second ;
    if ( start != at ) {
      trueWalks . add ( new Pair < Integer , Double > ( start - at , 0 ) ) ;
      at = start ;
    }
    trueWalks . add ( new Pair < Integer , Double > ( end - at , speed ) ) ;
    