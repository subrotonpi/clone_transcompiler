public static void input ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> AB = Arrays . asList ( Lists . newArrayList ( ) ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) AB . add ( Lists . newArrayList ( ) ) ;
  int ans = 0 ;
  for ( int i = n - 1 ;
  i >= 0 ;
  i -- ) {
    int a = AB . get ( i ) . get ( 0 ) + ans ;
    int b = AB . get ( i ) . get ( 1 ) ;
    int tmp ;
    if ( a % b == 0 ) tmp = 0 ;
    else tmp = ( a / b + 1 ) * b - a ;
    ans += tmp ;
  }
  System . out . println ( ans ) ;
}
