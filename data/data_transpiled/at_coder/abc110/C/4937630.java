@ Nonnull public static String getString ( @ Nonnull String s ) {
  String t = input . nextLine ( ) ;
  Map < String , String > dS2t = Maps . newHashMap ( ) ;
  Map < String , String > dT2s = Maps . newHashMap ( ) ;
  boolean flg = true ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    String ss = s . substring ( i , i + 1 ) ;
    String tt = t . substring ( i , i + 1 ) ;
    if ( dS2t . get ( ss ) == null ) {
      dS2t . put ( ss , tt ) ;
    }
    else {
      if ( ! dS2t . get ( ss ) . equals ( tt ) ) {
        flg = false ;
        break ;
      }
    }
    if ( dT2s . get ( tt ) == null ) {
      flg = false ;
      break ;
    }
  }
  return flg ? "Yes" : "No" ;
}
