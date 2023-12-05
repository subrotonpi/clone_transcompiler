public static int a = Integer . parseInt ( input ) ;
int b = Integer . parseInt ( input ) ;
int m = Math . min ( a , b ) ;
int n = Integer . parseInt ( input ) ;
while ( true ) {
  if ( ( n % a == 0 ) && ( n % b == 0 ) ) {
    System . out . println ( n ) ;
    break ;
  }
  else {
    n ++ ;
  }
}
