public static int n = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Integer , Integer > c = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( c . containsKey ( a ) ) c . get ( a ) + = b ;
    else c . put ( a , b ) ;
  }
  for ( Map . Entry < Integer , Integer > e : new TreeMap < > ( c ) . entrySet ( ) ) {
    K -= e . getValue ( ) ;
    if ( K <= 0 ) System . out . println ( e . getKey ( ) ) ;
    exit ( ) ;
  }
  return K ;
}
