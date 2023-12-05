static final int [ ] getDigits ( ) {
  int j [ ] = new int [ 3 ] ;
  for ( int i = 0 ;
  i < j ;
  i ++ ) {
    j [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int n = j [ 0 ] ;
  int a = j [ 1 ] ;
  int b = j [ 2 ] ;
  if ( ( n < a + b - 1 ) || ( n > a * b ) ) {
    System . out . println ( - 1 ) ;
    exit ( 0 ) ;
  }
  List < Integer > ans = new LinkedList < Integer > ( ) ;
  ans . add ( b ) ;
  if ( ( n > b ) && ( n > b ) ) {
    int counter = ans . size ( ) ;
    loopcounter = 1 ;
    int sikii = b ;
    int yoyuu = n - a - b + 1 ;
    while ( ( counter < n ) && ( yoyuu > sikii ) ) {
      ans . add ( counter + 1 ) ;
    }
    else {
      ans . add ( counter + 1 ) ;
      yoyuu = 0 ;
    }
    loopcounter ++ ;
    counter = ans . size ( ) ;
  }
  return ans . toArray ( ) ;
}
