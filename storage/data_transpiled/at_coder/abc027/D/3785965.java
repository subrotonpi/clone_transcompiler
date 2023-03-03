public static void input ( Scanner in ) {
  int [ ] dp = new int [ in . nextInt ( ) ] ;
  int cc = 0 ;
  int Mc = 0 ;
  int hs = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    char st = in . next ( ) ;
    if ( st == 'M' ) Mc ++ ;
    else if ( st == '+' ) hs += Mc ;
    else hs -= Mc ;
  }
  cc = 0 ;
  int len = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) {
    char st = in . next ( ) ;
    if ( st == 'M' ) dp [ cc ++ ] = 1 ;
    else if ( st == '+' ) cc += 2 ;
    else cc -= 2 ;
  }
  Arrays . sort ( dp ) ;
  if ( dp . length > 0 ) {
    int a = Arrays . binarySearch ( dp , Mc / 2 , dp [ cc ++ ] ) ;
    System . out . println ( a - hs ) ;
  }
  else System . out . println ( 0 ) ;
}
