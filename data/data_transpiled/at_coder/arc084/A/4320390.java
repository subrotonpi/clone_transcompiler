static final int [ ] binarySearch ( int N ) {
  int J = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  int L = Integer . parseInt ( input ( ) ) ;
  Arrays . sort ( J ) ;
  Arrays . sort ( K ) ;
  Arrays . sort ( L ) ;
  int S = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int k = binarySearch ( J , K ) ;
    int l = N - binarySearch ( L , K ) ;
    S += k * l ;
  }
  System . out . println ( S ) ;
}
