public static void main ( String className ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( "A-large.out" ) ) ;
  int T = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( T ) ;
  i ++ ) {
    int N = Integer . parseInt ( br . readLine ( ) ) ;
    int [ ] aArray = new int [ N ] ;
    int [ ] bArray = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int a = Integer . parseInt ( br . readLine ( ) ) ;
      int b = Integer . parseInt ( br . readLine ( ) ) ;
      aArray [ j ] = a ;
      bArray [ j ] = b ;
    }
    int result = 0 ;
    for ( int j = 0 ;
    j < xrange ( N ) ;
    j ++ ) {
      for ( int k = j + 1 ;
      k < N ;
      k ++ ) {
        if ( aArray [ j ] < aArray [ k ] && bArray [ j ] > bArray [ k ] ) result ++ ;
        if ( aArray [ j ] > aArray [ k ] && bArray [ j ] < bArray [ k ] ) result ++ ;
      }
    }
    fout . write ( StringUtils . repeat ( "Case #" , ( i + 1 ) + ": " , result ) ) ;
  }
  fout . close ( ) ;
  br . close ( ) ;
}
