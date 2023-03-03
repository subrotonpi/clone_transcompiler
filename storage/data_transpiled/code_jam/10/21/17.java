public static void main ( String input ) {
  int ntests = Integer . parseInt ( input ) ;
  for ( int tt = 1 ;
  tt <= ntests ;
  tt ++ ) {
    Arrays . fill ( input . split ( " " ) , Integer . MAX_VALUE ) ;
    Arrays . fill ( input . split ( " " ) , Integer . MAX_VALUE ) ;
    Set < String > dirs = new HashSet < String > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      String p = input . substring ( i , i + 1 ) + "/" ;
      for ( int z = 0 ;
      z < p . length ( ) - 1 ;
      z ++ ) {
        if ( ( p . charAt ( z + 1 ) == '/' ) && ( p . charAt ( z + 1 ) == '/' ) ) dirs . add ( p . substring ( 0 , ( z + 1 ) ) ) ;
      }
    }
    int k = dirs . size ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      String p = input . substring ( i , i + 1 ) + "/" ;
      for ( int z = 0 ;
      z < p . length ( ) - 1 ;
      z ++ ) {
        if ( ( p . charAt ( z + 1 ) == '/' ) && ( p . charAt ( z + 1 ) == '/' ) ) dirs . add ( p . substring ( 0 , ( z + 1 ) ) ) ;
      }
    }
    System . out . println ( "Case #" + tt + ": " + ( dirs . size ( ) - k ) ) ;
  }
}
