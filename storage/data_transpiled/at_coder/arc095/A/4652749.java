public static void print ( int N ) {
  int [ ] X = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( X ) ;
  Arrays . sort ( X ) ;
  int [ ] Y = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Y [ i ] = X [ i ] ;
  }
  int a1 = Y [ N / 2 - 1 ] ;
  int a2 = Y [ N / 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( X [ i ] <= a1 ) {
      print ( a2 ) ;
    }
    else {
      print ( a1 ) ;
    }
  }
}
