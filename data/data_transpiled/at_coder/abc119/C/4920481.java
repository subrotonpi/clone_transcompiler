public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  System . out . println ( solve ( a , b , c , l ) ) ;
}
