private static PrintStream inputF = new PrintStream ( new File ( "A-large.in" ) ) {
  private PrintStream output = new PrintStream ( new FileOutputStream ( "A-large.out" ) ) ;
  int numCases = Integer . parseInt ( inputF . readLine ( ) ) ;
  {
    int count = 0 ;
    int len = groups . length ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      groups [ i ] = groups [ i ] % p ;
    }
    count += groups . count ( 0 ) ;
    len = groups . length ;
    if ( p == 2 && len > 0 ) {
      count += ( len + 1 ) / 2 ;
    }
    else if ( p == 3 && len > 0 ) {
      int minMod = Math . min ( len , groups . count ( 1 ) ) ;
      count += minMod ;
      int remaining = Math . max ( len , groups . count ( 2 ) ) - Math . min ( len , groups . count ( 2 ) ) ;
      count += ( remaining + 2 ) / 3 ;
    }
    else if ( p == 4 && len > 0 ) {
      count += ( len + 2 ) / 2 ;
      boolean extraTwo = ( ( groups . count ( 2 ) % 2 ) == 1 ) ;
      int minMod = Math . min ( len , groups . count ( 3 ) ) ;
      count += minMod ;
      int remaining = Math . max ( len , groups . count ( 3 ) ) - Math . min ( len , groups . count ( 3 ) ) ;
      if ( extraTwo ) {
        count += 1 + ( remaining + 1 ) / 4 ;
      }
      else {
        count += ( remaining + 3 ) / 4 ;
      }
    }
    return count ;
  }
}
