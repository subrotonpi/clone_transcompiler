static void print ( Scanner in ) throws FileNotFoundException {
  PrintWriter w = new PrintWriter ( 1 ) ;
  int H = Integer . parseInt ( in . nextLine ( ) ) ;
  int W = Integer . parseInt ( in . nextLine ( ) ) ;
  int INF = 10 * 18 ;
  List < Point > P = new ArrayList < > ( ) ;
  int A = 0 ;
  int B = 0 ;
  int Am = 0 ;
  int Bm = INF ;
  while ( in . hasNextInt ( ) ) {
    String s = in . nextLine ( ) ;
    int lc = 0 ;
    int rc = 0 ;
    int lp = - 1 ;
    int rp = - 1 ;
    int mode = 0 ;
    int i = 0 ;
    for ( int j = 0 ;
    j < s . length ( ) ;
    j ++ ) {
      char c = s . charAt ( j ) ;
      switch ( c ) {
        case 'o' : if ( mode == 0 ) {
          A += lc * ( i - 1 - lp ) ;
          lc ++ ;
          lp = i ;
        }
        else {
          if ( lc == 0 ) Bm = Math . min ( Bm , rp ) ;
          else {
            if ( rp - lp > 2 ) P . add ( new Point ( lc + rc , rp - lp - 2 , lc , rc ) ) ;
          }
          lc = 1 ;
          rc = 0 ;
          lp = i ;
          rp = - 1 ;
          mode = 0 ;
        }
        break ;
        case 'x' : if ( mode == 0 ) rp = i ;
        B += ( i - ( rp + rc ) ) ;
        mode = 1 ;
        rc ++ ;
        i ++ ;
        break ;
      }
      if ( mode == 0 ) {
        if ( lc > 0 ) Am = Math . min ( Am , ( W - 1 ) - lp ) ;
      }
      else {
        if ( lc == 0 ) Bm = Math . min ( Bm , rp ) ;
        else {
          if ( rp - lp > 2 ) P . add ( new Point ( lc + rc , rp - lp - 2 , lc , rc ) ) ;
        }
      }
    }
    Collections . sort ( P , Collections . reverseOrder ( ) ) ;
    if ( Am < INF || Bm < INF ) {
      w . println ( Am <= Bm ? "o" : "x" ) ;
      exit ( 0 ) ;
    }
    int t = 0 ;
    for ( Point c : P ) {
      int r = c . x ;
      int a = c . y ;
      int b = c . x ;
      if ( t == 0 ) {
        A