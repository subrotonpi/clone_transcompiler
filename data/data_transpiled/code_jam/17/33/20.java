static final String C = "C-small-1-attempt0.in" ;
BufferedReader in = new BufferedReader ( new FileReader ( filename ) ) ;
PrintWriter out = new PrintWriter ( "output.txt" ) ;
int Cases = Integer . parseInt ( in . readLine ( ) ) ;
for ( int T = 0 ;
T < Cases ;
T ++ ) {
  Arrays . stream ( N ) . forEach ( j -> {
    double U = Double . parseDouble ( in . readLine ( ) ) ;
    double [ ] P = new double [ N ] ;
    for ( int i = 0 ;
    i < P . length ;
    i ++ ) {
      P [ i ] = Double . parseDouble ( in . readLine ( ) ) ;
    }
  }
  ) ;
  Arrays . sort ( P ) ;
  double Ubuf = U ;
  int i = 0 ;
  while ( ( Ubuf >= 0 ) && ( i < P . length ) ) {
    Ubuf -= ( P [ i ] - Ubuf ) ;
  }
}
