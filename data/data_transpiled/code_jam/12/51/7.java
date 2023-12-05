public static void main ( String [ ] args ) {
  int T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int n = input . nextInt ( ) ;
    int l = Integer . parseInt ( readLine ( ) ) ;
    int p = Integer . parseInt ( readLine ( ) ) ;
    int [ ] a = zip ( l , p , n ) ;
    Arrays . sort ( a , new Comparator < int [ ] > ( ) {
      public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o1 [ 0 ] * o2 [ 1 ] - o1 [ 1 ] * o2 [ 0 ] ;
      }
    }
    ) ;
    System . out . println ( "Case #" + t + ":" ) ;
    for ( int [ ] o1 : a ) {
      System . out . println ( o1 [ 2 ] + " " + o2 [ 2 ] ) ;
    }
    System . out . println ( ) ;
  }
  if ( getClass ( ) . isAnnotationPresent ( Test . class ) ) {
    Main . main ( ) ;
  }
}
