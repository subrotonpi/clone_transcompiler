public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int count = 1 ;
  int l = 0 ;
  int r = 1 ;
  int x = A [ 0 ] ;
  int s = A [ 0 ] ;
  while ( r < N ) {
    s += A [ r ] ;
    x ^= A [ r ] ;
    while ( s != x ) {
      s -= A [ l ] ;
      x ^= A [ l ] ;
      l ++ ;
    }
    r ++ ;
    count += r - l ;
  }
  System . out . println ( count ) ;
}
