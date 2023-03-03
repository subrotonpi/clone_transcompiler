public static void readInput ( BufferedReader in ) throws IOException {
  int T = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int x = 0 ;
  x < T ;
  x ++ ) {
    String s = in . readLine ( ) ;
    s = s . substring ( 0 , s . length ( ) - 1 ) ;
    int n = s . length ( ) ;
    int sol = 0 ;
    int maxx = s . length ( ) ;
    for ( int i = n - 1 ;
    i >= 0 ;
    i -- ) {
      if ( maxx > s . charAt ( i ) ) {
        break ;
      }
      else {
        maxx = s . charAt ( i ) ;
      }
    }
    if ( maxx > s . charAt ( i ) ) {
      for ( int j = i + 1 ;
      j < n ;
      j ++ ) {
        if ( s . charAt ( j ) > s . charAt ( i ) ) {
          if ( maxx > s . charAt ( j ) ) {
            maxx = s . charAt ( j ) ;
          }
        }
      }
      StringBuilder rest = new StringBuilder ( ) ;
      for ( int i = i ;
      i < n ;
      i ++ ) {
        rest . append ( s . charAt ( i ) ) ;
      }
      rest . deleteCharAt ( i ) ;
      sol = s . substring ( 0 , i ) + maxx + rest . toString ( ) ;
    }
    else {
      int minn = Math . min ( s . length ( ) , n ) ;
      StringBuilder rest = new StringBuilder ( ) ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        rest . append ( s . charAt ( i ) ) ;
      }
      rest . deleteCharAt ( i ) ;
      sol = minn + '0' + rest . toString ( ) ;
    }
    System . out . println ( "Case #" + ( x + 1 ) + ": " + sol ) ;
  }
}
