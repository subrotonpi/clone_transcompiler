@ VisibleForTesting static void from ( String input ) {
  int n = Integer . parseInt ( input ) , c = Integer . parseInt ( input ) ;
  int [ ] [ ] stc = new int [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    stc [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( stc , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return ( o2 > o2 ) ? 2 : ( o1 > o2 ) ? 1 : - 1 ;
    }
  }
  ) ;
  int [ ] timeline = new int [ 10 * 5 + 1 ] ;
  int prevT = - 1 ;
  for ( int i = 0 ;
  i < timeline . length ;
  i ++ ) {
    int s = stc [ i ] [ 0 ] ;
    int t = stc [ i ] [ 1 ] ;
    if ( prevT != t ) {
      prevT = - 100 ;
    }
    if ( prevT != s ) {
      timeline [ s - 1 ] ++ ;
      timeline [ t ] ++ ;
    }
    else {
      timeline [ s ] ++ ;
      timeline [ t ] ++ ;
    }
    prevT = t ;
    prevC = c ;
  }
  System . out . println ( Math . max ( timeline [ 0 ] , timeline [ 1 ] ) ) ;
}
