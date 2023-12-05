{
  s = new char [ 50 ] [ 50 ] ;
  for ( int i = 0 ;
  i < 50 ;
  i ++ ) s [ i ] [ 0 ] = '.' ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  a -- ;
  b -- ;
  int a1 = a % 50 , a2 = a / 50 ;
  int b1 = b % 50 , b2 = b / 50 ;
  for ( int i = 0 ;
  i < b2 ;
  i ++ ) for ( int j = 0 ;
  j < 50 ;
  j ++ ) s [ i * 2 ] [ j * 2 ] = '#' ;
  for ( int j = 0 ;
  j < a1 ;
  j ++ ) s [ j ] [ 0 ] = '#' ;
  System . out . println ( 100 + 100 ) ;
  for ( char [ ] i : s ) System . out . println ( i ) ;
}
