{
  month = [ 31 , 28 , 31 , 30 , 31 , 30 , 31 , 31 , 31 , 30 , 31 , 30 , 31 ] ;
  int [ ] S = new int [ 3 ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  while ( S [ 0 ] / S [ 1 ] / S [ 2 ] != S [ 0 ] / S [ 1 ] / S [ 2 ] ) {
    int Y = S [ 0 ] ;
    boolean flag = false ;
    if ( Y % 400 == 0 ) flag = true ;
    else if ( Y % 100 == 0 ) flag = false ;
    else if ( Y % 4 == 0 ) flag = true ;
    int m = 0 ;
    if ( S [ 1 ] == 2 && flag ) {
      S [ 2 ] = 1 ;
      S [ 0 ] ++ ;
    }
  }
  return S ;
}
