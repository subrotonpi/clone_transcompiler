public static void main ( String input ) {
  N = Integer . parseInt ( input . split ( " " ) ) ;
  S = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S . add ( input . replaceAll ( " " , "" ) ) ;
  }
  System . out . println ( '' . join ( sorted ( S ) ) ) ;
}
