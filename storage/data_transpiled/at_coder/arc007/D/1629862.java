public static void seconds ( String S , int i ) {
  for ( int j = i + 1 ;
  j < S . length ( ) ;
  j ++ ) {
    if ( j != "0" ) {
      seconds ( j , Integer . parseInt ( S . substring ( i , j ) ) ) ;
    }
  }
  seconds ( S . length ( ) , Integer . parseInt ( S . substring ( i ) ) ) ;
  /* OK */
  if ( j == S . length ( ) ) return ;
  int ak = a2 + d ;
  do {
    String s_ak = Integer . toString ( ak ) ;
    if ( S . substring ( j ) . startsWith ( s_ak ) ) {
      j += s_ak . length ( ) ;
      ak += d ;
      if ( j == S . length ( ) ) return ;
    }
    else if ( s_ak . startsWith ( S . substring ( j ) ) ) return ;
    else return ;
  }
  while ( true ) ;
  /* main */
  S = input . nextLine ( ) ;
  if ( S . startsWith ( "0" ) ) S = "1" + S ;
  i ++ ;
  for ( i ++ ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) != "0" ) break ;
    if ( i < S . length ( ) && S . charAt ( i ) == '0' ) i ++ ;
    int a1 = Integer . parseInt ( S . substring ( 0 , i ) ) ;
    if ( i == S . length ( ) ) {
      int d = 1 ;
      System . out . println ( a1 + " " + d ) ;
      return ;
    }
    for ( int j = 0 ;
    j < seconds ( S , i ) ;
    j ++ ) {
      int a2 = seconds ( S , i ) ;
      if ( a2 <= a1 ) continue ;
      int d = a2 - a1 ;
      if ( isOK ( S , j , a2 , d ) ) {
        System . out . println ( a1 + " " + d ) ;
        return ;
      }
    }
    String s_a1 = Integer . toString ( a1 ) ;
    String s_a2 = S . substring ( i ) ;
    if ( s_a1 . startsWith ( s_a2 ) ) {
      if ( a1 <= 9 ) d = 10 * Integer . parseInt ( s_a2 ) - a1 ;
      else {
        if ( s_a1 . equals ( s_a2 ) ) d = 10 * Integer . parseInt ( s_a2 ) - a1 ;
        else d = 1 ;
      }
      System . out . println ( a1 + " " + d ) ;
    }
    else {
      s_a2 += "0"