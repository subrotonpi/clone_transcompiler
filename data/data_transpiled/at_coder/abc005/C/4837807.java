public static String print ( String input ) {
  int t = Integer . parseInt ( input ) ;
  int n = Integer . parseInt ( input ) ;
  List < Integer > ts = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ts . add ( Integer . parseInt ( input ) ) ;
  }
  int m = Integer . parseInt ( input ) ;
  List < Integer > cs = Lists . newArrayList ( ) ;
  String ans = "no" ;
  if ( n >= m ) {
    int count = 0 ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      int customer = cs . get ( count ) ;
      if ( i <= customer && customer <= i + t ) {
        count ++ ;
      }
      if ( count == m ) {
        ans = "yes" ;
        break ;
      }
    }
  }
  return ans ;
}
