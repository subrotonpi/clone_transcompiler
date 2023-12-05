public static void fin ( File fin ) throws IOException {
  File fout = new File ( "1.in" ) ;
  PrintWriter pw = new PrintWriter ( fout ) ;
  int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int u = 0 ;
  u < T ;
  u ++ ) {
    System . out . println ( u + 1 ) ;
    int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    int P = Integer . parseInt ( fin . nextLine ( ) ) ;
    int [ ] H = Integer . parseInt ( fin . nextLine ( ) ) ;
    int [ ] G = new int [ P ] ;
    for ( int i = 0 ;
    i < P ;
    i ++ ) {
      G [ i ] = 0 ;
    }
    for ( int h : H ) {
      G [ h ] ++ ;
    }
    int ans = 0 ;
    if ( Integer . parseInt ( H ) % P != 0 ) ans ++ ;
    ans += G [ 0 ] ;
    if ( P == 2 ) ans += G [ 1 ] / 2 ;
    else if ( P == 3 ) {
      ans += Math . min ( G [ 1 ] , G [ 2 ] ) ;
      ans += ( Math . max ( G [ 1 ] , G [ 2 ] ) - Math . min ( G [ 1 ] , G [ 2 ] ) ) / 3 ;
    }
    else if ( P == 4 ) {
      ans += G [ 2 ] / 2 ;
      G [ 2 ] %= 2 ;
      int t = Math . min ( G [ 1 ] , G [ 3 ] ) ;
      G [ 1 ] -= t ;
      G [ 3 ] -= t ;
      ans += t ;
      if ( G [ 3 ] > 0 ) {
        G [ 1 ] = G [ 3 ] ;
        G [ 3 ] = 0 ;
      }
      if ( G [ 2 ] == 1 && G [ 1 ] >= 2 ) {
        ans ++ ;
        G [ 2 ] = 0 ;
        G [ 1 ] -= 2 ;
      }
      ans += G [ 1 ] / 4 ;
    }
    pw . println ( "Case #" + ( u + 1 ) + ": " + ans ) ;
  }
  pw . println ( "Case #" + ( u + 1 ) + ": " + ans ) ;
}
