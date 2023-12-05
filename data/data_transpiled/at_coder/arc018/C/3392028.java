static void print ( int n , int m ) {
  Scanner input = new Scanner ( System . in ) ;
  int x = input . nextInt ( ) , a = input . nextInt ( ) , p = input . nextInt ( ) ;
  Pair [ ] s = new Pair [ n * m ] , ans = 0 ;
  for ( int i = 0 ;
  i < n * m ;
  i ++ ) {
    s [ i ] = new Pair ( x , i ) ;
    x = ( x + a ) % p ;
  }
  Arrays . sort ( s ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Pair [ ] q = new Pair [ m ] ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      ans += Math . abs ( s [ i * m + j ] . getValue ( ) / m - i ) ;
      q [ j ] = s [ i * m + j ] . getValue ( ) % m ;
    }
    Arrays . sort ( q ) ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) ans += Math . abs ( q [ j ] . getValue ( ) - i ) ;
  }
  System . out . println ( ans ) ;
}
