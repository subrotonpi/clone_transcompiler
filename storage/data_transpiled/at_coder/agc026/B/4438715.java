public static String g ( int a , int b ) {
  if ( a % b == 0 ) return b ;
  return g ( b , a % b ) ;
}
