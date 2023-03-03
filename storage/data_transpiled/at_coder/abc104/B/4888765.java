@ Function public static LinkedHashMap < Integer , Integer > map ( ) {
  final int INF = 10 * 18 ;
  final int MOD = 10 * 9 + 7 ;
  final int INF = INF ;
  final int INF = INF ;
  final int MOD = MOD ;
  {
    final int [ ] ints = new int [ 1 ] ;
    ints [ 0 ] = Integer . parseInt ( System . in ) ;
    ints [ 1 ] = Integer . parseInt ( System . in ) ;
    ints [ 2 ] = Float . parseFloat ( System . in ) ;
    ints [ 3 ] = Float . parseFloat ( System . in ) ;
    ints [ 4 ] = Float . parseFloat ( System . in ) ;
    ints [ 5 ] = Float . parseFloat ( System . in ) ;
    ints [ 6 ] = Float . parseFloat ( System . in ) ;
    ints [ 7 ] = Float . parseFloat ( System . in ) ;
    ints [ 8 ] = Float . parseFloat ( System . in ) ;
    ints [ 9 ] = Float . parseFloat ( System . in ) ;
    ints [ 10 ] = Float . parseFloat ( System . in ) ;
    ints [ 11 ] = Float . parseFloat ( System . in ) ;
    ints [ 12 ] = Float . parseFloat ( System . in ) ;
    ints [ 13 ] = Float . parseFloat ( System . in ) ;
    ints [ 14 ] = Float . parseFloat ( System . in ) ;
    ints [ 15 ] = Float . parseFloat ( System . in ) ;
    ints [ 16 ] = Float . parseFloat ( System . in ) ;
    ints [ 17 ] = Float . parseFloat ( System . in ) ;
    ints [ 18 ] = Float . parseFloat ( System . in ) ;
    ints [ 19 ] = Float . parseFloat ( System . in ) ;
    ints [ 23 ] = Float . parseFloat ( System . in ) ;
  }
  final String s = new Scanner ( System . in ) . nextLine ( ) ;
  if ( s . charAt ( 0 ) == 'A' && s . substring ( 2 , s . length ( ) - 1 ) . indexOf ( 'C' ) == 1 && s . charAt ( s . length ( ) - 1 ) . isLowerCase ( ) ) {
    System . out . println ( "AC" ) ;
  }
  else {
    System . out . println ( "WA" ) ;
  }
  return new LinkedHashMap < > ( ) {
    {
      put ( s , INF ) ;
      put ( s , MOD ) ;
      put ( s , MOD ) ;
      put ( s , MOD ) ;
      put ( s , MOD ) ;
    }
  }
  ;
}
