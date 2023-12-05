@ SafeVarargs public static int sectionSum ( List < Integer > numbers , int separate ) {
  int sep1 = array ( numbers . subList ( separate , numbers . size ( ) ) ) ;
  int sep2 = array ( numbers . subList ( 0 , numbers . size ( ) - separate ) ) ;
  int sep3 = sum ( numbers ) ;
  return insert ( sep3 + cumsum ( sep1 - sep2 ) , 0 , sep3 ) ;
}
