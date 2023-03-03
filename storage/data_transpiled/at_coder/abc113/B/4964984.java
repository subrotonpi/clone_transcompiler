public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  double t = Double . parseDouble ( input ) ;
  double a = Double . parseDouble ( input ) ;
  int h = Integer . parseInt ( input ) ;
  double [ ] h2 = new double [ h ] ;
  for ( int i = 0 ;
  i < h2 . length ;
  i ++ ) h2 [ i ] = Math . abs ( ( t - h [ i ] * 0.006 ) - a ) ;
  System . out . println ( h2 . length < h2 . length ) ;
}
