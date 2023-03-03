public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double a = Double . parseDouble ( input . nextLine ( ) ) ;
  double b = Double . parseDouble ( input . nextLine ( ) ) ;
  int [ ] ss = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ss [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  double s_min = min ( ss ) ;
  double s_max = max ( ss ) ;
  if ( s_min == s_max ) {
    System . out . println ( - 1 ) ;
    return ;
  }
  double p = b / ( s_max - s_min ) ;
  double q = a - sum ( ss ) * p / n ;
  System . out . println ( p + " " + q ) ;
}
