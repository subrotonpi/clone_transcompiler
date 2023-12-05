public static int n = Integer . parseInt ( input ) {
  int [ ] hoge = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < hoge . length ;
  i ++ ) {
    hoge [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int huga = hoge [ i ] % 6 ;
    if ( ( huga == 1 ) || ( huga == 3 ) ) {
      ans += 0 ;
    }
    else if ( ( huga == 2 ) || ( huga == 4 ) ) {
      ans += 1 ;
    }
    else if ( ( huga == 5 ) ) {
      ans += 2 ;
    }
    else {
      ans += 3 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
