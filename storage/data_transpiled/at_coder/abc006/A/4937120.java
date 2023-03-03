public static boolean isPrime ( ) {
  boolean ans ;
  N = input . nextDouble ( ) ;
  for ( int i = 0 ;
  i < N . length ;
  i ++ ) {
    if ( N [ i ] == 3 ) ans = true ;
    else if ( Integer . parseInt ( N ) % 3 == 0 ) ans = true ;
    else ans = false ;
  }
  if ( ans == true ) System . out . println ( "YES" ) ;
  else System . out . println ( "NO" ) ;
  return ans ;
}
