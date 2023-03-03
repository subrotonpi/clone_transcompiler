public static int gcd ( int a , int b ) throws IOException {
  while ( b > 0 ) {
    a = b ;
    b = a % b ;
  }
  /* if (a == 0) return 0; return gcd(a, b); */
  int ret = gcd ( a , b ) ;
  for ( int i = 0 ;
  i < a ;
  i ++ ) {
    ret = gcd ( a , b ) ;
  }
  /* in case of a */
  File f = new File ( "B-large.in" ) ;
  FileReader fc = new FileReader ( f ) ;
  BufferedReader br = new BufferedReader ( fc ) ;
  String line ;
  int q ;
  int [ ] liczby ;
  int ret = 0 ;
  if ( liczby . length > 1 ) {
    int [ ] roznice = new int [ liczby . length ] ;
    for ( int i = 0 ;
    i < liczby . length ;
    i ++ ) {
      for ( int j = 0 ;
      j < liczby [ i ] ;
      j ++ ) {
        roznice [ i ] = ( int ) ( l . split ( "\\s+" ) [ j ] ) ;
      }
    }
    int g = gcd ( roznice ) ;
    if ( liczby [ 0 ] % g > 0 ) {
      ret = g - ( liczby [ 0 ] % g ) ;
    }
  }
  System . out . println ( "Case #" + q + ": " + ret ) ;
  return ret ;
}
