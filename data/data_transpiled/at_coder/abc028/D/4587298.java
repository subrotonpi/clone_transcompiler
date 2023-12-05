public static void main ( String input ) {
  double a = Double . parseDouble ( input ) ;
  double b = Double . parseDouble ( input ) ;
  double s = 0 ;
  s += 1 ;
  s += ( a - 1 ) * 3 ;
  s += 6 * ( ( b - 1 ) * ( a - b ) ) ;
  s /= a * 3 ;
  System . out . println ( s ) ;
}
