public static int convert ( String input ) {
  int N = Integer . parseInt ( input ) , T = Integer . parseInt ( input ) ;
  String [ ] L = input . split ( " " ) ;
  List < String > M = Lists . newArrayList ( ) ;
  for ( String s : L ) {
    M . add ( s ) ;
  }
  int ans = 0 ;
  int c = 0 ;
  int k = 0 ;
  while ( c < N ) {
    if ( M . get ( c ) + T >= M . get ( c + 1 ) ) {
      c ++ ;
      k ++ ;
    }
    else {
      if ( k == 0 ) {
        ans += T ;
        c ++ ;
      }
      else {
        ans += T + M . get ( c ) - M . get ( c - k ) ;
        c ++ ;
        k = 0 ;
      }
    }
  }
  ans += T + M . get ( c ) - M . get ( c - k ) ;
  System . out . println ( ans ) ;
  return ans ;
}
