@ GwtIncompatible ( "java.util.regex.Pattern" ) private static double [ ] [ ] golden ( final String input_filename ) throws IOException {
  final int numTests = Integer . parseInt ( input_filename ) ;
  final int s = Integer . parseInt ( input_filename ) ;
  final double [ ] [ ] ships = new double [ s ] [ ] ;
  for ( int i = 0 ;
  i < ships . length ;
  i ++ ) {
    final int x = Integer . parseInt ( input_filename ) ;
    final int y = Integer . parseInt ( input_filename ) ;
    final int z = Integer . parseInt ( input_filename ) ;
    final double p = Double . parseDouble ( input_filename ) ;
    ships [ i ] = new double [ x ] ;
    ships [ i ] [ y ] = z ;
    ships [ i ] [ z ] = p ;
  }
  final double [ ] [ ] cruiser = guessCruiser ( ships ) ;
  final double [ ] [ ] cmin = new double [ s ] [ ] ;
  for ( int i = 0 ;
  i < cmin . length ;
  i ++ ) {
    final double [ ] result = powerNeeded ( cruiser [ i ] , 1e-50 , 1e-50 , null , 0 ) ;
    System . out . printf ( "Case #%0.6f%n" , i , result [ i ] ) ;
  }
  return cmin ;
}
