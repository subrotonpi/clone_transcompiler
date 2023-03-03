public static boolean tryAllDirections ( char [ ] [ ] grid , int R , int C , int i , int j ) {
  for ( char dir = '^' ;
  dir <= 'v' ;
  dir ++ ) {
    boolean success = tryDirection ( grid , R , C , i , j , dir ) ;
    if ( ( success ) && ( ! success ) ) {
      return true ;
    }
  }
  return false ;
}
