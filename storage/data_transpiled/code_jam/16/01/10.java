public static void input ( ) {
  tnum = input . nextInt ( ) ;
  for ( int tcou = 0 ;
  tcou < tnum ;
  tcou ++ ) {
    int n = input . nextInt ( ) ;
    String answer ;
    if ( n == 0 ) {
      answer = "INSOMNIA" ;
    }
    else {
      int m = 0 ;
      Set < String > s = new HashSet < String > ( ) ;
      do {
        m += n ;
        for ( String s : Integer . toString ( m ) . split ( " " ) ) {
          s . add ( s ) ;
        }
      }
      while ( s . size ( ) == 10 ) ;
      if ( s . size ( ) == 10 ) {
        answer = m ;
        break ;
      }
    }
  }
  System . out . println ( "Case #" + ( tcou + 1 ) + ": " + answer ) ;
}
