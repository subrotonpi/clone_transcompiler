public static String a , int b , int c ) {
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  a = a % b ;
  int t = a ;
  String ans = "NO" ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    t += a ;
    if ( ( t % b ) == c ) {
      ans = "YES" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
