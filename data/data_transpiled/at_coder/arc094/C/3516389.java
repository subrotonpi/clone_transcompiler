public static double nextDouble ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  double sum1 = 0 ;
  double ti = Double . MIN_VALUE ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double a = Double . parseDouble ( input . nextLine ( ) ) ;
    double b = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( a > b ) {
      ti = Math . min ( ti , b ) ;
    }
    sum1 += a ;
  }
  if ( ti == Double . MIN_VALUE ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( sum1 - ti ) ;
  }
  return ti ;
}
