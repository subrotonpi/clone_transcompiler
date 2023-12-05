public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String S = input ;
  List < String > start_set = new ArrayList < String > ( ) ;
  start_set . add ( "SS" ) ;
  start_set . add ( "SW" ) ;
  start_set . add ( "WS" ) ;
  start_set . add ( "WW" ) ;
  /* List<String> goal_set = new ArrayList<String>();
  if (S.charAt(i) == 'o') {
  goal_set.add("SSS");
  goal_set.add("WSW");
  goal_set.add("WWS");
  goal_set.add("SWW");
  }
  else {
  goal_set.add("WSS");
  goal_set.add("SSW");
  goal_set.add("WWW");
  goal_set.add("SWS");
  }*/
  List < String > goal_set1 = new ArrayList < String > ( 0 ) ;
  List < String > goal_set2 = new ArrayList < String > ( - 1 ) ;
  boolean isok = false ;
  for ( String st : start_set ) {
    StringBuilder O = new StringBuilder ( ) ;
    O . append ( st . substring ( 0 , 1 ) ) ;
    O . append ( st . substring ( 1 ) ) ;
    for ( int i = 1 ;
    i < N - 1 ;
    i ++ ) {
      if ( O . charAt ( i - 1 ) == 'S' ) {
        if ( O . charAt ( i ) == 'S' ) {
          if ( S . charAt ( i ) == 'o' ) {
            O . append ( "S" ) ;
          }
          else {
            O . append ( "W" ) ;
          }
        }
        else {
          if ( S . charAt ( i ) == 'o' ) {
            O . append ( "W" ) ;
          }
          else {
            O . append ( "S" ) ;
          }
        }
      }
      if ( O . charAt ( i - 1 ) == 'W' ) {
        if ( O . charAt ( i ) == 'S' ) {
          if ( S . charAt ( i ) == 'o' ) {
            O . append ( "W" ) ;
          }
          else {
            O .