public static int n ( int a , int b ) {
  List < Integer > v = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    v . add ( input . nextInt ( ) ) ;
  }
  v = new ArrayList < Integer > ( v ) ;
  Collections . sort ( v , Collections . reverseOrder ( ) ) ;
  int maxAave = Integer . valueOf ( v . get ( 0 ) ) / a ;
  int indexMaxAave = - 1 ;
  for ( int i = a ;
  i <= b ;
  i ++ ) {
    maxAave = Math . max ( Integer . valueOf ( v . get ( 0 ) ) / ( i ) , maxAave ) ;
    if ( maxAave == Integer . valueOf ( v . get ( 0 ) ) / ( i ) ) {
      indexMaxAave = i ;
    }
  }
  System . out . println ( maxAave ) ;
  /* combination */
  int n = v . get ( indexMaxAave - 1 ) ;
  for ( int i = 0 ;
  i < indexMaxAave ;
  i ++ ) {
    if ( num != v . get ( i ) ) {
      System . out . println ( combination ( v . subList ( 0 , indexMaxAave ) . indexOf ( num ) + v . subList ( indexMaxAave , n ) . indexOf ( num ) , v . subList ( 0 , indexMaxAave ) . indexOf ( num ) ) ) ;
      exit ( ) ;
    }
  }
  int cnt = v . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
  int ans = 0 ;
  for ( int i = a ;
  i <= Math . min ( b + 1 , cnt + 1 ) ;
  ans ++ ) {
    ans += combination ( cnt , i ) ;
  }
  return ans ;
}
