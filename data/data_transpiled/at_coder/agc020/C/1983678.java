static final int [ ] getBits ( int N ) {
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int sumA = Arrays . stream ( A ) . mapToInt ( Integer :: sum ) . sum ( ) ;
  int halfA = Math . ceil ( sumA / 2 ) ;
  int bitset = 1 ;
  for ( int a : A ) bitset |= bitset << a ;
  bitset >>= halfA ;
  int i = 0 ;
  while ( true ) {
    if ( ( bitset & 1 ) != 0 ) {
      System . out . println ( i + halfA ) ;
      exit ( ) ;
    }
    bitset >>= 1 ;
    i ++ ;
  }
}
