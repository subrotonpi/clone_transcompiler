@ NonNull public static LpProblem create ( @ NonNull String ... args ) throws IOException {
  BufferedReader in = new BufferedReader ( new FileReader ( "input.txt" ) ) ;
  PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "output1.txt" ) ) ) ;
  int Testcase = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int ti = 0 ;
  ti < Testcase ;
  ti ++ ) {
    LpProblem lp = new LpProblem ( "GameTheoryHw" , PULSProblem . LpMinimize ) ;
    String [ ] t = in . readLine ( ) . split ( " " ) ;
    int n = Integer . parseInt ( t [ 0 ] ) ;
    double V = Double . parseDouble ( t [ 1 ] ) ;
    double X = Double . parseDouble ( t [ 2 ] ) ;
    double [ ] r = new double [ n ] ;
    double [ ] c = new double [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      t = in . readLine ( ) . split ( " " ) ;
      r [ i ] = Double . parseDouble ( t [ 0 ] ) ;
      c [ i ] = Double . parseDouble ( t [ 1 ] ) ;
    }
    LpVariable [ ] x = new LpVariable [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) x [ i ] = new LpVariable ( "x" + i , 0 ) ;
    LpVariable T = new LpVariable ( "T" , 0 ) ;
    lp . sum ( r [ i ] * x [ i ] ) == V ;
    lp . sum ( r [ i ] * c [ i ] * x [ i ] ) == V * X ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) lp . sum ( x [ i ] <= T ) ;
    lp . sum ( T ) ;
    lp . solve ( ) ;
    int ok1 = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) if ( X > c [ i ] ) ok1 = ok1 + 1 ;
    int ok2 = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) if ( X < c [ i ] ) ok2 = ok2 + 1 ;
    if ( ( ok1 < n ) && ( ok2 < n ) ) System . out . println ( "Case #" + ( ti + 1 ) + ": " +