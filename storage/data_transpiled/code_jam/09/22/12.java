@ Codejam . Primitive public static String problem1 ( ) {
  final String s1 = s . intern ( ) ;
  if ( s1 . indexOf ( '(' ) == - 1 ) {
    return Double . parseDouble ( s1 . concat ( " " ) . concat ( " )" ) ;
  }
  final String [ ] sp = s1 . split ( " " ) ;
  final double w = Double . parseDouble ( sp [ 0 ] ) ;
  final String rpr = sp [ 1 ] ;
  if ( rpr . indexOf ( '(' ) != - 1 ) {
    rpr = rpr . substring ( 0 , rpr . indexOf ( '(' ) ) ;
  }
  int i = 0 ;
  int j = s1 . indexOf ( '(' ) + 1 ;
  int d = 1 ;
  while ( d > 0 ) {
    j ++ ;
    if ( s1 . charAt ( j ) == '(' ) d ++ ;
    if ( s1 . charAt ( j ) == ')' ) d -- ;
    if ( di . contains ( rpr ) ) {
      return w * pr ( s1 . substring ( i - 1 , j + 1 ) , di ) ;
    }
    s1 = s1 . substring ( j + 1 ) ;
    i = j = s1 . indexOf ( '(' ) + 1 ;
    d = 1 ;
    while ( d > 0 ) {
      j ++ ;
      if ( s1 . charAt ( j ) == '(' ) d ++ ;
      if ( s1 . charAt ( j ) == ')' ) d -- ;
    }
    if ( di . contains ( rpr ) ) {
      return w * pr ( s1 . substring ( i - 1 , j + 1 ) , di ) ;
    }
  }
  @ Codejam . Primitive ( "problem1" ) ;
  final int L = readInt ( ) ;
  final StringBuffer sb = new StringBuffer ( ) ;
  for ( ;
  n >= 0 ;
  n -- ) {
    sb . append ( readStr ( ) ) ;
  }
  final int A = readInt ( ) ;
  final StringBuffer r = new StringBuffer ( ) ;
  for ( ;
  n >= 0 ;
  n -- ) {
    final String an = readString ( ) . replaceAll ( "\n" , "" ) ;
    an . delete ( 0 , an . length ( ) ) ;
    r . append ( '\n' ) ;
    r . append ( pr ( s , an ) ) ;
  }
  return r . toString ( ) ;
}
