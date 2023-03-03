public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int ans = 1 ;
  if ( n == 1 ) {
    System . out . println ( "Deficient" ) ;
    quit ( ) ;
  }
  int i = 2 ;
  String [ ] ans_l = {
    "Deficient" , "Perfect" , "Abundant" }
    ;
    while ( i * i <= n ) {
      if ( n % i == 0 ) {
        ans += i ;
        if ( n / i != i ) ans += n / i ;
      }
      i ++ ;
    }
    int key = ( ans - n ) / Math . max ( 1 , Math . abs ( ans - n ) ) + 1 ;
    System . out . println ( ans_l [ key ] ) ;
  }
  