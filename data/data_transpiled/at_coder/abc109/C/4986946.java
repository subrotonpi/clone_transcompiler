public static final int [ ] getDiamondParts ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > xs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xs . add ( X ) ;
  Collections . sort ( xs ) ;
  int [ ] dif = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) dif [ i ] = xs . get ( i + 1 ) - xs . get ( i ) ;
  if ( dif . length > 1 ) {
    int ans = MathUtils . gcd ( dif [ 0 ] , dif [ 1 ] ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) ans = MathUtils . gcd ( ans , dif [ i ] ) ;
    System . out . println ( ans ) ;
  }
  else {
    System . out . println ( dif [ 0 ] ) ;
  }
  return dif ;
}
