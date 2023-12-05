public static void print ( int n , int m ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  m = Integer . parseInt ( input . nextLine ( ) ) ;
  n = n % 12 ;
  double n_angle = n * 30 + m * 0.5 ;
  double m_angle = m * 6 ;
  System . out . println ( Math . min ( Math . abs ( n_angle - m_angle ) , 360 - Math . abs ( n_angle - m_angle ) ) ) ;
}
