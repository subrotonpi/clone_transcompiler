public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] S = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S [ i ] = input . substring ( i ) ;
  }
  String [ ] T = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    StringBuffer tmp = new StringBuffer ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      tmp . append ( S [ j ] . substring ( i ) ) ;
    }
    T [ i ] = tmp . toString ( ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    boolean flag = true ;
    for ( int y = 0 ;
    y < N ;
    y ++ ) {
      if ( T [ ( y + i ) % N ] . compareTo ( S [ y ] . substring ( i ) ) != 0 ) {
        flag = false ;
        break ;
      }
    }
    if ( flag ) ans ++ ;
  }
  System . out . println ( ans * N ) ;
}
