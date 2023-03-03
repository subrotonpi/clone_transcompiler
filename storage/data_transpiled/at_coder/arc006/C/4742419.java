public static int [ ] readAllWords ( ) {
  N = Integer . parseInt ( input ( ) ) ;
  int [ ] w = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) w [ i ] = Integer . parseInt ( input ( ) ) ;
  ans = 1 ;
  ArrayList < Integer > p = new ArrayList < > ( ) ;
  p . add ( w [ 0 ] ) ;
  return p . toArray ( ) ;
}
