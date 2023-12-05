public static int solve ( int n , int l , LinkedList < Integer > list ) {
  int ans = 0 ;
  int np = 1 ;
  while ( list . size ( ) > 0 ) {
    int x = list . get ( 0 ) ;
    int d = list . get ( 1 ) ;
    if ( d == 0 ) {
      ans += x - np ;
      np ++ ;
      list . removeLast ( ) ;
    }
    else break ;
  }
  np = l ;
  while ( list . size ( ) > 0 ) {
    int x = list . get ( list . size ( ) - 1 ) ;
    int d = list . get ( list . size ( ) - 1 ) ;
    if ( d == 1 ) {
      ans += np - x ;
      np -- ;
      list . removeLast ( ) ;
    }
    else break ;
  }
  while ( list . size ( ) > 0 ) {
    ArrayList < Integer > rlist = new ArrayList < Integer > ( ) ;
    ArrayList < Integer > llist = new ArrayList < Integer > ( ) ;
    while ( list . size ( ) > 0 ) {
      int x = list . get ( 0 ) ;
      int d = list . get ( 1 ) ;
      if ( d == 1 ) {
        rlist . add ( x ) ;
        list . removeLast ( ) ;
      }
      else break ;
    }
    while ( list . size ( ) > 0 ) {
      int x = list . get ( 0 ) ;
      int d = list . get ( 1 ) ;
      if ( d == 0 ) {
        llist . add ( x ) ;
        list . removeLast ( ) ;
      }
      else break ;
    }
    int rc = rlist . size ( ) ;
    int rx = rlist . get ( rlist . size ( ) - 1 ) ;
    int lc = llist . size ( ) ;
    int lx = llist . get ( 0 ) ;
    for ( int i = 0 ;
    i < rc ;
    i ++ ) {
      ans += rx - x - i ;
    }
    for ( int i = 0 ;
    i < lc ;
    i ++ ) {
      ans += x - lx - i ;
    }
    ans += ( lx - rx - 1 ) * Math . max ( rc , lc ) ;
  }
  return ans ;
}
