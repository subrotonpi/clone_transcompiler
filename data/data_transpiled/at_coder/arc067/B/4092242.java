public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int xn = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    res += Math . min ( b , ( xn - i - 1 ) * a ) ;
  }
  System . out . println ( res ) ;
}
