@ VisibleForTesting static int [ ] getSortedList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > S = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  List < Pair < Integer , Integer >> T = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    T . add ( new Pair < > ( i , S . get ( i ) ) ) ;
  }
  List < Pair < Integer , Integer >> U = new ArrayList < > ( T ) ;
  U . sort ( Comparator . comparing ( Pair :: getSecond ) ) ;
  int [ ] Ans = new int [ N ] ;
  int c = 0 , v = 10 * 10 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    c ++ ;
    v = Math . min ( v , U . get ( i ) . getFirst ( ) ) ;
    if ( U . get ( i ) . getSecond ( ) == U . get ( i + 1 ) . getSecond ( ) ) {
      continue ;
    }
    else {
      Ans [ v ] += ( U . get ( i ) . getSecond ( ) - U . get ( i + 1 ) . getSecond ( ) ) * c ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Ans [ i ] = 0 ;
    Ans [ i ] = Integer . parseInt ( input . nextLine ( ) ) - Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( Ans [ i ] ) ;
  }
  return Ans ;
}
