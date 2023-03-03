@ GwtIncompatible ( "java.util.Scanner" ) public static double E = 0.0 ;
{
  BufferedReader br = new BufferedReader ( new FileReader ( "A.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "A.out" ) ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    System . out . println ( "Case #" + t + ":" ) ;
    int r1 = Integer . parseInt ( br . readLine ( ) ) ;
    Set < String > s1 = getSet ( br , r1 ) ;
    int r2 = Integer . parseInt ( br . readLine ( ) ) ;
    Set < String > s2 = getSet ( br , r2 ) ;
    Set < String > res = s1 . stream ( ) . filter ( s2 :: contains ) . collect ( Collectors . toSet ( ) ) ;
    if ( ( res . size ( ) == 1 ) && ( res . iterator ( ) . hasNext ( ) ) ) {
      System . out . println ( Collections . singletonList ( res . iterator ( ) . next ( ) ) ) ;
    }
    else if ( ( res . size ( ) > 1 ) && ( res . iterator ( ) . hasNext ( ) ) ) {
      System . out . println ( "Bad magician!" ) ;
    }
    else {
      System . out . println ( "Volunteer cheated!" ) ;
    }
  }
  {
    Set < String > s = new HashSet < String > ( ) ;
    for ( int i = 1 ;
    i <= 4 ;
    i ++ ) {
      String [ ] cards = br . readLine ( ) . split ( " " ) ;
      if ( i == r ) {
        for ( String card : cards ) {
          s . add ( card ) ;
        }
      }
    }
    return s ;
  }
}
