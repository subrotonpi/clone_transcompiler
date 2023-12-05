public static void print ( int n ) {
  List < Integer > box = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    box . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  Collections . sort ( box , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 . compareTo ( o2 ) ;
    }
  }
  ) ;
  final double INF = Double . POSITIVE_INFINITY ;
  final double [ ] ans = new double [ n + 10 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final double h = box . get ( i ) ;
    final double w = box . get ( i ) ;
    int left = - 1 ;
    int right = n ;
    while ( right - left > 1 ) {
      final int mid = ( left + right ) / 2 ;
      if ( h <= ans [ mid ] ) {
        right = mid ;
      }
      else {
        left = mid ;
      }
    }
    ans [ right ] = h ;
  }
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( ans [ i ] == INF ) {
      break ;
    }
    count ++ ;
  }
  System . out . println ( count ) ;
}
