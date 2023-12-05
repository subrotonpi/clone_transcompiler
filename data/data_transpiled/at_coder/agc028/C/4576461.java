static final int [ ] [ ] a ( int i , int j , int [ ] [ ] a ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final List < Integer > [ ] a = new ArrayList < > ( ) ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) a [ l ] [ j ] = Integer . parseInt ( input ( ) . substring ( l , l + 1 ) ) ;
  final int [ ] costs = a [ 0 ] ;
  final int [ ] indexes = a [ N ] ;
  final int [ ] types = a [ N ] ;
  final int total = Arrays . stream ( costs ) . mapToInt ( i -> i + 1 ) . sum ( ) ;
  if ( Sets . newHashSet ( indexes ) . size ( ) == N && Sets . newHashSet ( types ) . size ( ) == 2 ) {
    double ans = Double . MAX_VALUE ;
    for ( int i = N - 1 ;
    i >= Math . max ( - 1 , N - 3 ) ;
    i -- ) {
      ans = Math . min ( ans , total - costs [ i ] + ( indexes [ i ] != a [ N ] [ 1 ] ? a [ N ] [ 0 ] : a [ N + 1 ] [ 0 ] ) ) ;
    }
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( total ) ;
  }
  return a ;
}
