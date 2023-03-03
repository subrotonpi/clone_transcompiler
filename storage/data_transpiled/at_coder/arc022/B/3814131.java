public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  int [ ] s = new int [ max ( A ) + 1 ] ;
  int l = 0 , r = 0 ;
  int maxNum = 0 ;
  while ( r < N ) {
    if ( s [ A [ r ] ] == 0 ) {
      s [ A [ r ] ] = 1 ;
      r ++ ;
    }
    else {
      s [ A [ l ] ] -- ;
      l ++ ;
    }
    maxNum = Math . max ( maxNum , r - l ) ;
  }
  System . out . println ( maxNum ) ;
}
