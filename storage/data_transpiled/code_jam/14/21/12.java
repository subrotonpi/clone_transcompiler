public static String conv ( String s ) {
  ArrayList < String > ans = new ArrayList < String > ( ) ;
  for ( int i : xrange ( s . length ( ) ) ) {
    if ( i != 0 && s . charAt ( i ) == s . charAt ( i - 1 ) ) {
      ans . set ( ans . get ( ans . size ( ) - 1 ) . charAt ( 0 ) , ans . get ( ans . size ( ) - 1 ) . charAt ( 1 ) + 1 ) ;
    }
    else {
      ans . add ( new String ( s . charAt ( i ) ) ) ;
    }
  }
  /* do something */
  int n = input . nextInt ( ) ;
  ArrayList < String > strs = new ArrayList < String > ( ) ;
  for ( int i : xrange ( n ) ) {
    strs . add ( conv ( new Scanner ( System . in ) ) ) ;
  }
  HashSet < String > flat = new HashSet < String > ( ) ;
  for ( String st : strs ) {
    flat . add ( StringUtils . join ( st , "" ) ) ;
  }
  if ( flat . size ( ) != 1 ) return "Fegla Won" ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < strs . size ( ) ;
  i ++ ) {
    long best = 10000000000 ;
    for ( int attempt : xrange ( 1 , 101 ) ) {
      long res = 0 ;
      for ( int j : i ) {
        res += Math . abs ( j [ 1 ] - attempt ) ;
      }
      if ( res < best ) best = res ;
    }
    ans += best ;
  }
  /* do something */
  int T = input . nextInt ( ) ;
  for ( int i : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + i + ": " + do . next ( ) ) ;
  }
  return ans . toString ( ) ;
}
