public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  String sa = s . substring ( 0 , N ) ;
  String sb = s . substring ( N ) ;
  final int [ ] ALLIST = new int [ N ] ;
  @ SuppressWarnings ( "unchecked" ) final Map < Integer , Integer > STRA = new HashMap < Integer , Integer > ( ) ;
  @ SuppressWarnings ( "unchecked" ) final Map < Integer , Integer > STRB = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < ALLIST . length ;
  i ++ ) {
    String redA = "" ;
    String blueA = "" ;
    String redB = "" ;
    String blueB = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ALLIST [ i ] [ j ] == 0 ) {
        redA += sa . charAt ( j ) ;
        redB += sb . charAt ( j ) ;
      }
      else {
        blueA += sa . charAt ( j ) ;
        blueB += sb . charAt ( j ) ;
      }
    }
    STRA . put ( new Integer ( redA . substring ( 0 , redA . length ( ) - 1 ) ) , blueA . substring ( 0 , blueA . length ( ) - 1 ) ) ;
    STRB . put ( new Integer ( redB . substring ( 0 , blueB . length ( ) - 1 ) ) , blueB . substring ( 0 , blueB . length ( ) - 1 ) ) ;
  }
  int ANS = 0 ;
  for ( Integer key : STRA . keySet ( ) ) {
    ANS += STRA . get ( key ) * STRB . get ( key ) ;
  }
  System . out . println ( ANS ) ;
  return ANS ;
}
