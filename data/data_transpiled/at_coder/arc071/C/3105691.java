public static String input ( ) {
  String S = input ( ) ;
  String T = input ( ) ;
  int [ ] S_a = new int [ S . length ( ) ] , S_b = new int [ S . length ( ) ] ;
  int [ ] T_a = new int [ T . length ( ) ] , T_b = new int [ T . length ( ) ] ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    String s = S . substring ( i , i + 1 ) ;
    if ( s . equals ( "A" ) ) {
      S_a [ i ] = S_a [ i ] + 1 ;
      S_b [ i ] = S_b [ i ] + 1 ;
    }
    if ( s . equals ( "B" ) ) {
      S_a [ i ] = S_a [ i ] - 1 ;
      S_b [ i ] = S_b [ i ] + 1 ;
    }
  }
  for ( int i = 0 ;
  i < T . length ( ) ;
  i ++ ) {
    String t = T . substring ( i , i + 1 ) ;
    if ( t . equals ( "A" ) ) {
      T_a [ i ] = T_a [ i ] + 1 ;
      T_b [ i ] = T_b [ i ] - 1 ;
    }
    if ( t . equals ( "B" ) ) {
      T_a [ i ] = T_a [ i ] - 1 ;
      T_b [ i ] = T_b [ i ] + 1 ;
    }
  }
  /* calc the difference between the two integers */
  if ( na > nb ) {
    int diff = na - nb ;
    if ( diff % 3 == 0 ) {
      return "" ;
    }
    else if ( ( diff % 3 ) % 2 == 0 ) {
      return "B" ;
    }
    else {
      return "A" ;
    }
  }
  else {
    int diff = nb - na ;
    if ( diff % 3 == 0 ) {
      return "" ;
    }
    else if ( ( diff % 3 ) % 2 == 0 ) {
      return "A" ;
    }
    else {
      return "B" ;
    }
  }
  int Q = Integer . parseInt ( input ( ) ) ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    int c = Integer . parseInt ( input ( ) ) ;
    int d = Integer . parseInt ( input ( )