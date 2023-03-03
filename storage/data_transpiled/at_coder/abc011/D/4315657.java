static final int n = Integer . parseInt ( input ) {
  int d = input . nextInt ( ) ;
  int x = input . nextInt ( ) ;
  int y = input . nextInt ( ) ;
  if ( x % d != 0 || y % d != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int x_times = Math . abs ( x ) / d ;
  int y_times = Math . abs ( y ) / d ;
  int nokori = n - x_times - y_times ;
  if ( nokori < 0 || nokori % 2 == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int ans = 0 ;
  int teisu = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    teisu = teisu * i ;
  }
  for ( int nokori_x_times = 0 ;
  nokori_x_times <= n ;
  nokori_x_times += 2 ) {
    ans = ans + teisu / ( Math . factorial ( nokori_x_times / 2 ) * Math . factorial ( x_times + nokori_x_times / 2 ) * Math . factorial ( y_times + ( nokori - nokori_x_times ) / 2 ) * Math . factorial ( ( nokori - nokori_x_times ) / 2 ) ) ;
  }
  System . out . println ( ans / ( 4 * n ) ) ;
}
