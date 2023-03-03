public static int [ ] getDigits ( ) {
  int A , B ;
  int [ ] c = new int [ 4 ] ;
  c [ 0 ] = A % 4 / 2 ^ ( B + 1 ) % 4 / 2 ;
  int keta = 2 ;
  while ( ( B = getDigits ( ) ) / keta != 0 ) {
    int a ;
    int b ;
    if ( A / keta % 2 == 0 ) {
      a = 0 ;
    }
    else {
      a = A % keta ;
    }
    if ( B / keta % 2 == 0 ) {
      b = 0 ;
    }
    else {
      b = B % keta ;
      b ++ ;
    }
    c [ i ] = ( b - a ) % 2 ;
    keta = keta << 1 ;
  }
  int ans = 0 ;
  for ( int i = c . length - 1 ;
  i >= 0 ;
  i -- ) {
    ans = ans << 1 ;
    ans ^= c [ i ] ;
  }
  System . out . println ( ans ) ;
  return c ;
}
