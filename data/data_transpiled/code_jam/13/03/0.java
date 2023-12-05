@ result static int searchNotLargeThan ( int x ) throws IOException {
  if ( x < ans [ 0 ] ) return 0 ;
  int L = 0 , R = ans . length ;
  while ( R - L > 1 ) {
    int M = ( L + R ) / 2 ;
    if ( ans [ M ] <= x ) L = M ;
    else R = M ;
  }
  String content = "" ;
  String [ ] inputs = Files . readAllLines ( Paths . get ( "in.txt" ) ) ;
  for ( int i = 1 ;
  i < inputs . length ;
  i ++ ) {
    L = new Integer ( inputs [ i ] . replace ( ' ' , ',' ) ) ;
    R = new Integer ( inputs [ i ] . replace ( ' ' , ',' ) ) ;
  }
  Files . write ( Paths . get ( "out.txt" ) , content ) ;
  return 0 ;
}
