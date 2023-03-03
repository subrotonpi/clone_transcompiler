static final int [ ] getLevels ( ) {
  final int N = Integer . parseInt ( input . readLine ( ) ) ;
  final int K = Integer . parseInt ( input . readLine ( ) ) ;
  int a = nCr ( N , K , MOD ) ;
  int b = montmortNumber ( K , MOD ) ;
  System . out . println ( ( a * b ) % MOD ) ;
  if ( __name__ == "main" ) {
    main ( ) ;
  }
  else {
    final double INF = Double . POSITIVE_INFINITY ;
    System . setProperty ( "java.util.logging.Level" , INF ) ;
    final int MOD = 1777777777 ;
    final double [ ] dy = {
      0 , - 1 , 0 , 1 }
      ;
      final double [ ] dx = {
        1 , 0 , - 1 , 0 }
        ;
        return new int [ ] {
          0 , 0 , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , y , x , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , y , x , y , x , y , y , x , y , y , x , y , x , y , y , x , y , x , y , y , x , y , x , y , x , y , y , x , y , x , y , x , y , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , y , x , x , y , x , y , x , x , y