@ VisibleForTesting static void calc ( Scanner input ) {
  int n = input . nextInt ( ) ;
  int m = input . nextInt ( ) ;
  int d = input . nextInt ( ) ;
  Map < Integer , Integer > amd = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    amd . put ( i , amd . get ( i + 1 ) ) ;
  }
  Map < Integer , Integer > cv = new HashMap < > ( ) ;
  for ( Map . Entry < Integer , Integer > entry : amd . entrySet ( ) ) {
    ans . put ( entry . getKey ( ) , entry . getValue ( ) ) ;
  }
  cv . clear ( ) ;
  d >>= 1 ;
}
