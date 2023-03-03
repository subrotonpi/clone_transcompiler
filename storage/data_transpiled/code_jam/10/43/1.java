@ GwtIncompatible ( "java.util.Scanner" ) public static void main ( String [ ] args ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "file.in" ) ) ;
  PrintWriter ouf = new PrintWriter ( new BufferedWriter ( new FileWriter ( "file.out" ) ) ) ;
  int counttests = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int testCase = 0 ;
  {
    int n = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
    int [ ] [ ] a = new int [ 100 ] [ 100 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = new int [ 100 ] ;
    }
    int oc = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] t = Integer . parseInt ( inf . readLine ( ) . split ( " " ) [ 0 ] ) ;
      t [ 0 ] -- ;
      t [ 1 ] -- ;
      t [ 2 ] -- ;
      t [ 3 ] -- ;
      for ( int x = 0 ;
      x < t [ 2 ] ;
      x ++ ) {
        for ( int y = 0 ;
        y < t [ 3 ] ;
        y ++ ) {
          if ( a [ x ] [ y ] == 0 ) {
            oc ++ ;
          }
          a [ x ] [ y ] = 1 ;
        }
      }
    }
    int ans = 0 ;
    while ( oc > 0 ) {
      ans ++ ;
      oc = 0 ;
      int [ ] [ ] na = new int [ 100 ] [ 100 ] ;
      for ( int i = 0 ;
      i < na . length ;
      i ++ ) {
        na [ i ] = new int [ 100 ] ;
      }
      for ( int x = 1 ;
      x < na . length ;
      x ++ ) {
        for ( int y = 1 ;
        y < na [ x ] . length ;
        y ++ ) {
          if ( a [ x ] [ y ] == 0 ) {
            na [ x ] [ y ] = a [ x ] [ y - 1 ] * a [ x - 1 ] [ y ] ;
          }
          else {
            na [ x ] [ y ] = a [ x ] [ y - 1 ] == 1 ? a [ x - 1 ] [ y ] : 1 ;
          }
        }
        if ( a [ x ] [ 0 ] == a [ x - 1 ] [ 0 ] ) {
          na [ x ] [ 0 ] = 1 ;
        }
        if (