@ Function public static int [ ] inpl ( ) {
  return FluentIterable . from ( input -> Integer . parseInt ( input . nextLine ( ) ) ) . filter ( Integer :: nonNull ) . toArray ( ) ;
}
