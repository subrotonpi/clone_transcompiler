static private final Scanner readValues = new Scanner ( System . in ) {
  @ Override public int next ( ) {
    return Integer . parseInt ( readLine ( ) ) ;
  }
  @ Override public void close ( ) {
    System . err . print ( Integer . toString ( caseIndex ) + ' ' ) ;
    int n = input . nextInt ( ) ;
    int [ ] t = new int [ n ] ;
    Arrays . sort ( t ) ;
  }
}
