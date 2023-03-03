public static void print ( int N ) {
  int [ ] A = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( A ) ;
  int [ ] Flavor = new int [ Math . max ( A . length + 1 , N ) ] ;
  for ( int i = 0 ;
  i < Flavor . length ;
  i ++ ) {
    Flavor [ i ] = 0 ;
  }
  int ans = 1 ;
  int right = 0 ;
  for ( int left = 0 ;
  left < N ;
  left ++ ) {
    while ( right < N && Flavor [ A [ right ] ] == 0 ) {
      Flavor [ A [ right ] ] ++ ;
      right ++ ;
    }
    ans = Math . max ( ans , right - left ) ;
    if ( left == right ) right ++ ;
    else Flavor [ A [ left ] ] -- ;
  }
  System . out . println ( ans ) ;
}
