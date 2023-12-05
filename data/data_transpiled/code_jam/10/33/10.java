@ VisibleForTesting static int [ ] [ ] run ( ) throws IOException {
  String inpath = "C-small-attempt0.in" ;
  String outpath = "C.out" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( inpath ) ) ;
  PrintWriter fout = new PrintWriter ( outpath ) ;
  int M = Integer . parseInt ( fin . readLine ( ) ) ;
  int N = Integer . parseInt ( fin . readLine ( ) ) ;
  int [ ] [ ] bark = new int [ M ] [ N ] ;
  for ( int i = 0 ;
  i < bark . length ;
  i ++ ) {
    int letter = Integer . parseInt ( bark [ i ] [ j / 4 ] , 16 ) ;
    int digit = 3 - j % 4 ;
    return ( letter & 2 * digit ) != 0 ? bark [ i ] [ j ] : bark [ i ] [ j ] ;
  }
  fin . close ( ) ;
  fout . close ( ) ;
  System . out . println ( "\nTime: " + ( System . currentTimeMillis ( ) - timestart ) ) ;
  {
    boolean a = true ;
    boolean b = true ;
    boolean c = true ;
    boolean d = true ;
    for ( int i = 0 ;
    i < bark . length ;
    i ++ ) {
      a = bark [ i ] [ j ] ;
      b = bark [ i ] [ j ] ;
      c = bark [ i ] [ j + 1 ] ;
      d = bark [ i + 1 ] [ j ] ;
    }
    return ( ( a && d && ! ( b || c ) ) || ( b && c && ! ( a || d ) ) ) ;
  }
  private void cut ( boolean [ ] [ ] table , int n ) {
    n -- ;
    int count = 0 ;
    for ( int i = 0 ;
    i < table . length - n + 1 ;
    i ++ ) {
      for ( int j = 0 ;
      j < table [ 0 ] . length - n + 1 ;
      j ++ ) {
        if ( ! Arrays . equals ( table [ i ] , table [ j ] ) ) {
          continue ;
        }
        count ++ ;
        for ( int x = i - 1 ;
        x <= i + n ;
        x ++ ) {
          for ( int y = j - 1 ;
          y <= j + n ;
          y ++ ) {
            cut ( table , x , y ) ;
          }
        }
      }
    }
  }
  private static int [ ] [ ] run ( ) {
    return Arrays . copyOf ( table , n ) ;
  }
}
