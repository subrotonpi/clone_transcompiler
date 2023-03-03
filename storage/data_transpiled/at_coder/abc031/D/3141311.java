public static boolean dfs ( int i , boolean f ) {
  int j ;
  String s ;
  String [ ] [ ] vw = new String [ N ] [ 10 ] ;
  String [ ] num = new String [ 10 ] ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    if ( f == null ) {
      num [ i ] = 1 ;
      f = dfs ( i + 1 , f ) ;
    }
    if ( f == null ) {
      num [ i ] = 2 ;
      f = dfs ( i + 1 , f ) ;
    }
    if ( f == null ) {
      num [ i ] = 3 ;
      f = dfs ( i + 1 , f ) ;
    }
    return f ;
  }
  else {
    ans = new String [ 10 ] ;
    for ( j = 0 ;
    j < N ;
    j ++ ) {
      s = vw [ j ] [ 1 ] ;
      for ( k = 0 ;
      k < vw [ j ] [ 0 ] . length ;
      k ++ ) {
        if ( s . length ( ) < num [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] ) return false ;
        if ( ans [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] . equals ( "" ) ) {
          ans [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] = s . substring ( 0 , num [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] ) ;
          s = s . substring ( num [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] ) ;
        }
        else {
          if ( ans [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] . equals ( s ) ) return false ;
          s = s . substring ( num [ Integer . parseInt ( vw [ j ] [ 0 ] [ k ] ) ] ) ;
        }
      }
      if ( s . compareTo ( "" ) != 0 ) return false ;
    }
    for ( j = 1 ;
    j <= K ;
    j ++ ) System . out . println ( ans [ j ] ) ;
    return true ;
  }
}
