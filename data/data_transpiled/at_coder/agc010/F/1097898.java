@ VisibleForTesting static List < Integer > readln ( ) {
  java . util . List < Integer > res = Lists . newArrayList ( ) ;
  for ( String s : input . split ( "\\s+" ) ) {
    res . add ( Integer . parseInt ( s ) ) ;
  }
  /* calc the first line */
  int y ;
  int son ;
  int s ;
  int [ ] a ;
  int [ ] e ;
  int [ ] a ;
  int i ;
  int l ;
  int line = 0 ;
  if ( line == 0 ) {
    for ( l = 0 ;
    l < v [ x ] . length ;
    l ++ ) {
      if ( e [ l ] [ 0 ] == s ) son = e [ l ] [ 1 ] ;
      else son = e [ l ] [ 0 ] ;
      if ( a [ son - 1 ] < a [ x - 1 ] && calc ( son , l ) == - 1 ) return 1 ;
    }
    return - 1 ;
  }
  else {
    if ( e [ line ] [ 0 ] == s ) y = 0 ;
    else y = 1 ;
    if ( f [ line ] [ y ] != 0 ) return f [ line ] [ y ] ;
    for ( l = 0 ;
    l < v [ x ] . length ;
    l ++ ) {
      if ( l != line ) {
        if ( e [ l ] [ 0 ] == s ) son = e [ l ] [ 1 ] ;
        else son = e [ l ] [ 0 ] ;
        if ( a [ son - 1 ] < a [ x - 1 ] && calc ( son , l ) == - 1 ) {
          f [ line ] [ y ] = 1 ;
          return 1 ;
        }
      }
      f [ line ] [ y ] = - 1 ;
      return - 1 ;
    }
  }
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  v = new HashSet [ n + 1 ] ;
  e = new int [ n ] ;
  a = readln ( ) ;
  for ( i = 0 ;
  i <= n ;
  i ++ ) {
    s = readln ( ) ;
    v [ s [ 0 ] ] . add ( i ) ;
    v [ s [ 1 ] ] . add ( i ) ;
    e [ i ] = s ;
  }
  f = new int [ n ] ;
  for ( i = 0 ;
  i <= n ;
  i ++ ) {
    if ( calc ( i , 0 ) == 1 ) ans . add ( i ) ;
  }
  ans = Lists . newArrayList ( ans ) ;
  System . out . println ( Arrays .