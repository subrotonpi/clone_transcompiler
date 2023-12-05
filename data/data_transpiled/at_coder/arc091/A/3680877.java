public static int n , m ;
n = Integer . parseInt ( input . nextLine ( ) ) ;
m = Integer . parseInt ( input . nextLine ( ) ) ;
n = Math . max ( n , m ) ;
m = Math . min ( n , m ) ;
if ( n == 1 && m == 1 ) {
  System . out . println ( 1 ) ;
}
else {
  int a = Math . min ( 2 , n ) ;
  int b = Math . max ( 0 , n - 2 ) ;
  int c = Math . min ( 2 , m ) ;
  int d = Math . max ( 0 , m - 2 ) ;
  if ( m == 1 ) {
    System . out . println ( b ) ;
  }
  else {
    System . out . println ( b * d ) ;
  }
}
return a * b * c * d ;
}
