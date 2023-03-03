@ VisibleForTesting static void fill ( int i , int j , char mark , char [ ] [ ] map , char [ ] [ ] res ) {
  int h = map . length ;
  int w = map [ 0 ] . length ;
  List < Pair < Integer , Integer >> history = new ArrayList < > ( ) ;
  while ( res [ i ] [ j ] == '?' ) {
    history . add ( new Pair < > ( i , j ) ) ;
    List < Pair < Integer , Integer >> cand = new ArrayList < > ( ) ;
    for ( int di = - 1 , dj = 0 ;
    di < h ;
    di ++ , dj ++ ) {
      if ( 0 <= i + di && i + di < h && 0 <= j + dj && map [ i + di ] [ j + dj ] < map [ i ] [ j ] ) {
        cand . add ( new Pair < > ( map [ i + di ] [ j + dj ] , i + di , j + dj ) ) ;
      }
    }
    if ( cand . isEmpty ( ) ) {
      res [ i ] [ j ] = mark ;
      mark = ( char ) ( ( mark + 1 ) & 0xFF ) ;
    }
    else {
      final int min = Math . min ( cand . size ( ) , h ) ;
      for ( Pair < Integer , Integer > i_ : history ) {
        final int min = Math . min ( min , w ) ;
        for ( Pair < Integer , Integer > j_ : history ) {
          res [ i_ . index ( ) ] [ j_ . index ( ) ] = res [ i ] [ j ] ;
        }
      }
    }
  }
  {
    int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i = 0 ;
    i < t ;
    i ++ ) {
      int h = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      int w = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      map = new ArrayList < > ( ) ;
      for ( ;
      ;
      ) {
        int line = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
        assert line . length ( ) == w ;
        map . add ( line ) ;
      }
      res = solve ( map ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    }
  }
}
