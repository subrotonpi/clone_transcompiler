static final int [ ] getDivisor ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int X = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > x = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x . add ( Math . abs ( X - i ) ) ;
  }
  x . sort ( ) ;
  final int dif [ ] = new int [ N ] ;
  dif [ N ] = x . toArray ( ) ;
  int d_min = dif [ N ] ;
  int gcd = d_min ;
  for ( int i = 0 ;
  i < dif . length ;
  i ++ ) {
    dif [ i ] = Math . abs ( X - i ) ;
  }
  return dif ;
}
