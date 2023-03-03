private static BufferedReader br = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
PrintWriter g = new PrintWriter ( new BufferedWriter ( new FileWriter ( "resultBlarge.txt" ) ) ) ;
int T = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
for ( int i : xrange ( 1 , 1 + T ) ) {
  int [ ] s = ArrayUtil . parseInt ( br . readLine ( ) . trim ( ) . split ( " " ) ) ;
  int N = s [ 0 ] ;
  int S = s [ 1 ] ;
  int p = s [ 2 ] ;
  int [ ] scores = s [ 3 ] ;
  int solid_score ;
  int surprise_score ;
  if ( p >= 2 ) {
    solid_score = 3 * p - 2 ;
    surprise_score = 3 * p - 4 ;
  }
  else {
    surprise_score = 3 ;
  }
  g . println ( ) ;
}
return g ;
}
