public static void print ( int N ) {
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int w = Integer . parseInt ( input . nextLine ( ) ) ;
    int h = Integer . parseInt ( input . nextLine ( ) ) ;
    S [ i ] = new int [ w ] ;
    S [ i ] [ h ] = i ;
  }
  Arrays . sort ( S , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer i1 , Integer i2 ) {
      return i1 . compareTo ( i2 ) ;
    }
  }
  ) ;
  final int [ ] DP = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int wi = S [ i ] ;
    int hi = S [ i ] ;
    int idx = Math . min ( wi , hi ) ;
    if ( DP . length == idx ) DP [ i ] = wi ;
  }
}
