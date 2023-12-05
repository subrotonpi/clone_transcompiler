public static double getD ( ) {
  int D = Integer . parseInt ( input . readLine ( ) ) ;
  int G = Integer . parseInt ( input . readLine ( ) ) ;
  LinkedList < Integer > lst = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < D ;
  i ++ ) lst . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  double ans = Double . MAX_VALUE ;
  for ( int i = 0 ;
  i < 1 << D ;
  i ++ ) {
    double tmp = 0 ;
    int count = 0 ;
    String bit = "" ;
    for ( int j = 0 ;
    j < lst . size ( ) ;
    j ++ ) {
      bit += Integer . toString ( ( i >> j ) & 1 ) ;
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        tmp = tmp + lst . get ( j ) . intValue ( ) + ( ( j + 1 ) * 100 * lst . get ( j ) . intValue ( ) ) ;
        count += lst . get ( j ) . intValue ( ) ;
      }
    }
    if ( tmp < G ) {
      for ( int n = 0 ;
      n < lst . size ( ) ;
      n ++ ) {
        if ( bit . equals ( bit ) ) {
          for ( int p = 0 ;
          p < lst . size ( ) ;
          p ++ ) {
            int t = bit . equals ( bit ) ? t : tmp ;
            ans = t + tmp ;
          }
        }
      }
    }
  }
  System . out . println ( ( int ) ans ) ;
  return ans ;
}
