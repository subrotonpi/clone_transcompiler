public static void input ( ) {
  O = new String [ 2 ] ;
  E = new String [ 2 ] ;
  for ( int i = 0 ;
  i < O . length ;
  i ++ ) {
    try {
      restStr += O [ i ] + E [ i ] ;
    }
    catch ( ArrayIndexOutOfBoundsException e ) {
      restStr += O [ i ] ;
    }
  }
  System . out . println ( restStr ) ;
}
