static public String findsol ( int X , int R , int C ) throws IOException {
  final int tmp ;
  if ( ( R < C ) && ( C < tmp ) ) {
    tmp = R ;
    R = C ;
    C = tmp ;
  }
  if ( ( R < X ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( X >= 7 ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( X == 1 ) && ( C < tmp ) ) {
    return "GABRIEL" ;
  }
  if ( ( R * C % X > 0 ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( X == 2 ) && ( C < tmp ) ) {
    return "GABRIEL" ;
  }
  if ( ( X == 3 ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( R * C % X > 0 ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( X == 4 ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( R * C % X > 0 ) && ( C * C % X > 0 ) ) {
    return "RICHARD" ;
  }
  if ( ( X == 5 ) && ( C < tmp ) ) {
    return "RICHARD" ;
  }
  if ( ( R * C % X > 0 ) && ( C * C % X > 0 ) ) {
    return "RICHARD" ;
  }
  if ( ( R * C % X > 0 ) && ( C * C % X > 0 ) ) {
    return "RICHARD" ;
  }
  if ( ( R * C % X > 0 ) && ( C * C % X > 0 ) ) {
    return "RICHARD" ;
  }
  if ( ( R * C % X > 0 ) && ( C * C % X > 0 ) ) {
    return "RICHARD" ;
  }
  return "GABRIEL" ;
}
