public static void print ( int N ) {
  String [ ] [ ] rythm = new String [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String S = new String ( input . nextLine ( ) ) ;
    rythm [ i ] = S ;
  }
  int cnt = 0 ;
  boolean renda = false ;
  for ( int column = 0 ;
  column < 9 ;
  column ++ ) {
    renda = false ;
    for ( int row = 0 ;
    row < N ;
    row ++ ) {
      if ( renda == true ) {
        if ( rythm [ row ] [ column ] . equals ( "o" ) ) {
          continue ;
        }
        else {
          renda = false ;
        }
      }
      switch ( rythm [ row ] [ column ] ) {
        case "x" : cnt ++ ;
        break ;
        case "o" : cnt ++ ;
        renda = true ;
        break ;
        default : break ;
      }
    }
  }
  System . out . println ( cnt ) ;
}
