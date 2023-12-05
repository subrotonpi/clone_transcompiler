private static double [ ] parse ( ) throws IOException {
  assert tokens . charAt ( 0 ) == '(' ;
  double prob = Double . parseDouble ( tokens . substring ( 1 ) ) ;
  if ( tokens . charAt ( 2 ) == ')' ) {
    tokens = tokens . substring ( 3 ) ;
    return new double [ ] {
      prob , null , null , null }
      ;
    }
    String feature = tokens . substring ( 2 ) ;
    tokens = tokens . substring ( 3 ) ;
    double child1 = parse ( ) ;
    double child2 = parse ( ) ;
    tokens = tokens . substring ( 1 ) ;
    return new double [ ] {
      prob , feature , child1 , child2 }
      ;
      /* main program */
      BufferedReader br = new BufferedReader ( new FileReader ( "A.in" ) ) ;
      int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
      for ( int t = 0 ;
      t < T ;
      t ++ ) {
        int N = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
        StringBuilder sb = new StringBuilder ( ) ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          sb . append ( br . readLine ( ) ) ;
        }
        String tree = sb . toString ( ) ;
        tree = tree . replace ( "(" , " ( " ) ;
        tree = tree . replace ( ")" , " ) " ) ;
        tokens = tree . split ( " " ) ;
        tree = parse ( ) ;
        System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
        int M = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
        for ( int i = 0 ;
        i < M ;
        i ++ ) {
          String list = br . readLine ( ) . split ( " " ) ;
          String name = list . substring ( 0 , 1 ) ;
          int count = Integer . parseInt ( list . substring ( 1 ) ) ;
          Set < String > features = new HashSet < String > ( Arrays . asList ( list . substring ( 2 ) ) ) ;
          assert features . size ( ) == count ;
          Tree root = tree ;
          double prob = 1 ;
          while ( root . getTree ( ) != null ) {
            prob *= root . getTree ( ) . getProbabilities ( ) ;
            if ( features . contains ( root . getTree ( ) ) ) {
              root = root . getTree ( ) ;
            }
            else {
              root = root . getTree ( ) ;
              