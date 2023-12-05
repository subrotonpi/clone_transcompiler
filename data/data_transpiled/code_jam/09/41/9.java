static final Scanner in = new Scanner ( System . in ) {
  private final boolean useStdIn = true ;
  private final String input = "Enter a number of characters to display: " ;
  private final Scanner scanner = new Scanner ( System . in ) ;
  private void dbg ( String a ) {
    System . err . print ( a . toString ( ) ) ;
  }
  public int readInt ( ) {
    return scanner . nextInt ( ) ;
  }
  public float readFloat ( ) {
    return scanner . nextDouble ( ) ;
  }
  public List < String > readArray ( int N , Function < String , String > foo ) {
    return Arrays . asList ( foo . apply ( ) ) ;
  }
  public List < String > readLineArray ( Function < String , String > foo ) {
    return map ( foo , input . split ( " " ) ) ;
  }
  public int dig ( char c ) {
    int n = scanner . nextInt ( ) ;
    String [ ] a = readArray ( n , scanner ) ;
    int [ ] maxpos = new int [ n ] ;
    boolean [ ] used = new boolean [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( ( a [ i ] . charAt ( j ) == '1' ) && ( a [ j ] . charAt ( i ) == '-' ) ) {
          maxpos [ i ] = j ;
        }
      }
    }
    int res = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( ( maxpos [ j ] > i ) && ( a [ j ] . charAt ( i ) == '-' ) ) continue ;
        for ( int k = j ;
        k > i ;
        k -- ) {
          ( used [ k ] ) ;
          res ++ ;
        }
        break ;
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + Integer . toString ( res ) ) ;
  }
}
