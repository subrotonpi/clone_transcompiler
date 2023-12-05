public static String a = "" , b = "" , c = "" , d = "" ;
char [ ] p = {
  '+' , '-' }
  ;
  for ( int i = 0 ;
  i < p . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < p . length ;
    j ++ ) {
      for ( int x = 0 ;
      x < p . length ;
      x ++ ) {
        String s = a + p [ i ] + b + p [ j ] + c + p [ x ] + d ;
        if ( new Integer ( s ) . intValue ( ) == 7 ) {
          System . out . println ( s + "=7" ) ;
          exit ( ) ;
        }
      }
    }
  }
  return a ;
}
