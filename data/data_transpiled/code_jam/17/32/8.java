private static int [ ] ints ( ) {
  return Arrays . stream ( new Scanner ( System . in ) . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
}
