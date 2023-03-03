public static void input ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int [ ] Edirect = new int [ N + 1 ] ;
  Edirect [ 0 ] = 0 ;
  int numE = 0 ;
  int ans = N ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S . charAt ( i ) == 'E' ) numE ++ ;
    Edirect [ i ] = numE ;
  }
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int tmp = ( ( i - 1 ) - Edirect [ i - 1 ] ) + ( Edirect [ N ] - Edirect [ i ] ) ;
    if ( tmp < ans ) ans = tmp ;
  }
  System . out . println ( ans ) ;
}
