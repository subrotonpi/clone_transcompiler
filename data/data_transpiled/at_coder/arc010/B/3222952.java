@ InputFunction public static void input ( @ AggregationState CovarianceState state , @ SqlType ( StandardTypes . DATE ) long dependentValue , @ SqlType ( StandardTypes . DATE ) long independentValue ) {
  int n = Ints . checkedCast ( input . nextInt ( ) ) ;
  List < LocalDate > a = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int m = Ints . checkedCast ( input . nextInt ( ) ) ;
    int d = Ints . checkedCast ( input . nextInt ( ) ) ;
    a . add ( LocalDate . of ( 2012 , m , d ) ) ;
  }
  LocalDate d = LocalDate . now ( ) ;
  int r = 0 ;
  int s = 0 ;
  int c = 0 ;
  while ( d . isAfter ( independentValue ) ) {
    if ( independentValue == d || independentValue == d ) {
      s ++ ;
      if ( independentValue == d && independentValue == d ) {
        c ++ ;
      }
    }
    else if ( c > 0 ) {
      s ++ ;
      c -- ;
    }
    else {
      s = 0 ;
    }
    r = Math . max ( r , s ) ;
    d += independentValue ;
  }
  System . out . println ( r ) ;
}
