public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double t = Double . parseDouble ( input . nextLine ( ) ) ;
  double a = Double . parseDouble ( input . nextLine ( ) ) ;
  double h = Double . parseDouble ( input . nextLine ( ) ) ;
  double [ ] av = new double [ n ] ;
  double tmp = 0 ;
  double mp = 999 ;
  int v = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    av [ i ] = t - h [ i ] * 0.006 ;
    tmp = Math . abs ( a - av [ i ] ) ;
    if ( ( tmp < mp ) && ( tmp > mp ) ) {
      mp = tmp ;
      v = i + 1 ;
    }
  }
  System . out . println ( v ) ;
}
