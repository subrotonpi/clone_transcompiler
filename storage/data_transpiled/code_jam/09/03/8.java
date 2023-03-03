public static final int cases ( ) {
  final int cases = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final String text = "welcome to code jam" ;
  final Map < String , List < Integer >> ref = new HashMap < String , List < Integer >> ( ) ;
  for ( int i : xrange ( text . length ( ) - 1 , - 1 , - 1 ) ) {
    if ( ref . containsKey ( text . charAt ( i ) ) ) ref . get ( text . charAt ( i ) ) . add ( i ) ;
    else ref . put ( text . charAt ( i ) , new ArrayList < Integer > ( ) ) ;
  }
  int testCase = 1 ;
  for ( String line : System . console ( ) . readLine ( ) . split ( "\n" ) ) {
    final int [ ] vals = new int [ text . length ( ) ] ;
    vals [ 0 ] = 1 ;
    vals [ 1 ] += 0 ;
    for ( int i = 0 ;
    i < text . length ( ) ;
    i ++ ) {
      vals [ i ] += 1 ;
    }
    for ( int i = 0 ;
    i < line . length ( ) ;
    i ++ ) {
      if ( ref . containsKey ( text . charAt ( i ) ) ) {
        for ( int pos : ref . get ( text . charAt ( i ) ) ) {
          vals [ pos + 1 ] += vals [ pos ] ;
          vals [ pos + 1 ] %= 10000 ;
        }
      }
    }
    System . out . println ( "Case #" + testCase + ":" ) ;
    final int ans = vals [ vals . length - 1 ] % 10000 ;
    if ( ans < 10 ) System . out . println ( "000" + ans ) ;
    else if ( ans < 100 ) System . out . println ( "00" + ans ) ;
    else if ( ans < 1000 ) System . out . println ( "0" + ans ) ;
    else System . out . println ( ans ) ;
    testCase ++ ;
  }
  return cases ;
}
