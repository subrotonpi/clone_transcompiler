public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] cc = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    cc [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < cc . length ;
  i ++ ) {
    int c = cc [ i ] ;
    if ( n <= a ) {
      n += b ;
    }
    if ( n < c ) {
      System . out . println ( i + 1 ) ;
      return ;
    }
    n -= c ;
  }
  System . out . println ( "complete" ) ;
}
