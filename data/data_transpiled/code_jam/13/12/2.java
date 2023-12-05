private static int [ ] readLine ( ) {
  return Arrays . stream ( new Scanner ( System . in ) . nextLine ( ) . split ( "\\s+" ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  /* max i */
  int m = l . get ( ) ;
  int mi = left ;
  for ( int i = left ;
  i < right ;
  i ++ ) {
    if ( l . get ( i ) > m ) {
      mi = i ;
      m = l . get ( i ) ;
    }
  }
  /* get the number of times */
  int cases = readline ( ) . nextInt ( ) ;
  for ( int v = 0 ;
  v < cases ;
  v ++ ) {
    int E = readline ( ) . nextInt ( ) ;
    int R = readline ( ) . nextInt ( ) ;
    int N = readline ( ) . nextInt ( ) ;
    if ( R > E ) R = E ;
    int [ ] tasks = readline ( ) . split ( N ) ;
    /* solve the left */
    int left = tasks [ left ] ;
    int right = tasks [ right ] ;
    int se = tasks [ left ] ;
    int ee = tasks [ right ] ;
    if ( right == left ) return 0 ;
    if ( right - left == 1 ) {
      int me = ee - R ;
      if ( me < 0 ) assert false ;
      return tasks [ left ] * ( se - me ) ;
    }
    int split = maxi ( tasks , left , right ) ;
    int newee = Math . min ( se + ( split - left ) * R , E ) ;
    int newse = Math . max ( ee - ( right - split - 1 ) * R , R ) ;
    int k = newee - newse + R ;
    return solve ( left , split , se , newee ) + solve ( split + 1 , right , newse , ee ) + k * tasks [ split ] ;
  }
  int ans = solve ( 0 , tasks . length , E , R ) ;
  System . out . println ( "Case #" + ( v + 1 ) + ": " + ans ) ;
  return ans ;
}
