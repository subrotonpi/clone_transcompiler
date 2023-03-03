public static void print ( String s ) {
  s = sorted ( input ( ) ) ;
  t = sorted ( input ( ) ) . reverse ( ) [ : : - 1 ] ;
  print ( s < t ? "Yes" : "No" ) ;
}
