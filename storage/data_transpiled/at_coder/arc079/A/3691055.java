@ VisibleForTesting static LinkedHashMap < Integer , Integer > Liner = new LinkedHashMap < Integer , Integer > ( ) {
  private final int [ ] inpl = new int [ ] {
  }
  ;
  @ Override public int size ( ) {
    return Arrays . stream ( input . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  }
}
