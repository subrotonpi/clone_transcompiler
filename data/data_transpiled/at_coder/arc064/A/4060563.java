public static void main ( int n , int x ) {
  Scanner input = new Scanner ( System . in ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = input . nextInt ( ) ;
  }
  int [ ] copy = new int [ n ] ;
  for ( int num : a ) {
    copy [ num ] = num ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    copy [ i ] = num ;
  }
}
