static final double [ ] range ( int n ) {
  int n = Integer . parseInt ( input ( ) ) ;
  double a = Double . parseDouble ( list ( input ) ) ;
  double res = 0 , s = 1 ;
  while ( s > 0 ) {
    double b = a / n ;
    s = b ;
    res += s ;
    a += s - b * ( n + 1 ) ;
  }
  System . out . println ( res ) ;
}
