public static int N = Integer . parseInt ( input ) {
  String W1 = input . next ( ) ;
  ArrayList < String > A = new ArrayList < String > ( ) ;
  A . add ( W1 ) ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    String w = input . next ( ) ;
    if ( w . charAt ( 0 ) == A . get ( A . size ( ) - 1 ) . charAt ( A . size ( ) - 1 ) ) {
      if ( ! A . contains ( w ) ) {
        A . add ( w ) ;
      }
      else {
        if ( i % 2 == 0 ) {
          System . out . println ( "WIN" ) ;
          exit ( ) ;
        }
        else {
          System . out . println ( "LOSE" ) ;
          exit ( ) ;
        }
      }
    }
  }
  System . out . println ( "DRAW" ) ;
}
