public static final int [ ] [ ] getSortedList ( ) {
  Scanner input = new Scanner ( System . in ) ;
  int N = input . nextInt ( ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = input . nextInt ( ) ;
  }
  int [ ] [ ] ansArray = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ansArray [ i ] = new int [ N ] ;
    ansArray [ i ] [ 0 ] = i ;
    ansArray [ i ] [ 1 ] = j ;
    ansArray [ i ] [ 2 ] = 0 ;
  }
  Arrays . sort ( ansArray , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      int tmp = o1 [ 0 ] ;
      int cnt = 0 ;
      for ( int i = 1 ;
      i < N ;
      i ++ ) {
        if ( o1 [ i ] == o2 [ i ] ) {
          o1 [ i ] = o2 [ i ] ;
          cnt ++ ;
        }
        else {
          tmp = o1 [ i ] ;
          cnt ++ ;
        }
      }
      return cnt ;
    }
  }
  ) ;
  Arrays . sort ( ansArray , new Comparator < int [ ] > ( ) {
    @ Override public int compare ( int [ ] o1 , int [ ] o2 ) {
      int tmp = o1 [ 0 ] ;
      int cnt = 0 ;
      for ( int i = 1 ;
      i < N ;
      i ++ ) {
        if ( o1 [ i ] == o2 [ i ] ) {
          return cnt ;
        }
      }
      return cnt ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( i [ 2 ] ) ;
  }
  return ansArray ;
}
