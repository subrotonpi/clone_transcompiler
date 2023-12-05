static final void solve ( ) throws IOException {
  System . setIn ( new FileInputStream ( "a.in" ) ) ;
  System . setOut ( new PrintStream ( "a.out" ) ) ;
  /* getline */
  Arrays . stream ( input . split ( " " ) ) . map ( c -> Integer . parseInt ( c ) ) . forEach ( c -> {
    /* can a long */
    int ans = 0 ;
    boolean flag = true ;
    int count = Integer . parseInt ( ( t + ( c - 1 ) ) / c ) ;
    int free = Integer . parseInt ( ( t % c ) ) ;
    if ( count + free >= N ) {
      flag = true ;
      int tmp = 0 ;
      for ( int j = 0 ;
      j < B ;
      j ++ ) {
        if ( t % b [ j ] == 0 ) {
          tmp ++ ;
        }
        if ( tmp == N - count ) {
          /* print out */
          ans = j + 1 ;
          /* print out */
        }
      }
      /* solve */
      Arrays . fill ( b , true ) ;
      Arrays . fill ( b , true ) ;
      int l = 0 ;
      int r = 10000000000000000 ;
      /* print out */
      if ( flag ) return ans ;
      while ( l + 1 < r ) {
        int m = ( l + r ) / 2 ;
        /* print out */
        ans = can ( m , b , B , N ) ;
        if ( flag ) r = m ;
        else l = m ;
      }
      /* print out */
      ans = can ( r , b , B , N ) ;
      /* print out */
    }
    /* print out */
    for ( int T = 0 ;
    T < Integer . parseInt ( input . readLine ( ) ) ;
    T ++ ) {
      System . err . println ( Integer . toString ( T ) ) ;
      System . out . println ( "Case #" + ( T + 1 ) + ": " + solve ( T ) ) ;
    }
  }
  ) ;
}
