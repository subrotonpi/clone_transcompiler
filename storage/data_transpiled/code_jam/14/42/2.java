@ Function public static Function < Integer , List < Integer >> get ( ) {
  return map ( Integer :: parseInt , input -> {
    Map < Integer , Integer > cache = Maps . newHashMap ( ) ;
    return cache . get ( input ) ;
  }
  ) ;
}
