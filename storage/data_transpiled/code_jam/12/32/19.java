public static String solve2 ( double D , double a ) {
  return Math . pow ( 2 * D / a , 0.5 ) ;
  /* solve */
  double D , N , A ;
  double D ;
  N = Double . parseDouble ( StdIn . readLine ( ) ) ;
  A = Double . parseDouble ( StdIn . readLine ( ) ) ;
  D = Double . parseDouble ( StdIn . readLine ( ) ) ;
  N = Integer . parseInt ( StdIn . readLine ( ) ) ;
  A = Integer . parseInt ( StdIn . readLine ( ) ) ;
  double [ ] [ ] others = new double [ N ] [ A ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    others [ i ] = ArrayUtil . parseDouble ( StdIn . readLine ( ) ) ;
  }
  double t_D = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    double t = others [ i ] [ 0 ] ;
    double x = others [ i ] [ 1 ] ;
    if ( x >= D ) {
      double t_pre = others [ i - 1 ] [ 0 ] ;
      double x_pre = others [ i ] [ 1 ] ;
      double v = ( x - x_pre ) / ( t - t_pre ) ;
      t_D = t + ( D - x ) / v ;
    }
  }
  StringBuilder ans = new StringBuilder ( ) ;
  for ( double ai : ArrayUtil . toStringArray ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays . copyOf ( Arrays [ ( Arrays [ ( < Arrays ) ) ) ) ) ) ) ) ) ) ) ) ) ) , "" ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) }
  return ( ) ;
}
return ( ) ;
}
