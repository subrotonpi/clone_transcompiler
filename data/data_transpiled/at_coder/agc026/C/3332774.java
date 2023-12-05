public static int N = Integer . parseInt ( input ) {
  String s = input . nextLine ( ) ;
  String sa = s . substring ( 0 , N ) ;
  String sb = s . substring ( N ) ;
  final List < Integer > ALLIST = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ALLIST . add ( i ) ;
  }
  @ SuppressWarnings ( "unchecked" ) final Map < Integer , Integer > STRA = Maps . newHashMap ( ) ;
  final Map < Integer , Integer > STRB = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < ALLIST . size ( ) ;
  i ++ ) {
    String redA = "" ;
    String blueA = "" ;
    String redB = "" ;
    String blueB = "" ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( ALLIST . get ( i ) . intValue ( ) == 0 ) {
        redA += sa . charAt ( j ) ;
        redB += sb . charAt ( j ) ;
      }
      else {
        blueA += sa . charAt ( j ) ;
        blueB += sb . charAt ( j ) ;
      }
    }
    STRA . put ( new Integer ( redA . substring ( 0 , 0 ) ) , new Integer ( blueA . substring ( 0 , blueB . substring ( 0 , blueB . length ( ) ) ) ) ) ;
    STRB . put ( new Integer ( redB . substring ( 0 , blueB . substring ( 0 , blueB . length ( ) ) ) ) , new Integer ( blueB . substring ( 0 , blueB . length ( ) ) ) ) ;
  }
  int ANS = 0 ;
  for ( Integer key : STRA . keySet ( ) ) {
    ANS += STRA . get ( key ) * STRB . get ( key ) ;
  }
  System . out . println ( ANS ) ;
  return ANS ;
}
