static final int input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Math . floor ( Math . sqrt ( n ) ) ;
  for ( int i = 1 ;
  i <= a ;
  i ++ ) {
    if ( n % i == 0 ) {
      b = i ;
    }
  }
  String c = String . valueOf ( n / b ) ;
  System . out . println ( c . length ( ) - 2 ) ;
}
