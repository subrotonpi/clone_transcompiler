static final double [ ] [ ] getPoints ( ) {
  int txa = Integer . parseInt ( input . readLine ( ) ) ;
  int tya = Integer . parseInt ( input . readLine ( ) ) ;
  int txb = Integer . parseInt ( input . readLine ( ) ) ;
  int tyb = Integer . parseInt ( input . readLine ( ) ) ;
  double t = Double . parseDouble ( input . readLine ( ) ) ;
  double v = Double . parseDouble ( input . readLine ( ) ) ;
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] girls = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    girls [ i ] = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      girls [ i ] [ j ] = Integer . parseInt ( input . readLine ( ) ) ;
    }
  }
  int ok = 0 ;
  for ( int i = 0 ;
  i < girls . length ;
  i ++ ) {
    double x = girls [ i ] [ 0 ] ;
    double y = girls [ i ] [ 1 ] ;
    double dis = Math . sqrt ( ( x - txa ) * ( x - txa ) + ( y - tya ) * ( y - tya ) ) + Math . sqrt ( ( x - txb ) * ( x - txb ) + ( y - tyb ) * ( y - tyb ) ) ;
    if ( dis / v <= t ) {
      ok = 1 ;
      break ;
    }
  }
  if ( ok == 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return girls ;
}
