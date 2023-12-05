static final long [ ] getDoubleArray ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input ( ) ) ) ;
  }
  List < Integer > left = A . subList ( 0 , N ) ;
  long lefty = Long . parseLong ( left . get ( 0 ) ) ;
  List < Integer > right = Arrays . asList ( - A . get ( 0 ) ) ;
  long righty = Long . parseLong ( right . get ( 0 ) ) ;
  List < Integer > leftList = new ArrayList < > ( ) ;
  leftList . add ( lefty ) ;
  List < Integer > rightList = new ArrayList < > ( ) ;
  rightList . add ( righty ) ;
  heapify ( left ) ;
  heapify ( right ) ;
  for ( int i = N ;
  i < 2 * N ;
  i ++ ) {
    heapify ( left , A . get ( i ) ) ;
    long x = heapify ( left ) ;
    lefty += A . get ( i ) - x ;
    leftList . add ( lefty ) ;
  }
  for ( int i = 2 * N - 1 ;
  i < N - 1 ;
  i ++ ) {
    heapify ( right , - A . get ( i ) ) ;
    long y = heapify ( right ) ;
    righty += - A . get ( i ) - y ;
    rightList . add ( righty ) ;
  }
  long ans = - Long . MAX_VALUE ;
  for ( int i = 0 ;
  i < leftList . size ( ) ;
  i ++ ) {
    ans = Math . max ( ans , leftList . get ( i ) + rightList . get ( rightList . size ( ) - 1 - i ) ) ;
  }
  System . out . println ( ans ) ;
}
