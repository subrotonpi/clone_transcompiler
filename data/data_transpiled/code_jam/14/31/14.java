static final String R_Large = "A_example" ;
String fname = "A_large" ;
Scanner tokReader = new Scanner ( new File ( fname ) ) ;
String line ;
while ( tokReader . hasNextLine ( ) ) {
  line = tokReader . nextLine ( ) ;
  StringTokenizer st = new StringTokenizer ( line . trim ( ) ) ;
  while ( st . hasMoreTokens ( ) ) {
    st . nextToken ( ) ;
  }
}
{
  BufferedReader in = new BufferedReader ( new FileReader ( fname + ".in" ) ) ;
  String read = in . readLine ( ) ;
  readn = new BufferedReader ( new FileReader ( fname + ".in" ) ) {
    public int read ( ) {
      return Integer . parseInt ( read ) ;
    }
  }
  ;
  PrintWriter outp = new PrintWriter ( fname + ".out" ) ;
  int T = Integer . parseInt ( read ) ;
  for ( int i = 1 ;
  i <= T ;
  i ++ ) {
    String fs = read . readLine ( ) ;
    int den = Integer . parseInt ( fs . substring ( 0 , fs . indexOf ( '/' ) ) ) ;
    int nom = Integer . parseInt ( fs . substring ( fs . indexOf ( '/' ) + 1 ) ) ;
    Fraction f = new Fraction ( den , nom ) ;
    Fraction v = f . divide ( new Fraction ( 1 , 2 * 40 ) ) ;
    String res ;
    if ( ( v . getDenominator ( ) != 1 ) && ( v . getDenominator ( ) != 1 ) ) {
      res = "Case #" + ( i ) + ": impossible\n" ;
    }
    else {
      int n1 = v . getNumerator ( ) ;
      int n2 = 2 * 39 ;
      int r = 1 ;
      while ( n2 > n1 ) {
        n2 = n2 / 2 ;
        r ++ ;
      }
      res = "Case #" + ( i ) + ": " + r + "\n" ;
    }
    print ( den , nom , v , res ) ;
    print ( res ) ;
    outp . println ( res ) ;
  }
  outp . close ( ) ;
}
System . out . println ( "finished" ) ;
}
