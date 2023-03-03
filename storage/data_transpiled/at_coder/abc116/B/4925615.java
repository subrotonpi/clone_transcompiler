public static void main ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new ArrayList < Integer > ( ) ;
  while ( ! a . contains ( n ) ) {
    a . add ( n ) ;
    if ( n % 2 == 0 ) n = n / 2 ;
    else n = 3 * n + 1 ;
  }
  System . out . println ( a . size ( ) + 1 ) ;
}
