public static double p = Double . parseDouble ( input ) {
  double p = Double . parseDouble ( input . nextLine ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Double > li = new ArrayList < > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    li . add ( Double . parseDouble ( input . nextLine ( ) ) ) ;
  }
  li . sort ( ) ;
  double m = Math . min ( ( ( p - a ) / ( b - a ) ) . imag * Math . abs ( b - a ) ) ;
  System . out . println ( m ) ;
  return m ;
}
