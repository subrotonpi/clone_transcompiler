static final Scanner stdin = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . parseInt ( stdin . nextLine ( ) ) ;
  }
  @ Override public int [ ] li_ ( ) {
    return map ( Integer . parseInt ( stdin . nextLine ( ) ) - 1 ) ;
  }
  @ Override public float lf ( ) {
    return Float . parseFloat ( stdin . nextLine ( ) ) ;
  }
  @ Override public String [ ] ls ( ) {
    return stdin . nextLine ( ) . split ( " " ) ;
  }
  @ Override public String [ ] ns ( ) {
    return stdin . nextLine ( ) . replaceAll ( "\\s+" , " " ) ;
  }
  @ Override public List < String > lc ( ) {
    return Collections . singletonList ( ns [ 0 ] ) ;
  }
  @ Override public int ni ( ) {
    return Integer . parseInt ( stdin . nextLine ( ) ) ;
  }
  @ Override public float nf ( ) {
    return Float . parseFloat ( stdin . nextLine ( ) ) ;
  }
}
