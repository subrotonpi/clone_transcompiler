@ VisibleForTesting static void solve ( ) {
  int N = Math . max ( N / 2 , 1 ) ;
  String [ ] l1 = l . substring ( 0 , mid ) ;
  String [ ] l2 = l . substring ( mid ) . split ( " " ) ;
  Map < Integer , Integer > d1 = new TreeMap < Integer , Integer > ( ) ;
  Map < Integer , Integer > d2 = new TreeMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < 2 * l1 . length ;
  i ++ ) {
    int v = Integer . valueOf ( input . nextLine ( ) ) ;
    int W = Integer . valueOf ( input . nextLine ( ) ) ;
    List < Integer > l = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < l1 . length ;
    j ++ ) {
      if ( l1 [ j ] . charAt ( j ) == '1' ) {
        v += l1 [ j ] . charAt ( 0 ) ;
        w += l1 [ j ] . charAt ( 1 ) ;
      }
    }
    int i = V ;
    do {
      if ( l1 [ i ] . charAt ( j ) <= W ) {
        System . out . println ( i ) ;
        break ;
      }
    }
    while ( i -- > 0 ) ;
  }
  if ( l1 [ 0 ] . equals ( "__main__" ) ) {
    N = Integer . valueOf ( input . nextLine ( ) ) ;
    W = Integer . valueOf ( input . nextLine ( ) ) ;
    List < Integer > l = new ArrayList < Integer > ( ) ;
    for ( int j = 0 ;
    j < l1 . length ;
    j ++ ) {
      l . add ( Integer . valueOf ( input . nextLine ( ) ) ) ;
    }
    int v = 0 ;
    int w = 0 ;
    for ( int j = 0 ;
    j < l2 . length ;
    j ++ ) {
      if ( l2 [ j ] . charAt ( j ) == '1' ) {
        v += l2 [ j ] . charAt ( 0 ) ;
        w += l2 [ j ] . charAt ( 1 ) ;
      }
    }
    if ( w <= W ) {
      d2 . put ( w , Math . max ( d1 [ w ] , v ) ) ;
    }
  }
  for ( int i = 0 ;
  i < 2 * l2 . length ;
  i ++ ) {
    int w1 = Integer . valueOf ( input . nextLine ( ) ) ;
    int v1 = Integer . valueOf ( input . nextLine ( ) ) ;
    int j = Integer . valueOf ( input . nextLine ( ) ) ;
    if ( j == - 1