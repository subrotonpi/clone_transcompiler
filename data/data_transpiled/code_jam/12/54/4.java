static final String [ ] getStrings ( ) {
  final String t = "oieastbg" ;
  final Map < String , Integer > d2 = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < t . length ( ) ;
  i ++ ) {
    d2 . put ( t . charAt ( i ) , Integer . toString ( i ) ) ;
  }
  return new String [ ] {
    "" }
    ;
    /* concat a list of strings */
    {
      HashMap < String , Integer > r = new HashMap < String , Integer > ( ) ;
      for ( int i = 0 ;
      i < 10 ;
      i ++ ) {
        r . put ( Integer . toString ( i ) , 0 ) ;
      }
      for ( int i = 0 ;
      i < 26 ;
      i ++ ) {
        r . put ( ( char ) ( 'a' + i ) , 0 ) ;
      }
      for ( String s : a ) {
        r . get ( s . charAt ( 0 ) ) . intValue ( ) ++ ;
        r . get ( s . charAt ( 1 ) ) . intValue ( ) ++ ;
      }
      int res = a . length * 2 ;
      for ( Integer [ ] v : r . values ( ) ) {
        res -= Math . min ( v . length , v . length ) ;
      }
      if ( res == a . length ) {
        return res + 1 ;
      }
      return res ;
    }
    /* expand a list of strings */
  }
  