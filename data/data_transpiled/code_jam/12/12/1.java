static final int [ ] [ ] getStrengthNumbers ( int t_t ) {
  final int tN = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t_t = 1 ;
  t_t <= tN ;
  t_t ++ ) {
    final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    final List < List < Integer >> a = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a . add ( Collections . singletonList ( Integer . parseInt ( System . console ( ) . readLine ( ) ) ) ) ;
    }
    final int [ ] [ ] result = new int [ n ] [ ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      result [ i ] = new int [ n ] ;
    }
    Arrays . sort ( result , new Comparator < List < Integer >> ( ) {
      @ Override public int compare ( final List < Integer > o1 , final List < Integer > o2 ) {
        return ( o1 . get ( 1 ) ) . compareTo ( o2 . get ( 0 ) ) ;
      }
    }
    ) ;
    final int [ ] b = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      b [ i ] = 0 ;
    }
    int ans = 0 ;
    int stars = 0 ;
    boolean bad = false ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int j = n - 1 ;
      while ( stars < result [ i ] [ 1 ] && j >= i ) {
        if ( b [ j ] == 0 && result [ i ] [ 0 ] <= stars ) {
          stars ++ ;
          ans ++ ;
          b [ j ] = 1 ;
          j = n ;
        }
        j -- ;
      }
      if ( result [ i ] [ 1 ] > stars ) {
        bad = true ;
      }
      ans ++ ;
      stars += 2 - b [ i ] ;
    }
    if ( bad ) {
      System . out . println ( "Case #" + t_t + ": Too Bad" ) ;
    }
    else {
      System . out . println ( "Case #" + t_t + ": " + ans ) ;
    }
  }
  return result ;
}
