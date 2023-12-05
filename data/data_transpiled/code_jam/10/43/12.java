@ C ( filename = "C-small" ) public static void main ( String filename = "C-small" ) throws IOException {
  int N = 110 ;
  BufferedReader fin = new BufferedReader ( new FileReader ( filename + ".in" ) ) ;
  BufferedWriter fout = new BufferedWriter ( new FileWriter ( filename + ".out" ) ) ;
  int cases = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
  for ( int case = xrange ( 1 , cases + 1 ) ;
  case <= N ;
  case ++ ) {
    boolean [ ] [ ] map1 = new boolean [ N ] [ N ] ;
    boolean [ ] [ ] map2 = new boolean [ N ] [ N ] ;
    for ( int p = 0 ;
    p < N ;
    p ++ ) {
      map1 [ p ] = new boolean [ N ] ;
      map2 [ p ] = new boolean [ N ] ;
    }
    int r = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    for ( int p = 0 ;
    p < r ;
    p ++ ) {
      int x1 = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
      int y1 = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
      int x2 = Integer . parseInt ( fin . readLine ( ) ) ;
      int y2 = Integer . parseInt ( fin . readLine ( ) ) ;
      for ( int i = xrange ( x1 , x2 + 1 ) ;
      i <= N ;
      i ++ ) {
        for ( int j = xrange ( y1 , y2 + 1 ) ;
        j <= N ;
        j ++ ) {
          map1 [ i ] [ j ] = true ;
          map2 [ i ] [ j ] = true ;
          s ++ ;
        }
      }
    }
    r = 0 ;
    do {
      s = 0 ;
    }
    while ( true ) ;
  }
  System . out . println ( r ) ;
  fout . write ( "Case #" + case + ": " + r + "\n" ) ;
}
fin . close ( ) ;
fout . close ( ) ;
}
