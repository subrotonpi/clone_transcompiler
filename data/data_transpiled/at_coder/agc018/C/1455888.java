@ SafeVarargs public static void heapify ( String ... strings ) {
  int X = Integer . parseInt ( input ( strings ) ) ;
  int Y = Integer . parseInt ( input ( strings ) ) ;
  int Z = Integer . parseInt ( input ( strings ) ) ;
  int N = X + Y + Z ;
  A = new int [ N ] ;
  p = new int [ N ] ;
  q = new int [ N ] ;
  L = new int [ N ] ;
  R = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ( strings ) ) ;
  Arrays . sort ( A , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer a , Integer b ) {
      return a - b ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) L [ i ] = L [ i ] + A [ i ] ;
  heapify ( p , i , A [ i ] - 1 , q ) ;
  L [ i ] = R [ i ] = 0 ;
  R [ i ] = 0 ;
}
