public static String input ( ) {
  int A , B , C , D ;
  A = Integer . parseInt ( input ( ) ) ;
  B = Integer . parseInt ( input ( ) ) ;
  C = Integer . parseInt ( input ( ) ) ;
  D = Integer . parseInt ( input ( ) ) ;
  a = S . substring ( 0 , A ) + '"' + S . substring ( A , B ) + '"' + S . substring ( B , C ) + '"' + S . substring ( C , D ) + '"' + S . substring ( D ) ;
  return a ;
}
