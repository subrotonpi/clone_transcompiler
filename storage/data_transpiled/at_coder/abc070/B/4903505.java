public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  if ( Math . min ( b , d ) - Math . max ( a , c ) >= 0 ) {
    ans = Math . min ( b , d ) - Math . max ( a , c ) ;
  }
  return ans ;
}
