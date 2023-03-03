public static void main ( String input , int m , int n , int N ) {
  int sales = N ;
  int mod = N ;
  while ( mod >= m ) {
    int get = mod / m * n ;
    sales += get ;
    mod = mod % m + get ;
  }
  System . out . println ( sales ) ;
}
