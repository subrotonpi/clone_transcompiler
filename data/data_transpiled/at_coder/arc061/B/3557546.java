@ Function public static LinkedHashMap < Point , Integer > inpl ( ) {
  return Arrays . stream ( input . split ( " " ) ) . collect ( Collectors . toMap ( i -> i , i -> i ) ) ;
}
