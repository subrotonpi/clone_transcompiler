public static String solve ( String s ) {
  String pattern = ( s . length ( ) == 10 ) ? "WBWBWWBWBWBW" : "WBWBWBWBWBW" ;
  String [ ] oto = {
    "Do" , "Do" , "Re" , "Re" , "Mi" , "Fa" , "Fa" , "So" , "So" , "La" , "La" , }
    ;
    int i = pattern . indexOf ( s ) ;
    return oto [ i ] ;
  }
  