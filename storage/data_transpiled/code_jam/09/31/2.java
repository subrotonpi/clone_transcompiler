static final int T = Integer . parseInt ( readLine ( ) ) ;
for ( int t = 0 ;
t < T ;
t ++ ) {
  char [ ] c = readLine ( ) . toCharArray ( ) ;
  Map < Character , Integer > map = new HashMap < > ( ) ;
  for ( char x : c ) {
    map . put ( x , 1 ) ;
  }
  int b = Math . max ( 2 , Collections . reverseMap ( ) ) ;
  int n = 0 ;
  int r = 0 ;
  for ( char x : c ) {
    if ( ! x . equals ( "" ) ) {
      while ( map . values ( ) . containsKey ( n ) ) {
        n = n + 1 ;
      }
      map . put ( x , n ) ;
      n = n + 1 ;
    }
    r = b * r + map . get ( x ) ;
  }
  System . out . println ( "Case #" + ( t + 1 ) + ":" + r ) ;
}
