static int readInteger ( ) {
  return Integer . parseInt ( readLine ( ) ) ;
  /* read array */
  int T = readInt ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    int N = readInt ( ) ;
    int [ ] [ ] H = new int [ N ] [ ] ;
    int [ ] M = new int [ N ] ;
    int [ ] roots = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int [ ] input = readArray ( Integer . class ) ;
      M [ i ] = input [ 0 ] ;
      H [ i ] = map ( input [ 1 ] , input [ 2 ] ) ;
      roots = Arrays . copyOf ( roots , H [ i ] ) ;
    }
    boolean flag = false ;
    for ( int r : roots ) {
      boolean [ ] V = new boolean [ N ] ;
      V [ r ] = true ;
      Queue < Integer > Q = new LinkedList < Integer > ( ) ;
      Q . add ( r ) ;
      while ( Q . isEmpty ( ) && ! flag ) {
        int p = Q . poll ( ) ;
        for ( int s : H [ p ] ) {
          if ( V [ s ] ) {
            flag = true ;
          }
          else {
            V [ s ] = true ;
            Q . add ( s ) ;
          }
        }
      }
      if ( flag ) break ;
    }
    System . out . println ( flag ? "Yes" : "No" ) ;
  }
  return T ;
}
