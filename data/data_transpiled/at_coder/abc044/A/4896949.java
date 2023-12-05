static void f ( int n , int k , int x , int y ) {
  x = map ( Integer . valueOf ( 0 ) ) ;
  System . out . println ( n * x - ( x - y ) * Math . max ( n - k , 0 ) ) ;
}
