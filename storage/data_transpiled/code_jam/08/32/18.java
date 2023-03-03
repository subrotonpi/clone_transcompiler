static final String [ ] P = new String [ ] {
  2 , 3 , 5 , 7 }
  ;
  int COUNTER = 0 ;
  int num ;
  int i ;
  int j ;
  String input ;
  int i ;
  int c ;
  int i ;
  int num = 0 ;
  for ( i = 0 ;
  i < arr . length ;
  i ++ ) num += Integer . parseInt ( arr [ i ] ) ;
  if ( num == 0 || num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0 ) return true ;
  /* evaluate */
  if ( str . length ( ) == 1 ) {
    arr = new String [ arr . length + 1 ] ;
    arr [ 0 ] = str + c ;
    if ( isUgly ( arr ) ) COUNTER = COUNTER + 1 ;
    return arr ;
  }
  n = str . charAt ( str . length ( ) - 1 ) ;
  String next = str . substring ( 0 , str . length ( ) - 1 ) ;
  /* evaluate */
  evaluate ( next , arr + new String [ ] {
    n + c }
    , "" ) ;
    /* evaluate */
    evaluate ( next , arr + new String [ ] {
      "-" + n + c }
      , "" ) ;
      /* evaluate */
      /* evaluate */
      for ( i = 0 ;
      i < arr . length ;
      i ++ ) {
        if ( ! ( arr [ i ] . equals ( "5" ) || arr [ i ] . equals ( "0" ) ) ) return false ;
      }
      /* evaluate */
      for ( i = 0 ;
      i < arr . length ;
      i ++ ) {
        if ( ! ( arr [ i ] . equals ( "2" ) || arr [ i ] . equals ( "0" ) || arr [ i ] . equals ( "4" ) || arr [ i ] . equals ( "6" ) || arr [ i ] . equals ( "8" ) ) ) return false ;
      }
      /* evaluate */
      for ( i = 0 ;
      i < arr . length ;
      i ++ ) {
        if ( ! ( arr [ i ] . equals ( "7" ) || arr [ i ] . equals ( "0" ) ) ) return false ;
      }
      /* evaluate */
      for ( i = 0 ;
      i < arr . length ;
      i ++ ) {
        if ( ! ( arr [ i ] . equals ( "-" ) || arr [ i ] . equals ( "" ) ) ) return false ;
      }
      /* evaluate */
      return new String [ ] {
        input , COUNTER }
        ;
        