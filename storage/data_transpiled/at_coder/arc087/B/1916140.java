public static int [ ] [ ] input ( ) {
  String s = input . next ( ) + "T" ;
  int x = Integer . parseInt ( s ) , y = Integer . parseInt ( s ) ;
  int N = s . length ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( s . charAt ( i ) == 'F' ) {
      x -- ;
    }
    else {
      cnt_Y = true ;
      index = i + 1 ;
      break ;
    }
  }
  ArrayList < Integer > steps_X = new ArrayList < Integer > ( ) ;
  ArrayList < Integer > steps_Y = new ArrayList < Integer > ( ) ;
  while ( index < N ) {
    int cnt = 0 ;
    for ( int j = index ;
    j < N ;
    j ++ ) {
      if ( s . charAt ( j ) == 'F' ) {
        cnt ++ ;
      }
      else {
        if ( cnt_Y && cnt != 0 ) steps_Y . add ( cnt ) ;
        else if ( ! cnt_Y && cnt != 0 ) steps_X . add ( cnt ) ;
        cnt_Y = ! cnt_Y ;
        index = j ;
        break ;
      }
    }
    index ++ ;
  }
  int K = 10000 ;
  HashSet < Integer > dp = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    dp . add ( new HashSet < Integer > ( ) ) ;
  }
  dp . get ( 0 ) . add ( 0 ) ;
  for ( int i = 0 ;
  i < steps_X . size ( ) ;
  i ++ ) {
    int t = steps_X . get ( i ) ;
    for ( int tmp : dp . get ( i ) ) {
      dp . get ( i + 1 ) . add ( tmp + t ) ;
      dp . get ( i + 1 ) . add ( tmp - t ) ;
    }
  }
  if ( ! dp . get ( y ) . equals ( steps_Y ) ) {
    System . out . println ( "No" ) ;
    final int tmp = steps_Y . get ( i ) ;
    dp . remove ( tmp ) ;
  }
  System . out . println ( "Yes" ) ;
  return dp . toArray ( ) ;
}
