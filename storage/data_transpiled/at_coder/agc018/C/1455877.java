@ SafeVarargs public static void heapify ( String ... strings ) {
  int X = Integer . parseInt ( input ( strings ) ) ;
  int Y = Integer . parseInt ( input ( strings ) ) ;
  int Z = Integer . parseInt ( input ( strings ) ) ;
  int N = X + Y + Z ;
  A = new int [ N ] ;
  q1 = new int [ N ] ;
  q2 = new int [ N ] ;
  L = new int [ N ] ;
  R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( strings ) ) ;
  Collections . sort ( A , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer a , Integer b ) {
      return a - b ;
    }
  }
  ) ;
}
