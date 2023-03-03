@ SafeVarargs public static int sectionSum ( int [ ] numbers , int separate ) {
  int [ ] sep1 = array ( numbers , separate , numbers . length ) ;
  int [ ] sep2 = array ( numbers , 0 , numbers . length - separate ) ;
  int sep3 = sum ( numbers , 0 , numbers . length ) ;
  return insert ( sep3 + cumsum ( sep1 - sep2 ) , 0 , sep3 ) ;
}
