public static void for ( int x = 1 ;
x <= Integer . MAX_VALUE ;
x ++ ) {
  String N = input . next ( ) ;
  String V = input . next ( ) ;
  String X = input . next ( ) ;
  N = Integer . parseInt ( N ) ;
  V = Double . parseDouble ( V ) ;
  X = Double . parseDouble ( X ) ;
  List < Tuple < Double , Double >> sources = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sources . add ( new Tuple < > ( Double . parseDouble ( input . next ( ) ) ) ) ;
  }
  List < Double > R = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < sources . size ( ) ;
  i ++ ) {
    R . add ( sources . get ( i ) . x ) ;
  }
  List < Double > C = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < sources . size ( ) ;
  i ++ ) {
    C . add ( sources . get ( i ) . y ) ;
  }
  String y ;
  if ( N == 1 ) {
    if ( X != C . get ( 0 ) ) {
      y = "IMPOSSIBLE" ;
    }
    else {
      y = V . divide ( R . get ( 0 ) , R . get ( 1 ) ) ;
    }
  }
  else if ( N == 2 ) {
    if ( C . get ( 0 ) > C . get ( 1 ) ) {
      R . set ( 0 , R . get ( 1 ) ) ;
      R . set ( 1 , R . get ( 0 ) ) ;
      C . set ( 0 , C . get ( 1 ) ) ;
      C . set ( 1 , C . get ( 0 ) ) ;
    }
    if ( C . get ( 0 ) <= X && X <= C . get ( 1 ) ) {
      if ( C . get ( 0 ) == C . get ( 1 ) ) {
        y = V . divide ( R . get ( 0 ) + R . get ( 1 ) , R . get ( 1 ) ) ;
      }
      else if ( C . get ( 0 ) == X ) {
        y = V . divide ( R . get ( 0 ) , R . get ( 1 ) ) ;
      }
      else if ( C . get ( 1 ) == X ) {
        y = V . divide ( R . get ( 1 ) , R . get ( 1 ) ) ;
      }
      else {
        double a0 = V * ( C .