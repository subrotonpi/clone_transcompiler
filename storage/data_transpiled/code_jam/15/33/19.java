public static void fin ( File fin ) throws IOException {
  File fout = new File ( "largeC.in" ) ;
  FileWriter fw = new FileWriter ( "largeC.out" ) ;
  for ( int tc : xrange ( Integer . parseInt ( fin . readLine ( ) ) ) ) {
    int C = Integer . parseInt ( fin . readLine ( ) ) , D = Integer . parseInt ( fin . readLine ( ) ) , T = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] coins = new int [ D ] ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) coins [ i ] = Integer . parseInt ( fin . readLine ( ) ) ;
    int cur = 1 , ans = 0 ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int coin = coins [ i ] ;
      if ( cur >= coin ) cur += coin * C ;
      else {
        while ( cur < coin && cur <= T ) {
          cur *= C + 1 ;
          ans ++ ;
        }
        cur += coin * C ;
      }
    }
    while ( cur <= T ) {
      cur *= C + 1 ;
      ans ++ ;
    }
    System . out . println ( "Case #" + ( tc + 1 ) + ": " + ans ) ;
    fw . write ( "Case #" + ( tc + 1 ) + ": " + ans + "\n" ) ;
  }
}
