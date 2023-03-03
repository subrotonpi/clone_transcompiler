static void nonEmptySplitting ( List < String > els , int k , Consumer < List < String >> foundCb , int i , List < Integer > cur ) {
  if ( i == els . size ( ) ) {
    for ( int l = 0 ;
    l < k ;
    l ++ ) {
      if ( ! cur . contains ( l ) ) {
        return ;
      }
    }
    foundCb . accept ( cur ) ;
  }
  else {
    for ( int l = 0 ;
    l < k ;
    l ++ ) {
      cur . add ( l ) ;
      nonEmptySplitting ( els , k , foundCb , i + 1 , cur ) ;
      cur . remove ( cur . size ( ) - 1 ) ;
    }
  }
  /* Node count */
  Set < String > prefs = new HashSet < String > ( ) ;
  for ( String s : strs ) {
    for ( int i = 0 ;
    i <= s . length ( ) ;
    i ++ ) {
      prefs . add ( s . substring ( 0 , i ) ) ;
    }
  }
  /* Node count */
  int [ ] bestNc = new int [ 1 ] ;
  int [ ] cases = new int [ 1 ] ;
  /* Found a list of words */
  int nc = 0 ;
  for ( int i = 0 ;
  i < setCnt ;
  i ++ ) {
    List < String > servStrs = new ArrayList < String > ( ) ;
    for ( int j = 0 ;
    j < servStrs . size ( ) ;
    j ++ ) {
      if ( i == servStrs . get ( j ) ) {
        int ncinc = nodeCnt ( servStrs ) ;
        nc += ncinc ;
      }
    }
    if ( nc > bestNc [ 0 ] ) {
      bestNc [ 0 ] = nc ;
      cases [ 0 ] = 1 ;
    }
    else if ( nc == bestNc [ 0 ] ) {
      cases [ 0 ] ++ ;
    }
  }
  nonEmptySplitting ( strs , setCnt , foundCb ) ;
  /* Case #*/
  final String infname = System . getProperty ( "line.separator" ) ;
  try {
    BufferedReader inf = new BufferedReader ( new FileReader ( infname ) ) ;
    BufferedWriter outf = new BufferedWriter ( new FileWriter ( infname . replace ( ".in" , ".out" ) ) ) ;
    int T = Integer . parseInt ( inf . readLine ( ) ) ;
    for ( int t = 1 ;
    t <= T ;
    t ++ ) {
      int n = Integer . parseInt ( inf .