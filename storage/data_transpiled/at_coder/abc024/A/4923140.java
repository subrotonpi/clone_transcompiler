public static void a ( int a , int b , int c , int k ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans ;
  if ( s + t < k ) {
    ans = a * s + b * t ;
  }
  else {
    ans = a * s + b * t - ( s + t ) * c ;
  }
  System . out . println ( ans ) ;
}
