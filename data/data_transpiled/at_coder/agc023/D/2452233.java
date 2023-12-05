@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > void main ( String [ ] args ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final int [ ] X = new int [ N ] ;
  final int [ ] P = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = input . nextInt ( ) ;
    P [ i ] = input . nextInt ( ) ;
  }
  System . out . println ( "Read " + N + " times" ) ;
  final int [ ] readIntN = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  System . out . println ( "Read " + N + " times" ) ;
  final int [ ] readStr = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = readStr [ i ] ;
  }
  System . out . println ( "Read " + N + " times" ) ;
  final long s = System . currentTimeMillis ( ) ;
  final long ret = System . currentTimeMillis ( ) ;
  final long e = System . currentTimeMillis ( ) ;
  System . err . println ( e - s + " sec" ) ;
  System . out . println ( ret ) ;
}
