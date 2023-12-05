public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String W = input ;
  Set < String > words = new HashSet < String > ( ) ;
  words . add ( W ) ;
  char end = W . charAt ( W . length ( ) - 1 ) ;
  String lose = "*" ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    W = input . charAt ( i ) ;
    if ( ( ( words . contains ( W ) || W . charAt ( 0 ) != end ) ) && lose . equals ( "*" ) ) {
      if ( i % 2 == 0 ) {
        lose = "hiragana" ;
      }
      else {
        lose = "katakana" ;
      }
    }
    end = W . charAt ( W . length ( ) - 1 ) ;
    words . add ( W ) ;
  }
  if ( lose . equals ( "*" ) ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( lose . equals ( "katakana" ) ) {
    System . out . println ( "WIN" ) ;
  }
  else {
    System . out . println ( "LOSE" ) ;
  }
}
