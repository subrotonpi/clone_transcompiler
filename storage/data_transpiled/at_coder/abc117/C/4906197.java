static final void solve ( int N , int M , @ Nonnull List < Integer > X ) {
  if ( N >= M ) {
    System . out . println ( 0 ) ;
    return ;
  }
  Collections . sort ( X ) ;
  int [ ] dist = new int [ X . size ( ) ] ;
  for ( int i = 1 ;
  i < X . size ( ) ;
  i ++ ) {
    dist [ i ] = Math . abs ( X . get ( i ) - X . get ( i - 1 ) ) ;
  }
  List < Integer > distIndices = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < dist . length ;
  i ++ ) {
    distIndices . add ( new Integer ( dist [ i ] ) ) ;
  }
  Collections . sort ( distIndices , Collections . reverseOrder ( ) ) ;
  List < Integer > splitIndex = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    splitIndex . add ( distIndices . get ( i ) . intValue ( ) ) ;
  }
  Collections . sort ( splitIndex , Collections . reverseOrder ( ) ) ;
  List < List < Integer >> ranges = new ArrayList < List < Integer >> ( ) ;
  int begin = 0 ;
  for ( int next : splitIndex ) {
    ranges . add ( X . subList ( begin , next + 1 ) ) ;
    begin = next + 1 ;
  }
  ranges . add ( X . subList ( begin , X . size ( ) ) ) ;
  int cost = 0 ;
  for ( List < Integer > R : ranges ) {
    if ( R . size ( ) == 1 ) continue ;
    cost += R . get ( R . size ( ) - 1 ) - R . get ( 0 ) ;
  }
  System . out . println ( cost ) ;
  return ;
}
