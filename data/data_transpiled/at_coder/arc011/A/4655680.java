public static void main ( String input , int m , int n , int firstm ) {
  int sold = firstm ;
  int sell = firstm ;
  int rest = 0 ;
  while ( rest + sell >= m ) {
    int z = sell / m * n ;
    rest += sell % m ;
    if ( rest >= m ) {
      z += rest / m * n ;
      rest %= m ;
    }
    sell = z ;
    sold += sell ;
  }
  System . out . println ( sold ) ;
}
