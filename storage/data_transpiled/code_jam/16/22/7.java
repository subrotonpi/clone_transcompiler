@ Nullable static String solve ( @ NotNull final String s1 , @ NotNull final String s2 ) {
  final int n = s1 . length ( ) ;
  final int min = 10 * n ;
  String min_s1 = null ;
  String min_s2 = null ;
  for ( int i : xrange ( n ) ) {
    final char c1 = s1 . charAt ( i ) ;
    final char c2 = s1 . charAt ( i ) ;
    if ( c1 < c2 ) {
      t1 = "" . charAt ( i ) + "" . charAt ( i ) . replace ( "?" , "9" ) ;
      t2 = "" . charAt ( i ) + "" . charAt ( i ) . replace ( "?" , "0" ) ;
      key = abs ( Integer . MAX_VALUE - t2 ) ;
      if ( key < min_s1 ) min_s1 = key ;
      min_s2 = t2 ;
    }
    else if ( c1 > c2 ) {
      t1 = "" . charAt ( i ) + "" . charAt ( i ) . replace ( "?" , "0" ) ;
      t2 = "" . charAt ( i ) + "" . charAt ( i ) . replace ( "?" , "0" ) ;
      epr = "" . charAt ( i ) . replace ( "?" , "9" ) ;
      key = abs ( Integer . MAX_VALUE - t2 ) ;
      if ( key < min_s1 ) min_s1 = key ;
      min_s2 = t2 ;
    }
    else if ( c1 == c2 ) {
      t1 = "" . charAt ( i ) + "" . charAt ( i ) . replace ( "?" , "0" ) ;
      t2 = "" . charAt ( i ) + "" . charAt ( i ) . replace ( "?" , "0" ) ;
      epr = "" . charAt ( i ) . replace ( "?" , "0" ) ;
      key = abs ( Integer . MAX_VALUE - t2 ) ;
      if ( key < min_s1 ) min_s1 = key ;
      min_s2 = t2 ;
    }
    else {
      assert c1 == c2 ;
      if ( s1 . charAt ( i ) == '?' && c1 > '0' ) continue ;
      s1 . charAt ( i ) = c1 ;
      s2 . charAt ( i ) = c2 ;
    }
  }
  final String digits = "1234567890" ;
  {
    final int t1 = "" . charAt ( i ) ;
    final int t2 = "" . charAt ( i ) . length ( ) ;
    String ans = null ;
    min_s1 = ( t1 == 0 ) ? digits : digits ;
    for ( int