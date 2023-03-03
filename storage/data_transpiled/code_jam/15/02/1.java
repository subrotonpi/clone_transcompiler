public static void input ( ) {
  int t = input . nextInt ( ) ;
  for ( int j : xrange ( t ) ) {
    int d = input . nextInt ( ) ;
    int pancakes = ArrayUtil . parseInt ( readLine ( ) . trim ( ) . split ( " " ) [ 0 ] ) ;
    int mintime = 1000 ;
    for ( int maxstacksize : xrange ( Math . max ( pancakes , 0 ) , - 1 ) ) {
      int time = maxstacksize ;
      for ( int p : pancakes ) {
        time += ( p - 1 ) / maxstacksize ;
      }
      if ( time < mintime ) {
        mintime = time ;
      }
    }
    System . out . println ( "Case #" + ( j + 1 ) + ": " + mintime ) ;
  }
}
