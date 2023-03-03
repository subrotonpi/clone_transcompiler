public static void nextPermutation ( List < String > list , Comparator < String > pred ) throws IOException {
  /* reverse the list to the end of the last */
  int end = list . size ( ) ;
  if ( end <= start ) {
    return ;
  }
  do {
    list . set ( start , list . get ( end ) ) ;
    if ( start == end || start + 1 == end ) {
      return ;
    }
    start ++ ;
    end -- ;
  }
  while ( start <= end ) ;
  int first = 0 ;
  int last = list . size ( ) ;
  int len = list . size ( ) ;
  if ( last == 1 ) {
    return ;
  }
  do {
    int next = last - 1 ;
    do {
      int next1 = next ;
      next -- ;
      if ( pred . compare ( list . get ( next ) , list . get ( next1 ) ) < 0 ) {
        int mid = last - 1 ;
        while ( ! ( pred . compare ( list . get ( next ) , list . get ( mid ) ) < 0 ) ) {
          mid -- ;
        }
        list . set ( next , list . get ( mid ) ) ;
        reverse ( list , next1 , last ) ;
        return ;
      }
      if ( next == first ) {
        return ;
      }
    }
    while ( next == last ) ;
  }
  while ( first == last ) ;
  BufferedReader br = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    List < String > n = new LinkedList < String > ( ) ;
    String np = nextPermutation ( n ) ;
    if ( np == null ) {
      n . clear ( ) ;
      first = Arrays . copyOf ( n , n . size ( ) ) ;
      n . remove ( n . indexOf ( first ) ) ;
      n . clear ( ) ;
      n . add ( first ) ;
      n . add ( "0" ) ;
    }
    else {
      n = np ;
    }
    System . out . println ( n ) ;
  }
}
