public static void solve ( ) {
  try {
    final Scanner in = new Scanner ( System . in ) ;
    final int M = in . nextInt ( ) ;
    final int N = in . nextInt ( ) ;
    final int M = in . nextInt ( ) ;
    final int M = in . nextInt ( ) ;
    final int N = in . nextInt ( ) ;
    final int [ ] [ ] top = new int [ M ] [ N ] ;
    final int [ ] [ ] bot = new int [ N ] [ M ] ;
    in . nextLine ( ) ;
    final int [ ] [ ] dist = new int [ M ] [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        dist [ j ] [ i ] = in . nextInt ( ) ;
      }
      final PriorityQueue < Integer > Q = new PriorityQueue < Integer > ( ) ;
      HeapSort . sort ( Q , new Comparator < Integer > ( ) {
        @ Override public int compare ( Integer o1 , Integer o2 ) {
          return o2 - o1 ;
        }
      }
      ) ;
      while ( dist [ N - 1 ] [ M - 1 ] == 0 ) {
        int t = HeapSort . sort ( Q , new Comparator < Integer > ( ) {
          @ Override public int compare ( Integer o1 , Integer o2 ) {
            return o1 - o2 ;
          }
        }
        ) ;
        final int i = 0 ;
        final int j = 0 ;
        if ( dist [ i ] [ j ] != 0 ) continue ;
        dist [ i ] [ j ] = t ;
        final int i1 = i + 1 ;
        final int j1 = j + 1 ;
        if ( i1 < 0 || i1 >= N || j1 < 0 || j1 >= M ) continue ;
        if ( top [ i1 ] [ j1 ] - bot [ i1 ] [ j1 ] < 50 ) continue ;
        if ( top [ i ] [ j ] - bot [ i1 ] [ j1 ] < 50 ) continue ;
        if ( top [ i1 ] [ j1 ] - bot [ i ] [ j ] < 50 ) continue ;
        final int d1 = Math . max ( 0 , H - t - ( top [ i1 ] [ j1 ] - 50 ) ) ;
        final int d2 = H - t - d1 - bot [ i1 ] [ j ] >= 20 ? 10 : 100 ;
        final int t1 = t + d1 > 0 ? t + d2 : 0 ;
        if ( dist [ i1 ] [ j1 ] > t1 ) {
          HeapSort . sort ( Q , new Comparator <