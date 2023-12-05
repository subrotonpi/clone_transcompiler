public static int N = Integer . parseInt ( input ) {
  double Ans = N ;
  String suu = input . nextLine ( ) ;
  List < Integer > ListNum = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < ListNum . size ( ) ;
  i += 1 ) {
    try {
      if ( ListNum . get ( i ) < ListNum . get ( i + 1 ) ) {
        c ++ ;
      }
      else {
        double b = c * ( C + 1 ) / 2 ;
        Ans += b ;
        c = 0 ;
        continue ;
      }
    }
    catch ( Exception e ) {
      double b = c * ( c + 1 ) / 2 ;
      Ans += b ;
      c = 0 ;
      if ( i == ListNum . size ( ) - 1 ) break ;
    }
  }
  return ( int ) Ans ;
}
