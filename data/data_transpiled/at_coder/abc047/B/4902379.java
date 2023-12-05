public static int w = 0 , h = 0 , n = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] x = new int [ n ] ;
int [ ] y = new int [ n ] ;
int [ ] a = new int [ n ] ;
int [ ] white = {
  0 , h , w , 0 }
  ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int [ ] line = new int [ 3 ] ;
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      line [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
    x [ i ] = line [ 0 ] ;
    y [ i ] = line [ 1 ] ;
    a [ i ] = line [ 2 ] ;
  }
  return white [ i ] ;
}
