public static int pianistTakaHashi ( @ NonNull String S ) {
  String [ ] scales = {
    "Do" , "Do#" , "Re" , "Re#" , "Mi" , "Fa" , "Fa#" , "So" , "So#" , "La" , "La#" , "Si" }
    ;
    String keyboard = "WBWBWWBWBWBW" ;
    for ( int i = 0 ;
    i < scales . length ;
    i ++ ) {
      if ( ( S ) . startsWith ( keyboard . substring ( i ) + keyboard . substring ( 0 , i ) ) ) {
        return scales [ i ] ;
      }
    }
    return "Unknown" ;
  }
  