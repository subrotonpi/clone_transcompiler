public static void a ( int a , int b , int k , int l ) {
  for ( int i = 0 ;
  i < input . length ;
  i ++ ) {
    a += input . nextInt ( ) ;
  }
  int ans = b * ( k / l ) ;
  k -= l * ( k / l ) ;
  if ( a * k <= b ) {
    ans += a * k ;
  }
  else {
    ans += b ;
  }
  System . out . println ( ans ) ;
}
