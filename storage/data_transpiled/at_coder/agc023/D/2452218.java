@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static int readInteger ( ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final int [ ] [ ] X = new int [ N ] [ N ] ;
  final int [ ] [ ] P = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = input . nextInt ( ) ;
    P [ i ] = input . nextInt ( ) ;
  }
  return N ;
}
