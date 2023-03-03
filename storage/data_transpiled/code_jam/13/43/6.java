public static void solve ( int [ ] a , int [ ] b ) {
  int n = a . length ;
  int [ ] x = new int [ n ] ;
  x [ 0 ] = - 1 ;
  for ( int i : xrange ( n ) ) {
    if ( a [ i ] == 1 && b [ i ] == 1 ) {
      x [ i ] = 1 ;
      break ;
    }
  }
  /*place the first element in the array*/
  int [ ] bestA = new int [ n ] ;
  int curBest = 1 ;
  for ( int i : xrange ( n ) ) {
    if ( x [ i ] > 0 ) {
      curBest = Math . max ( curBest , a [ i ] + 1 ) ;
    }
    bestA [ i ] = curBest ;
  }
  int [ ] bestB = new int [ n ] ;
  bestB [ 0 ] = 1 ;
  curBest = 1 ;
  for ( int i : xrange ( n ) ) {
    if ( x [ i ] > 0 ) {
      curBest = Math . max ( curBest , b [ i ] + 1 ) ;
    }
    bestB [ i ] = curBest ;
  }
  for ( int i : xrange ( n ) ) {
    if ( x [ i ] > 0 ) continue ;
    if ( a [ i ] == bestA [ i ] && b [ i ] == bestB [ i ] ) {
      x [ i ] = cur ;
      if ( ( cur == n ) && ( x [ i ] == bestA [ i ] ) ) {
        return true ;
      }
      else {
        if ( place ( cur + 1 ) ) {
          return true ;
        }
        else {
          x [ i ] = - 1 ;
        }
      }
    }
  }
  if ( n > 1 ) {
    place ( 2 ) ;
  }
  /*return x;*/
  if ( className . equals ( "java.util.Scanner" ) ) {
    int T = Integer . parseInt ( readLine ( ) ) ;
    for ( int ncase : xrange ( 1 , T + 1 ) ) {
      int n = Integer . parseInt ( readLine ( ) ) ;
      a = ArrayUtil . toIntArray ( readLine ( ) . split ( " " ) ) ;
      b = ArrayUtil . toIntArray ( readLine ( ) . split ( " " ) ) ;
      int [ ] sol = solve ( a , b ) ;
      System . out . println ( "Case #" + ncase + ":" ) ;
      for ( int s : sol ) {
        System . out . println ( s )