public static void readFile ( File fin ) throws IOException {
  int N = Integer . parseInt ( fin . readLine ( ) ) ;
  File fout = new File ( "d.out" ) ;
  for ( int i = xrange ( 1 , N + 1 ) ;
  i <= N ;
  i ++ ) {
    int n = Integer . parseInt ( fin . readLine ( ) ) ;
    int m = Integer . parseInt ( fin . readLine ( ) ) ;
    int X = Integer . parseInt ( fin . readLine ( ) ) ;
    int Y = Integer . parseInt ( fin . readLine ( ) ) ;
    int Z = Integer . parseInt ( fin . readLine ( ) ) ;
    long [ ] A = new long [ n ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) A [ j ] = Long . parseLong ( fin . readLine ( ) ) ;
    long [ ] s = new long [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      s [ j ] = A [ j ] ;
      s [ j ] = ( X * A [ j ] + Y * ( j + 1 ) ) % Z ;
    }
    long [ ] count = new long [ n ] ;
    count [ n ] = 1 ;
    count [ n ] = 0 ;
  }
}
