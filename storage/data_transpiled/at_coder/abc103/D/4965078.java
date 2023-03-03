public static void islands ( int requests , int islands ) {
  int [ ] [ ] req = new int [ requests ] [ ] ;
  for ( int r = 0 ;
  r < requests ;
  r ++ ) {
    int a = Integer . parseInt ( input . readLine ( ) ) ;
    int b = Integer . parseInt ( input . readLine ( ) ) ;
    req [ r ] = new int [ ] {
      a , b }
      ;
    }
    Arrays . sort ( req , new Comparator < int [ ] > ( ) {
      public int compare ( int [ ] o1 , int [ ] o2 ) {
        return o2 . length - o1 . length ;
      }
    }
    ) ;
    int answer = 1 ;
    int tempEnd = req [ 0 ] [ 1 ] ;
    for ( int i = 0 ;
    i < req . length ;
    i ++ ) {
      if ( req [ i ] [ 0 ] >= tempEnd ) {
        tempEnd = req [ i ] [ 1 ] ;
        answer ++ ;
      }
    }
    System . out . println ( answer ) ;
  }
  