static private < T > T getNext ( Generator < T > gen , Class < T > type ) {
  try {
    String l = gen . next ( ) . trim ( ) ;
    return type . cast ( l . trim ( ) ) ;
  }
  catch ( IOException e ) {
    return null ;
  }
}
