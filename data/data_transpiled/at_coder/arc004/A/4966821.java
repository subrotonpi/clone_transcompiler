public static int N = Integer . parseInt ( input ) {
  List < List < Integer >> xy = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) xy . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int [ ] [ ] lenList = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) for ( int j = 0 ;
  j < N ;
  j ++ ) lenList [ i ] [ j ] = ( xy . get ( i ) . get ( 0 ) - xy . get ( j ) . get ( 0 ) ) * ( xy . get ( i ) . get ( 1 ) - xy . get ( j ) . get ( 1 ) ) ;
  lenList = Arrays . stream ( lenList ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
  System . out . println ( Math . max ( lenList , 0.5 ) ) ;
  return lenList . length ;
}
