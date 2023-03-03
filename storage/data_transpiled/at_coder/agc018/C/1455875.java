@ SafeVarargs public static void heapify ( String ... strings ) {
  int X = Integer . parseInt ( input ( strings ) ) ;
  int Y = Integer . parseInt ( input ( strings ) ) ;
  int Z = Integer . parseInt ( input ( strings ) ) ;
  int N = X + Y + Z ;
  int [ ] A = new int [ N ] ;
  int [ ] q1 = new int [ N ] ;
  int [ ] q2 = new int [ N ] ;
  int L = new int [ N ] ;
  int R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( strings ) ) ;
  Arrays . sort ( A , new Comparator < Integer > ( ) {
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = L [ i ] + A [ i ] ;
  System . out . println ( max ( L [ i ] + R [ N - i ] ) ) ;
}
