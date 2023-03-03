public static int f1ac ( int [ ] [ ] cards , int n , int m ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( "1actest1.txt" ) ) ;
  int numCases = readInteger ( ) ;
  for ( int iter = 0 ;
  iter < numCases ;
  iter ++ ) {
    List < List < Integer >> cards = new ArrayList < > ( ) ;
    int n = readInteger ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      cards = cards . add ( asList ( Integer . parseInt ( in . readLine ( ) ) ) ) ;
    }
    int m = readInteger ( ) ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      cards = cards . add ( asList ( Integer . parseInt ( in . readLine ( ) ) ) ) ;
    }
    int s = f1ac ( cards , n , m ) ;
    System . out . println ( "Case #" + ( iter + 1 ) + ": " + s ) ;
  }
  {
    int score = 0 ;
    boolean [ ] [ ] hand = new boolean [ n + m ] [ m ] ;
    int turns = 1 ;
    int i = 0 ;
    while ( i < n ) {
      if ( hand [ i ++ ] && cards [ i ] [ 2 ] > 0 ) {
        hand [ i ++ ] = false ;
        score = score + cards [ i ] [ 1 ] ;
        n = n + cards [ i ] [ 0 ] ;
        turns = turns + cards [ i ] [ 2 ] - 1 ;
      }
    }
    System . out . println ( hand ) ;
    System . out . println ( turns ) ;
  }
  return score ;
}
