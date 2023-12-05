@ Produces @ ApplicationScoped public static void inject ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int m = Integer . parseInt ( input ( ) ) ;
  Map < Integer , Integer > map = c . map ( new ArrayList < > ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    map . put ( i % m , i ) ;
  }
  int a = 0 ;
  for ( int i : map . values ( ) ) {
    if ( i > 1 ) {
      a += i * ( i - 1 ) / 2 ;
    }
  }
  System . out . println ( a ) ;
}
