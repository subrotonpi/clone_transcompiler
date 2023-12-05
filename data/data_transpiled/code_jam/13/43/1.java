public static String reader ( final Greeter inFile ) {
  final int dummy = inFile . getInt ( ) ;
  return ( new Greeter ( inFile . getInts ( ) , inFile . getInts ( ) ) ) ;
}
