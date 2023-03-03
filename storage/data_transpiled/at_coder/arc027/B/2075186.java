public static int N = Integer . parseInt ( input ) {
  * parent , y ;
  int [ ] D = new int [ 26 ] ;
  Arrays . fill ( D , 2 * 10 - 1 ) ;
  /* root of the string */
  if ( y == parent [ 0 ] ) {
    return y ;
  }
  parent [ 0 ] = y = root ( parent [ 0 ] ) ;
  /* unite the string */
  int px = root ( x ) ;
  int py = root ( y ) ;
  if ( px < py ) {
    parent [ py ] = px ;
    D [ px ] &= D [ py ] ;
  }
  else {
    parent [ px ] = py ;
    D [ py ] &= D [ px ] ;
  }
  int NZ = 2 * 10 - 2 ;
  @ SuppressWarnings ( "unused" ) String s1 = input . substring ( 0 , 1 ) ;
  String s2 = input . substring ( 1 , 2 ) ;
  Set < Character > s = new HashSet < Character > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( s1 . charAt ( i ) >= 65 && s2 . charAt ( i ) <= 65 ) {
      continue ;
    }
    if ( s1 . charAt ( i ) >= 65 ) {
      char c = ( char ) s2 . charAt ( i ) - 65 ;
      int x = root ( c ) ;
      s . add ( c ) ;
      D [ x ] &= 1 << Integer . parseInt ( s1 . substring ( i ) ) ;
      if ( i == 0 ) D [ x ] &= NZ ;
    }
    else if ( s2 . charAt ( i ) >= 65 ) {
      char c = ( char ) s1 . charAt ( i ) - 65 ;
      int x = root ( ( char ) s2 . charAt ( i ) - 65 ) ;
      s . add ( c ) ;
      D [ x ] &= 1 << Integer . parseInt ( s2 . substring ( i ) ) ;
      if ( i == 0 ) D [ x ] &= NZ ;
    }
    else {
      char c1 = ( char ) s1 . charAt ( i ) - 65 ;
      char c2 = ( char ) s2 . charAt ( i ) - 65 ;
      s . add ( c1 ) ;
      s . add ( c2 ) ;
      unite ( c1 , c2 ) ;
      if ( i == 0 ) D [ root ( c1 ) ] &= NZ ;
    }
  }
  int ans = 1 ;
  for ( int i = 0 ;
  i < 26 ;
  i ++ ) {
    if ( s . contains ( i )