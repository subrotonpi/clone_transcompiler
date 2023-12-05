public static void main ( int tc ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int s = 1 ;
  int x = N ;
  int lc = 1 ;
  int sc = 0 ;
  while ( K > s ) {
    if ( x % 2 == 0 ) {
      lc = lc ;
      sc = lc + 2 * sc ;
    }
    else {
      lc = 2 * lc + sc ;
      sc = sc ;
    }
    x = x / 2 ;
    K = K - s ;
    s = s * 2 ;
  }
  x = K <= lc ? x : x - 1 ;
  if ( x % 2 == 0 ) System . out . println ( "Case #" + ( tc + 1 ) + ": " + x / 2 + " " + ( x / 2 - 1 ) ) ;
  else System . out . println ( "Case #" + ( tc + 1 ) + ": " + x / 2 + " " + ( x / 2 ) ) ;
}
