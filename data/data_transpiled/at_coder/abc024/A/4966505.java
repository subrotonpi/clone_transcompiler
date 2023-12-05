public static void a ( int a , int b , int c , int k ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int total = s + t ;
  int discount = 0 ;
  if ( total >= k ) {
    discount = total * c ;
  }
  int adm = ( s * a ) + ( t * b ) ;
  System . out . println ( adm - discount ) ;
}
