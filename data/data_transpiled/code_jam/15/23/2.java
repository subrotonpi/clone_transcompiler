public static void for ( int x = 1 ;
x <= Integer . parseInt ( input ) ;
x ++ ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Edge > hikers = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int D = Integer . parseInt ( input . nextLine ( ) ) ;
    int H = Integer . parseInt ( input . nextLine ( ) ) ;
    int M = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = M ;
    j < M + H ;
    j ++ ) {
      hikers . add ( new Edge ( D , j , ( 360 - D ) * j ) ) ;
    }
  }
  int Hcount = hikers . size ( ) ;
  int y = Hcount ;
  for ( int i = 0 ;
  i < Hcount ;
  i ++ ) {
    int score = 0 ;
    for ( int j = 0 ;
    j < Hcount ;
    j ++ ) {
      if ( i == j ) continue ;
      int crosses = ( hikers . get ( i ) . _2 - hikers . get ( j ) . _2 ) / 360 / hikers . get ( j ) . _2 ;
      score += Math . abs ( crosses ) ;
    }
    y = Math . min ( y , score ) ;
  }
  System . out . println ( "Case #" + x + ":" + y ) ;
}
