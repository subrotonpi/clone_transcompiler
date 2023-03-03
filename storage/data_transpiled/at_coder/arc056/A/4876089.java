public static void main ( String [ ] args ) {
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int k = Integer . parseInt ( input ( ) ) ;
  int l = Integer . parseInt ( input ( ) ) ;
  int res = Math . min ( a * k , b * ( ( k - 1 ) / l + 1 ) , b * ( k / l ) + a * ( k % l ) ) ;
  System . out . println ( res ) ;
}
