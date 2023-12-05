public static void input ( Scanner in ) {
  int inp1 [ ] = in . nextInt ( ) ;
  in . nextInt ( ) ;
  in . nextInt ( ) ;
  int [ ] testCase = new int [ inp1 ] ;
  for ( int i = 0 ;
  i <= inp1 [ 0 ] ;
  i ++ ) {
    testCase [ i ] = in . nextInt ( ) ;
  }
  Map < Integer , Integer > caselist = new HashMap < Integer , Integer > ( ) ;
  caselist . put ( testCase , 0 ) ;
  int listening = 0 ;
  int count = 0 ;
  while ( ( count < inp1 [ 1 ] ) && ( listening < inp1 [ 2 ] ) ) {
    int inp2 = in . nextInt ( ) ;
    caselist . put ( listening , caselist . get ( inp2 ) ) ;
    caselist . put ( inp2 , 0 ) ;
    listening = inp2 ;
    count ++ ;
  }
  Map < Integer , Integer > out = new HashMap < Integer , Integer > ( ) ;
  for ( Map . Entry < Integer , Integer > entry : caselist . entrySet ( ) ) {
    out . put ( entry . getValue ( ) , entry . getKey ( ) ) ;
  }
  for ( int x = 1 ;
  x <= inp1 [ 0 ] ;
  x ++ ) {
    System . out . println ( out . get ( x ) ) ;
  }
}
