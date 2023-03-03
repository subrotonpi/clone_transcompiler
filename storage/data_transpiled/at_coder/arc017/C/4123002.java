public static Integer iipt = new Integer ( input . nextInt ( ) ) {
  @ Override public int intValue ( ) {
    return Integer . parseInt ( input . nextInt ( ) ) ;
  }
  @ Override public List < Integer > miipt ( ) {
    return Collections . singletonList ( Integer . parseInt ( input . nextInt ( ) ) ) ;
  }
}
