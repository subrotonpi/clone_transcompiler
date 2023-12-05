public static String cTheMelancholyOfTaroHeikinchi ( String S ) {
  int X = Integer . parseInt ( S ) ;
  int Y = Integer . parseInt ( S ) ;
  ArrayList < int [ ] > ans_tmp = new ArrayList < > ( ) ;
  for ( int N = 2 * X / Y - 1 ;
  N <= 2 * X / Y + 2 ;
  N ++ ) {
    if ( N <= 0 ) continue ;
    int m_numerator = N * ( Y * ( N + 1 ) - 2 * X ) ;
    int m_denominator = 2 * Y ;
    if ( m_numerator % m_denominator != 0 ) continue ;
    int M = m_numerator / m_denominator ;
    if ( 1 <= M && M <= N ) ans_tmp . add ( new int [ ] {
      N , M }
      ) ;
    }
    String ans ;
    if ( ans_tmp . size ( ) > 0 ) {
      ans = "\n" + Arrays . toString ( ans_tmp . toArray ( new int [ ans_tmp . size ( ) ] ) ) ;
    }
    else {
      ans = "Impossible" ;
    }
    return ans ;
  }
  