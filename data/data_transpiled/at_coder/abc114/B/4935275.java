public static int [ ] S ( ) {
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length - 2 ;
  i ++ ) {
    int dog_cup = 100 * S [ i ] + 10 * S [ i + 1 ] + S [ i + 2 ] ;
    if ( Math . abs ( 753 - ans ) > Math . abs ( 753 ) ) {
      ans = dog_cup ;
    }
  }
  return ans ;
}
