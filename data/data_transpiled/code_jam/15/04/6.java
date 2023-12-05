static boolean valid ( int X , int R , int C ) {
  if ( ( R * C ) % X != 0 ) return false ;
  if ( X >= 7 ) return false ;
  if ( R < X && C < X ) return false ;
  Map < Integer , Boolean > validX = new HashMap < Integer , Boolean > ( ) ;
  validX . put ( 1 , new Boolean ( true ) ) ;
  validX . put ( 2 , new Boolean ( true ) ) ;
  validX . put ( 3 , new Boolean ( true ) ) ;
  validX . put ( 4 , new Boolean ( true ) ) ;
  validX . put ( 5 , new Boolean ( true ) ) ;
  validX . put ( 6 , new Boolean ( true ) ) ;
  return validX . get ( X ) . booleanValue ( ) ;
}
