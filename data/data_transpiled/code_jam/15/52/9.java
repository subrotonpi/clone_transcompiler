static int run ( int N , int K , int [ ] sums ) throws IOException {
  List < List < Integer >> diffs = new ArrayList < List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int cmin = 0 ;
    int cmax = 0 ;
    int ctemp = 0 ;
    for ( int j = i ;
    j < N - K ;
    j += K ) {
      ctemp += sums [ j + 1 ] - sums [ j ] ;
      cmin = Math . min ( cmin , ctemp ) ;
      cmax = Math . max ( cmax , ctemp ) ;
    }
    diffs . add ( new ArrayList < Integer > ( ) ) ;
    diffs . add ( new ArrayList < Integer > ( ) ) ;
    diffs . add ( new ArrayList < Integer > ( ) ) ;
    diffs . add ( new ArrayList < Integer > ( ) ) ;
  }
  Collections . sort ( diffs ) ;
  List < Integer > diff2 = new ArrayList < Integer > ( ) ;
  int offset = 0 ;
  for ( List < Integer > d : diffs ) {
    if ( d . get ( 1 ) < diffs . get ( diffs . size ( ) - 1 ) . get ( 1 ) ) {
      offset += diffs . get ( diffs . size ( ) - 1 ) . get ( 1 ) - d . get ( 1 ) ;
      diff2 . add ( new Integer ( d . get ( 0 ) ) ) ;
      diff2 . add ( new Integer ( diffs . get ( d . get ( 0 ) ) ) ) ;
      diff2 . add ( new Integer ( d . get ( 1 ) ) ) ;
      diff2 . add ( new Integer ( d . get ( 2 ) ) ) ;
      diff2 . add ( new Integer ( d . get ( 2 ) + diffs . get ( d . get ( 1 ) ) ) ) ;
    }
    else diff2 . add ( d ) ;
  }
  int totminus = Integer . parseInt ( diff2 . get ( diff2 . size ( ) - 1 ) . get ( 1 ) ) ;
  int totplus = Integer . parseInt ( diff2 . get ( diff2 . size ( ) - 1 ) . get ( 2 ) ) ;
  int needplus = ( sums [ 0 ] - offset ) % K ;
  int needminus = ( offset - sums [ 0 ] ) % K ;
  if ( totminus >= needminus || totplus >= needplus ) return diff2 . get ( diff2 . size ( ) - 1 ) .