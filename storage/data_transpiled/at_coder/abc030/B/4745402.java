public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  if ( n > 12 ) n -= 12 ;
  double n_k = 30 * n + ( 0.5 ) * m ;
  double m_k = 6 * m ;
  System . out . println ( Math . min ( 360 - Math . abs ( n_k - m_k ) , Math . abs ( n_k - m_k ) ) ) ;
}
