public static void print ( String x , String y ) {
  int n = ( int ) x . split ( " " ) . length , y = ( int ) y . split ( " " ) . length ;
  int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) w [ i ] = x ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) w [ i ] = y ;
  int [ ] p = new int [ n + 2 ] , k = x . length ( ) , inf = Double . MAX_VALUE , ans = new int [ y . length ( ) ] ;
  for ( int i = 0 ;
  i < n + 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < k ;
    j ++ ) {
      if ( w [ a ] [ i ] != w [ b ] [ i ] ) {
        if ( w [ a ] [ i + 1 ] == w [ b ] [ i + 1 ] ) c = 1 ;
        break ;
      }
    }
  }
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = i + 1 ;
    j < n + 2 ;
    j ++ ) {
      if ( w [ i ] [ j ] != i ) {
        p [ i ] [ j ] = j ;
        p [ j ] [ i ] = i ;
      }
    }
  }
  @ SuppressWarnings ( "unused" ) int [ ] [ ] dis = new int [ n ] [ n + 1 ] ;
  dis [ s ] [ 0 ] = 0 , q = new int [ n + 1 ] ;
  while ( q . length > 0 ) {
    int num2 = dis [ 0 ] [ 0 ] ;
    int num = dis [ 0 ] [ 0 ] ;
    for ( int i = 1 ;
    i < adj [ num ] ;
    i ++ ) {
      if ( dis [ i ] [ 0 ] > num2 + 1 ) {
        dis [ i ] [ 0 ] = num2 + 1 ;
        dis [ i ] [ 1 ] = num ;
        heappush ( dis , dis [ i ] [ 0 ] , i ) ;
      }
    }
  }
  int [ ] [ ] d = dijkstra ( n + 2 , 0 , p ) ;
  if ( x . equals ( y ) ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) System . out . println ( i ) ;
  }
  else if ( d [ d . length - 1 ] [ 0 ] ==