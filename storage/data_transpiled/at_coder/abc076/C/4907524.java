public static String [ ] getChars ( ) {
  String s = input . nextLine ( ) ;
  String t = input . nextLine ( ) ;
  int [ ] pushable = new int [ s . length ( ) - t . length ( ) + 1 ] ;
  for ( int i = 0 ;
  i < s . length ( ) - t . length ( ) + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < t . length ( ) ;
    j ++ ) {
      if ( s . charAt ( i + j ) != t . charAt ( j ) && s . charAt ( i + j ) != '?' ) {
        pushable [ i ] = 0 ;
        break ;
      }
    }
  }
  if ( ! pushable [ 1 ] ) {
    System . out . println ( "UNRESTORABLE" ) ;
    exit ( ) ;
  }
  String [ ] ans = new String [ pushable . length ] ;
  for ( int i = 0 ;
  i < ans . length ;
  i ++ ) {
    String cand = s ;
    if ( p != null ) {
      cand = cand . substring ( 0 , i + j ) + t . charAt ( j ) + cand . substring ( i + j + 1 ) ;
    }
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      if ( cand . charAt ( j ) == '?' ) {
        cand = cand . substring ( 0 , j ) + "a" + cand . substring ( j + 1 ) ;
      }
    }
    ans [ i ] = cand ;
  }
  return ans ;
}
