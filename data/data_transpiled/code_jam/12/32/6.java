public static void solve ( Scanner in , PrintWriter outp ) throws IOException {
  PrintWriter in = new PrintWriter ( new File ( "./B-large.in" ) ) ;
  PrintWriter outp = new PrintWriter ( new BufferedWriter ( new FileWriter ( "./B.out" ) ) ) ;
  int T = Integer . parseInt ( in . nextLine ( ) ) ;
  {
    String [ ] I = in . nextLine ( ) . replace ( "\n" , "" ) . split ( "\\s+" ) ;
    double D = Double . parseDouble ( I [ 0 ] ) ;
    int N = Integer . parseInt ( I [ 1 ] ) ;
    int A = Integer . parseInt ( I [ 2 ] ) ;
    double [ ] [ ] Ns = new double [ N ] [ ] ;
    for ( int n = 0 ;
    n < N ;
    n ++ ) {
      Ns [ n ] = new double [ N ] ;
      for ( int a = 0 ;
      a < N ;
      a ++ ) {
        Ns [ n ] [ a ] = Double . parseDouble ( in . nextLine ( ) . replace ( "\n" , "" ) . split ( "\\s+" ) ) ;
        if ( Ns [ n ] [ 1 ] > D ) {
          if ( n != 0 ) Ns [ n ] [ 0 ] = Ns [ n - 1 ] [ 0 ] + ( D - Ns [ n - 1 ] [ 1 ] ) / ( Ns [ n ] [ 1 ] - Ns [ n - 1 ] [ 1 ] ) * ( Ns [ n ] [ 0 ] - Ns [ 0 ] [ 0 ] ) ;
          Ns [ n ] [ 1 ] = D ;
        }
      }
    }
  }
}
