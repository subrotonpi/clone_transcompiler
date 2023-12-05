public static void input ( ) {
  String parties = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
  for ( int j = 0 ;
  j < xrange ( t ) ;
  j ++ ) {
    int n = input . nextInt ( ) ;
    int [ ] p = map ( Integer . parseInt ( readLine ( ) . trim ( ) ) . split ( " " ) ) ;
    String res = "Case #" + ( j + 1 ) + ":" ;
    while ( max ( p ) > 0 ) {
      res += " " ;
      int m = max ( p ) ;
      int c = p . length ;
      int pty = p [ m ] ;
      res += parties . charAt ( pty ) ;
      p [ pty ] -- ;
      if ( c == 2 ) {
        pty = p [ m ] ;
        res += parties . charAt ( pty ) ;
        p [ pty ] -- ;
      }
    }
    System . out . println ( res ) ;
  }
}
