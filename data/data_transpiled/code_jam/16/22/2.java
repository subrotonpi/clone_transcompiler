public static void result ( String a , String b ) {
  String x = a . substring ( 0 , 1 ) ;
  String y = b . substring ( 0 , 1 ) ;
  int res = ( Math . abs ( Integer . parseInt ( x ) - Integer . parseInt ( y ) ) < 0 ) ? x : y ;
  if ( ans == null || res < ans ) {
    ans = res ;
  }
  /* solve the first three digits */
  if ( i == a . length ( ) ) {
    result ( a , b ) ;
    return ;
  }
  for ( int xa = 0 ;
  xa <= 9 ;
  xa ++ ) {
    for ( int xb = 0 ;
    xb <= 9 ;
    xb ++ ) {
      if ( xb < 0 || xb > 9 ) continue ;
      char ca = ( char ) ( xa + '0' ) ;
      char cb = ( char ) ( xb + '0' ) ;
      if ( a . charAt ( xa ) != ca && a . charAt ( xa ) != '?' ) continue ;
      if ( b . charAt ( xb ) != cb && b . charAt ( xb ) != '?' ) continue ;
      if ( a . charAt ( xa ) == '?' && mn == 1 && ca != '0' ) continue ;
      if ( b . charAt ( xa ) == '?' && mn == 2 && cb != '0' ) continue ;
      if ( b . charAt ( xa ) == '?' && mn == 1 && cb != '9' ) continue ;
      if ( a . charAt ( xa ) == '?' && b . charAt ( xa ) == '?' && ca == cb && mn == 0 && xa != 0 ) continue ;
      char ra = a . charAt ( xa ) ;
      char rb = b . charAt ( xb ) ;
      a . setCharAt ( xa , ca ) ;
      b . setCharAt ( xb , cb ) ;
      int nmn = mn ;
      if ( mn == 0 && ca > cb ) nmn = 1 ;
      if ( mn == 0 && ca < cb ) nmn = 2 ;
      solve ( a , b , i + 1 , nmn ) ;
      a . setCharAt ( xa , ra ) ;
      b . setCharAt ( xb , rb ) ;
    }
  }
  int tn = Integer . parseInt ( input ( ) ) ;
  for ( int t = 1 ;
  t <= tn ;
  t ++ ) {
    a = input ( ) ;
    b = input ( ) ;
    a = a . substring ( 0 , t ) ;
    b = b . substring ( t