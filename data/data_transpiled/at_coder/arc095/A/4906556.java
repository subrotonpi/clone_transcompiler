public static int [ ] [ ] getDistance ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < X . length ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] [ ] SX = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < SX . length ;
  i ++ ) {
    SX [ i ] = new int [ ] {
      i , X [ i ] }
      ;
    }
    Arrays . sort ( SX , new Comparator < int [ ] > ( ) {
      @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o2 [ 1 ] - o1 [ 0 ] ;
      }
    }
    ) ;
    int lm = SX [ N / 2 - 1 ] [ 1 ] ;
    int rm = SX [ N / 2 ] [ 1 ] ;
    int [ ] [ ] res = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( i < N / 2 ) res [ i ] [ 0 ] = rm ;
      else res [ i ] [ 0 ] = lm ;
    }
    for ( int r : res ) {
      System . out . println ( r ) ;
    }
    return res ;
  }
  