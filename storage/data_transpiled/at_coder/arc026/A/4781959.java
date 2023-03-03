public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int a = Integer . parseInt ( input ( ) ) ;
  int b = Integer . parseInt ( input ( ) ) ;
  int nb = Math . min ( n , 5 ) ;
  int na = n - nb ;
  int r = b * nb + a * na ;
  System . out . println ( r ) ;
}
