static void sim ( HashMap < String , String > comb , HashSet < String > opp , String [ ] invoke ) {
  final StringBuilder v = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < invoke . length ;
  i ++ ) {
    final String p = invoke [ i ] ;
    v . append ( p ) ;
    boolean changed = true ;
    while ( changed ) {
      changed = false ;
      if ( v . length ( ) >= 2 ) {
        final String bi = v . substring ( v . length ( ) - 2 ) ;
        final String rebi = bi . substring ( bi . length ( ) + 1 ) + bi . substring ( 0 , bi . length ( ) ) ;
        if ( ( bi != null ) && ( comb . containsKey ( bi ) ) ) {
          v . delete ( v . length ( ) - 2 , v . length ( ) ) ;
          changed = true ;
        }
        else if ( ( rebi != null ) && ( comb . containsKey ( rebi ) ) ) {
          v . delete ( v . length ( ) - 2 , v . length ( ) ) ;
          changed = true ;
        }
      }
      final HashSet < String > ps = new HashSet < String > ( v ) ;
      for ( final String bi : opp ) {
        if ( ps . contains ( bi . substring ( 0 , bi . length ( ) ) ) && ps . contains ( bi . substring ( bi . length ( ) + 1 ) ) ) {
          v . setLength ( 0 ) ;
        }
      }
    }
    System . out . println ( "[" + v . toString ( ) + "]" ) ;
  }
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testNr = 1 ;
  testNr <= t ;
  testNr ++ ) {
    System . out . println ( "Case #" + testNr + ":" ) ;
    String [ ] a = System . console ( ) . readLine ( ) . split ( " " ) ;
    final int c = Integer . parseInt ( a [ 0 ] ) ;
    comb . clear ( ) ;
    opp . clear ( ) ;
    for ( int i = 1 ;
    i <= c ;
    i ++ ) {
      final String tri = a [ i ] ;
      comb . put ( tri . substring ( 0 , 2 ) , tri . substring ( 2 ) ) ;
    }
    final int d = Integer . parseInt ( a [ c + 1 ] ) ;
    a = a [ c + 1 ] ;
    for ( int i = 1 ;
    i <= d ;
    i