public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input ) ;
  }
  int [ ] bf = new int [ 10 * 5 + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) bf [ A [ i ] ] = - 1 ;
  int bfn = 0 ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( bf [ A [ i ] ] == - 1 ) {
      bf [ A [ i ] ] = i ;
      ans = Math . max ( ans , i - bfn + 1 ) ;
    }
    else {
      if ( ( bfn = bf [ A [ i ] ] ) == 0 ) {
        ans = Math . max ( ans , i - bfn + 1 ) ;
        bf [ A [ i ] ] = i ;
      }
      else if ( bfn == bf [ A [ i ] ] ) {
        ans = Math . max ( ans , i - bfn ) ;
        bfn = bf [ A [ i ] ] + 1 ;
        bf [ A [ i ] ] = i ;
      }
      else {
        ans = Math . max ( ans , i - bf [ A [ i ] ] ) ;
        bfn = bf [ A [ i ] ] + 1 ;
        bf [ A [ i ] ] = i ;
      }
    }
  }
  System . out . println ( ans ) ;
}
