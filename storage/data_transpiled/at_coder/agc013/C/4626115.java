public static int [ ] readIntArrayInRange ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int L = Integer . parseInt ( input ) ;
  int T = Integer . parseInt ( input ) ;
  int [ ] X = new int [ N ] ;
  int [ ] W = new int [ N ] ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    X [ n ] = Integer . parseInt ( input ) ;
    W [ n ] = Integer . parseInt ( input ) ;
  }
  int index = 0 ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    X [ n ] += ( ( - 1 ) * ( W [ n ] + 1 ) ) * T ;
    index += X [ n ] / L ;
    X [ n ] %= L ;
  }
  index %= N ;
  Arrays . sort ( X ) ;
  int [ ] result = Arrays . copyOf ( X , index ) ;
  System . arraycopy ( result , 0 , result , index , N ) ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    System . out . println ( result [ n ] ) ;
  }
  return result ;
}
