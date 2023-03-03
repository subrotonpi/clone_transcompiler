static private int solve ( boolean [ ] [ ] grid ) {
  int count = 0 ;
  do {
    boolean done = true ;
    for ( int i = 99 ;
    i >= 0 ;
    i -- ) {
      for ( int j = 99 ;
      j >= 0 ;
      j -- ) {
        boolean north = i > 0 && grid [ i - 1 ] [ j ] ;
        boolean west = j > 0 && grid [ i ] [ j - 1 ] ;
        if ( grid [ i ] [ j ] ) {
          done = false ;
          if ( ! ( north || west ) ) {
            grid [ i ] [ j ] = false ;
          }
        }
        else {
          if ( north && west ) {
            grid [ i ] [ j ] = true ;
          }
        }
      }
    }
    if ( done ) {
      return count ;
    }
    count ++ ;
  }
  while ( true ) ;
  {
    int T = Integer . parseInt ( input ( ) ) ;
    for ( int x = 1 ;
    x <= T ;
    x ++ ) {
      boolean [ ] [ ] grid = new boolean [ 100 ] [ 100 ] ;
      for ( int j = 0 ;
      j < 100 ;
      j ++ ) {
        for ( int i = 0 ;
        i < 100 ;
        i ++ ) {
          for ( int j = 0 ;
          j < 100 ;
          j ++ ) {
            grid [ i ] [ j ] = false ;
          }
        }
      }
      int R = Integer . parseInt ( input ( ) ) ;
      for ( int k = 0 ;
      k < R ;
      k ++ ) {
        int X1 = Integer . parseInt ( input ( ) ) ;
        int Y1 = Integer . parseInt ( input ( ) ) ;
        int X2 = Integer . parseInt ( input ( ) ) ;
        int Y2 = Integer . parseInt ( input ( ) ) ;
        for ( int i = Y1 - 1 ;
        i < Y2 ;
        i ++ ) {
          for ( int j = X1 - 1 ;
          j < X2 ;
          j ++ ) {
            grid [ i ] [ j ] = true ;
          }
        }
      }
      System . out . println ( "Case #" + x + ":" + solve ( grid ) ) ;
    }
  }
}
