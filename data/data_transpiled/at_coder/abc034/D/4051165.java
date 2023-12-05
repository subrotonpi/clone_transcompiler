public static boolean c ( double x ) {
  double y [ ] = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) y [ i ] = v [ i ] - x * w [ i ] / 100.0 ;
  Arrays . sort ( y ) ;
  double tmp = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) tmp += y [ n - 1 - i ] ;
  if ( tmp >= 0 ) return true ;
  else return false ;
}
int n = Integer . parseInt ( input ( ) ) ;
int k = Integer . parseInt ( input ( ) ) ;
double w [ ] = new double [ n ] ;
double v [ ] = new double [ n ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  double x = Double . parseDouble ( input ( ) ) ;
  double y = Double . parseDouble ( input ( ) ) ;
  w [ i ] = x ;
  v [ i ] = x * y / 100.0 ;
}
