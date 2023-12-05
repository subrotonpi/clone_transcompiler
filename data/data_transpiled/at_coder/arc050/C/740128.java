public static int f ( int x , int d , int n ) {
  int z = n > 0 ? f ( ( x * d + x ) % m , d * d % m , n / 2 ) : 0 ;
  return f ( z , z * d + x ) [ n % 2 ] ;
}
