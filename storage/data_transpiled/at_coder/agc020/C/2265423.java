public static int N ( ) {
  int [ ] A = new int [ N ] ;
  for ( String s : input . split ( " " ) ) {
    A [ s . length ( ) ] = Integer . parseInt ( s ) ;
  }
  int bits = 1 ;
  for ( int b : A ) {
    bits |= bits << b ;
  }
  int ans = Integer . parseInt ( A [ 0 ] ) ;
  ans = ( ans + 1 ) / 2 ;
  bits >>= ans ;
  do {
    if ( bits & 1 == 1 ) {
      break ;
    }
    else {
      bits >>= 1 ;
      ans ++ ;
    }
  }
  while ( bits != 0 ) ;
  return ans ;
}
