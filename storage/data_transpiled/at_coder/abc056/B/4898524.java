public static int w ( int a , int b ) {
  int ans ;
  ans = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b > a ) ans = b - a - w ;
  else ans = a - b - w ;
  if ( ans < 0 ) System . out . println ( 0 ) ;
  else System . out . println ( ans ) ;
  return ans ;
}
