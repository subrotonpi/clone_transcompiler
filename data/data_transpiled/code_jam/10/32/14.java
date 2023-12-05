@ Function public static int readInt = new Scanner ( System . in ) {
  @ Override public int nextInt ( ) {
    return Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
  }
  @ Override public List < Integer > readInts ( ) {
    return Arrays . asList ( in . nextLine ( ) . split ( " " ) ) ;
  }
  @ Override public Stream < Integer > countTo ( int n ) {
    return Stream . of ( 1 , n + 1 ) ;
  }
  @ Override public void solve ( ) {
    int numCases = readInt ( ) ;
    for ( int i : countTo ( numCases ) ) {
      System . out . println ( "Case #" + i + ":" ) ;
      solve ( ) ;
    }
  }
}
