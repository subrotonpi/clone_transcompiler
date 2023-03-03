private static final Scanner IL = new Scanner ( System . in ) {
  @ Override public List < Integer > next ( ) {
    return Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  @ Override public List < Integer > SL ( ) {
    return input . nextLine ( ) . split ( " " ) ;
  }
  @ Override public Integer next ( ) {
    return Integer . parseInt ( input . nextLine ( ) ) ;
  }
  @ Override public List < Integer > S ( ) {
    return Collections . singletonList ( input . nextLine ( ) ) ;
  }
}
