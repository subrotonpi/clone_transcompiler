public static int extgcd ( int a , int b ) {
  int x = 0 , y = 1 , u = 1 , v = 0 ;
  int m , n ;
  int g = 0 ;
  while ( a != 0 ) {
    int q = b / a , r = b % a ;
    m = x - u * q ;
    n = y - v * q ;
    b = a ;
    x = y ;
    y = r ;
    u = v ;
    v = m ;
    m = n ;
    g = b ;
  }
  return x + y + g ;
}
