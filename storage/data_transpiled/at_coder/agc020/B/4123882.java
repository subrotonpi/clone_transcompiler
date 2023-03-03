public static int getK ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int nowm = 2 ;
  int nowM = 2 ;
  int ans = 0 ;
  for ( int i = K - 1 ;
  i >= 0 ;
  i -- ) {
    int a = A [ i ] ;
    if ( nowm <= ( ( nowm + a - 1 ) / a ) * a && ( ( nowm + a - 1 ) / a ) * a <= nowM ) {
      nowm = ( ( nowm + a - 1 ) / a ) * a ;
      nowM = ( nowM / a ) * a + a - 1 ;
    }
    else {
      ans = - 1 ;
      break ;
    }
  }
  if ( ans == - 1 ) System . out . println ( - 1 ) ;
  else System . out . println ( nowm + " " + nowM ) ;
  return ans ;
}
