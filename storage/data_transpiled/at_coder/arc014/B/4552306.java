public static final String getStdOut ( ) {
  System . setIn ( "Enter a number of characters in the input string" ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  Set < String > p = new HashSet < String > ( ) ;
  String ans = "DRAW" ;
  int cnt = 1 ;
  String prev = input . nextLine ( ) ;
  p . add ( prev ) ;
  for ( ;
  ;
  ) {
    cnt ++ ;
    String s = input . nextLine ( ) ;
    if ( s . charAt ( 0 ) == prev . charAt ( prev . length ( ) - 1 ) ) {
      if ( p . contains ( s ) ) {
        if ( cnt % 2 == 1 ) ans = "LOSE" ;
        else ans = "WIN" ;
        break ;
      }
      else {
        prev = s ;
        p . add ( s ) ;
      }
    }
    else {
      if ( cnt % 2 == 1 ) ans = "LOSE" ;
      else ans = "WIN" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
}
