public static void input ( int r , int c , int k ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] rlist = new int [ r ] ;
  int [ ] clist = new int [ c ] ;
  int [ ] rclist = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int _r = Integer . parseInt ( input . readLine ( ) ) ;
    int _c = Integer . parseInt ( input . readLine ( ) ) ;
    rclist [ i ] = new int [ ] {
      _r - 1 , _c - 1 }
      ;
      rlist [ i ] ++ ;
      clist [ i ] ++ ;
    }
    HashMap < Integer , Integer > rcounter = new HashMap < Integer , Integer > ( ) ;
    for ( int _r : rlist ) {
      if ( rcounter . containsKey ( _r ) ) rcounter . put ( _r , 1 ) ;
      else rcounter . put ( _r , 1 ) ;
    }
    HashMap < Integer , Integer > ccounter = new HashMap < Integer , Integer > ( ) ;
    for ( int _c : clist ) {
      if ( ccounter . containsKey ( _c ) ) ccounter . put ( _c , 1 ) ;
      else ccounter . put ( _c , 1 ) ;
    }
    sumk = 0 ;
    for ( int _r = 0 ;
    _r < n ;
    _r ++ ) {
      int _c = rclist [ _r ] ;
      if ( rlist [ _r ] + clist [ _c ] == k ) sumk -- ;
      else if ( rlist [ _r ] + clist [ _c ] == k + 1 ) sumk ++ ;
    }
    System . out . println ( sumk ) ;
  }
  