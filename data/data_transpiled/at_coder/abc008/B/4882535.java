static final int N = Integer . parseInt ( input ) {
  int [ ] S = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . nextInt ( ) ;
  }
  Counter c = new Counter ( S ) ;
  System . out . println ( c . getMostSignificantBits ( ) [ 0 ] [ 0 ] ) ;
}
