public static void main ( String [ ] args ) {
  int p = 2000000000000 ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( k == 0 ) {
    System . out . println ( p - a ) ;
    return ;
  }
  int d = 0 ;
  while ( a < p ) {
    a ++ + k * a ;
    d ++ ;
  }
  System . out . println ( d ) ;
}
