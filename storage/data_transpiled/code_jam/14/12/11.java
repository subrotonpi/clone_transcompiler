static final Scanner IO = new Scanner ( System . in ) {
  final Scanner fin = null ;
  final Scanner fout = new Scanner ( new InputStreamReader ( System . in ) ) {
    final int [ ] nums = new int [ 2 ] ;
    for ( int i = 0 ;
    i < nums . length ;
    i ++ ) {
      nums [ i ] = Integer . parseInt ( fin . nextLine ( ) ) ;
    }
    final double [ ] fnums = new double [ 2 ] ;
    for ( int i = 0 ;
    i < fnums . length ;
    i ++ ) {
      fnums [ i ] = Double . parseDouble ( fin . nextLine ( ) ) ;
    }
    final int num = Integer . parseInt ( fin . nextLine ( ) ) ;
    final String sstrip = fin . nextLine ( ) . trim ( ) ;
    final String arrstr = " " ;
    for ( int i = 0 ;
    i < fnums . length ;
    i ++ ) {
      arrstr += sep . join ( Arrays . asList ( a ) ) ;
    }
    final int solve = solve ( ) ;
    final int n = num ;
    final int [ ] [ ] edges = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      edges [ i ] = new int [ n ] ;
    }
    final int dfs = edges [ 0 ] [ 0 ] ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      edges [ i ] [ 0 ] = edges [ i ] [ 1 ] ;
    }
    final int cnt = 1 ;
    final int [ ] costs = new int [ n ] ;
    for ( int i = 1 ;
    i < n ;
    i ++ ) {
      int u = edges [ i ] [ 0 ] ;
      int v = edges [ i ] [ 1 ] ;
      edges [ u - 1 ] [ 0 ] = edges [ i ] [ 0 ] ;
      edges [ v - 1 ] [ 1 ] = edges [ i ] [ 1 ] ;
    }
    int res = 1000000 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int k = dfs ( i , - 1 ) [ 1 ] ;
      res = Math . min ( res , k ) ;
    }
    return new Scanner ( fin ) ;
  }
  ;
  System . setIn ( new FileInputStream ( fname ) ) ;
  fout = new PrintWriter ( new FileOutputStream ( fname + ".out.txt" ) ) ;
  t0 = new Date ( ) ;
  int t = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int i = 0