@ VisibleForTesting static LinkedHashMap < Integer , Integer > readLongMap ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > As = Lists . newArrayList ( ) ;
  As . add ( T ) ;
  T /= 2 ;
  int [ ] profits = new int [ N - 1 ] ;
  int minA = As . get ( 0 ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    profits [ i ] = T * ( A - minA ) ;
    minA = Math . min ( minA , A ) ;
  }
  Counter cnts = new Counter ( profits ) ;
  return cnts ;
}
