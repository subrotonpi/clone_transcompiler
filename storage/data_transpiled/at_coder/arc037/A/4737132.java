static void print ( ) {
  final String input = System . console ( ) . readLine ( ) ;
  final int n = Integer . parseInt ( input ) ;
  final int m = Integer . parseInt ( input ) ;
  int res = 0 ;
  for ( int e : m ) {
    if ( e >= 80 ) continue ;
    res += 80 - e ;
  }
  System . out . println ( res ) ;
}
