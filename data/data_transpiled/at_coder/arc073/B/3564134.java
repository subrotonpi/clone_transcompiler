public static int [ ] inpl ( ) {
  return Arrays . stream ( input . readLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
}
