public static int [ ] getDigits ( ) {
  int [ ] n = new int [ 3 ] ;
  for ( int i = 0 ;
  i < n . length ;
  i ++ ) {
    n [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( n ) ;
  if ( ( n [ 1 ] - n [ 0 ] ) % 2 == 1 ) {
    int ans = 1 ;
  }
  else {
    ans = 0 ;
  }
  ans += n [ 2 ] - ( n [ 0 ] + n [ 1 ] ) / 2 ;
  return ans ;
}
