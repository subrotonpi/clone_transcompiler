@ Nonnull public static < T > String reader ( @ Nonnull final T inFile ) {
  final int P = inFile . getInt ( ) ;
  final int [ ] Es = inFile . getInts ( ) ;
  final int [ ] Fs = inFile . getInts ( ) ;
  return ( P < 0 ) ? null : ( P > 0 ) ? null : ( P < 0 ) ? "" : ( P > 0 ) ? "" : "" ;
}
