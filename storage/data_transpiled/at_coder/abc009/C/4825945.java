@ VisibleForTesting static String readString ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < String > S = Lists . newArrayList ( ) ;
  Collections . sort ( S ) ;
  String T = "" ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < S . size ( ) ;
    j ++ ) {
      String s = S . get ( j ) ;
      Counter < String > counter = new Counter < String > ( S . subList ( T . length ( ) + 1 , j ) ) ;
      Counter < String > counterSort = new Counter < String > ( S_sort ) ;
      counterSort . increment ( s ) ;
      int dif = 0 + ( S . get ( T . length ( ) ) != s ) ;
      for ( int c : counter . keySet ( ) ) {
        if ( counter . getCount ( c ) - counterSort . getCount ( c ) > 0 ) dif += counter . getCount ( c ) - counterSort . getCount ( c ) ;
      }
      if ( dif + count <= k ) {
        if ( S . get ( T . length ( ) ) != s ) count ++ ;
        T += s ;
        S_sort . remove ( s ) ;
        break ;
      }
    }
  }
  System . out . println ( T ) ;
  return T ;
}
