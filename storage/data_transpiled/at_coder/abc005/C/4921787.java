public static void print ( String input ) {
  int T = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  List < Integer > A = new ArrayList < > ( ) ;
  for ( String s : input . split ( " " ) ) {
    A . add ( Integer . parseInt ( s ) ) ;
  }
  int M = Integer . parseInt ( input ) ;
  List < Integer > B = new ArrayList < > ( ) ;
  for ( String s : input . split ( " " ) ) {
    B . add ( Integer . parseInt ( s ) ) ;
  }
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int cusIndex = 0 ;
  cusIndex < M ;
  cusIndex ++ ) {
    int takoyakiIndex = 0 ;
    while ( takoyakiIndex < N ) {
      if ( A . get ( takoyakiIndex ) + T >= B . get ( cusIndex ) ) {
        A . remove ( takoyakiIndex ) ;
        N -- ;
        break ;
      }
      takoyakiIndex ++ ;
    }
  }
  if ( ans . length ( ) == 0 ) {
    ans . append ( "no" ) ;
  }
  System . out . println ( ans ) ;
}
