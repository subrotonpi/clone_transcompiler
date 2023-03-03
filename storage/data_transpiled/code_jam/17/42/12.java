public static void fin ( File fin ) throws IOException {
  PrintStream fout = new PrintStream ( new FileOutputStream ( "2.out" ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( t + 1 ) ;
    int N = Integer . parseInt ( fin . readLine ( ) ) ;
    int C = Integer . parseInt ( fin . readLine ( ) ) ;
    int M = Integer . parseInt ( fin . readLine ( ) ) ;
    ArrayList < Pair > P = new ArrayList < Pair > ( ) ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int p = Integer . parseInt ( fin . readLine ( ) ) ;
      int b = Integer . parseInt ( fin . readLine ( ) ) ;
      P . add ( new Pair ( p , b ) ) ;
    }
    int [ ] pos = new int [ N + 1 ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      pos [ i ] = 0 ;
    }
    Iterator < Pair > it = P . iterator ( ) ;
    for ( int p = 0 ;
    p < N ;
    p ++ ) {
      pos [ p ] ++ ;
    }
    int ans_y = 0 ;
    int cur = 0 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      cur += pos [ i ] ;
      ans_y = Math . max ( ans_y , ( cur + i - 1 ) / i ) ;
    }
    int [ ] buy = new int [ C + 1 ] ;
    for ( int i = 0 ;
    i < buy . length ;
    i ++ ) {
      buy [ i ] ++ ;
    }
    ans_y = Math . max ( ans_y , Math . max ( buy ) ) ;
    int ans_z = 0 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      ans_z += Math . max ( 0 , pos [ i ] - ans_y ) ;
    }
    String ans = Integer . toString ( ans_y ) + " " + Integer . toString ( ans_z ) ;
    fout . println ( "Case #" + ( t + 1 ) + ": " + ans ) ;
  }
}
