static final int tcs = Integer . parseInt ( input . nextLine ( ) ) ;
for ( int tc = 1 ;
tc <= tcs ;
tc ++ ) {
  int a = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int n = ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > ss = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ss . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int res = ss . size ( ) ;
  if ( a > 1 ) {
    int tmp = 0 ;
    for ( int i = 0 ;
    i < ss . size ( ) ;
    i ++ ) {
      int s = ss . get ( i ) ;
      while ( a <= s ) {
        tmp ++ ;
        a += a - 1 ;
      }
      a += s ;
      res = Math . min ( res , tmp + ss . size ( ) - 1 - i ) ;
    }
  }
  System . out . println ( "Case #" + tc + ": " + res ) ;
}
