public static int solve ( int n , int m ) {
  return ( 100 * n + 1800 * m ) * ( 2 * m ) ;
  /* main method */
  String n = input . nextLine ( ) ;
  String m = input . nextLine ( ) ;
  n = Integer . parseInt ( n ) ;
  m = Integer . parseInt ( m ) ;
  System . out . println ( solve ( n , m ) ) ;
  if ( getClass ( ) . equals ( String . class ) ) {
    System . out . println ( "" ) ;
  }
  return 0 ;
}
