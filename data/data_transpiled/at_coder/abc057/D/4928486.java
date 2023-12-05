static final String getUsage ( ) {
  try {
    Class < ? > c = Class . forName ( "com.google.common.collect.Lists" ) ;
    Method m = c . getMethod ( "list" ) ;
    int N = Integer . parseInt ( c . getName ( ) ) ;
    int A = Integer . parseInt ( c . getName ( ) ) ;
    int B = Integer . parseInt ( c . getName ( ) ) ;
    List < Integer > V = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      V . add ( Integer . parseInt ( c . getName ( ) ) ) ;
    }
    Collections . sort ( V , new Comparator < Integer > ( ) {
      public int compare ( Integer o1 , Integer o2 ) {
        return - o1 ;
      }
    }
    ) ;
    double mGave = sum ( V , 0 , A ) / A ;
    int b = A ;
    while ( b < B ) {
      if ( V . get ( 0 ) == V . get ( b ) ) {
        b ++ ;
      }
      else {
        break ;
      }
    }
    if ( A == b ) {
      double ans = 1 ;
      Map < Integer , Integer > c = c . getHashMap ( ) ;
      Map < Integer , Integer > map = c . getHashMap ( ) ;
      for ( Integer key : c . keySet ( ) ) {
        int n = map . get ( key ) ;
        int r = c . get ( key ) ;
        ans *= m ( n , r , true ) ;
      }
    }
    else {
      Map < Integer , Integer > map = c . getHashMap ( ) ;
      Integer key = V . get ( 0 ) ;
      int n = map . get ( key ) ;
      double ans = 0 ;
      for ( int r = A ;
      r <= b ;
      r ++ ) {
        ans += m ( n , r , true ) ;
      }
    }
    System . out . println ( mGave ) ;
    System . out . println ( ans ) ;
  }
  catch ( Exception e ) {
    e . printStackTrace ( ) ;
  }
  return null ;
}
