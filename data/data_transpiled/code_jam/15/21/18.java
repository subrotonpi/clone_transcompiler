public static int accr ( int k ) throws IOException {
  return 10 * ( ( k + 1 ) / 2 ) + 10 * ( ( k + 2 ) / 2 ) - 1 ;
  /* solve the number of digits */
  if ( k <= 10 ) return k ;
  int d = Integer . toString ( k ) . length ( ) ;
  int ans = 0 ;
  for ( int i : xrange ( d - 1 ) ) ans += accr ( i ) ;
  String S = Integer . toString ( k ) ;
  String head = S . substring ( 0 , d / 2 ) ;
  String tail = S . substring ( d / 2 ) ;
  if ( tail . indexOf ( '0' ) != tail . length ( ) ) {
    ans += Integer . parseInt ( head . substring ( 0 , d / 2 ) ) ;
    ans += Integer . parseInt ( tail ) ;
    if ( head . equals ( "1" + "0" * ( head . length ( ) - 1 ) ) ) ans -- ;
    /* else if (head.equals("1"+"0"*(head.length()-1))) return ans; */
    ans ++ ;
    int z = Integer . parseInt ( head ) ;
    if ( z < 3 ) ans -- ;
    else if ( ( z >= 10 && z < 12 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 2 + 2 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 3 + 2 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 4 + 2 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 5 + 2 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 6 + 2 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 7 + 2 ) ) ans -- ;
    else if ( ( z >= 10 * 10 && z < 10 * 10 * 8 + 2 ) ) ans -- ;
    int N = Integer . parseInt ( head ) - 1 ;
    head = Integer . toString ( head ) ;
    ans += Integer . parseInt ( head . substring ( 0 , d ) ) ;
    ans += N - Integer . parseInt ( head + "0" * tail . length ( ) ) - 1 ;
    return ans ;
  }
  fo . close ( ) ;
  