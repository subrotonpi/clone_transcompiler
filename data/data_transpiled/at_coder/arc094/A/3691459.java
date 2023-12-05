public static int [ ] inpl ( ) {
  return Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int A = inpl ( ) ;
  int B = inpl ( ) ;
  int C = inpl ( ) ;
  A = Math . max ( A , B , C ) ;
  B = A + B + C - Math . max ( A , B , C ) - Math . min ( A , B , C ) ;
  C = Math . min ( A , B , C ) ;
  if ( ( B - C ) % 2 == 0 ) System . out . println ( ( 2 * A - B - C ) / 2 ) ;
  else System . out . println ( ( 2 * A - B - C + 3 ) / 2 ) ;
  return new int [ ] {
    A , B , C }
    ;
  }
  