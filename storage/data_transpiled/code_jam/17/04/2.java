@ org . python . Method ( __doc__ = "" ) public static void main ( String [ ] args ) {
  org . python . util . Map < String , Integer > prob = new org . python . util . Map < String , Integer > ( ) {
    @ org . python . types . FunctionType ( int . class ) public Integer apply ( org . python . types . FunctionType f ) {
      System . err . println ( f ) ;
      return 0 ;
    }
  }
  ;
  org . python . util . Map < String , Integer > ln = new org . python . util . Map < String , Integer > ( ) {
    @ org . python . types . FunctionType ( int . class ) public Integer apply ( org . python . types . FunctionType f ) {
      return Integer . parseInt ( f . toString ( ) ) ;
    }
  }
  ;
  org . python . util . Map < String , Integer > res = new org . python . util . Map < String , Integer > ( ) ;
  org . python . util . Map < String , Integer > prob = new org . python . util . Map < String , Integer > ( ) ;
  org . python . util . Map < String , Integer > prob = new org . python . util . Map < String , Integer > ( ) ;
  prob . setSolver ( prob ) ;
  prob . solve ( ) ;
  Set < Pair < Integer , Integer >> res = new HashSet < Pair < Integer , Integer >> ( ) ;
  for ( org . python . util . Map . Entry < String , Integer > e : prob . entrySet ( ) ) {
    if ( e . getValue ( ) . varValue ( ) == 1 ) {
      res . add ( Pair . of ( "+" , e . getKey ( ) , e . getValue ( ) ) ) ;
    }
  }
  for ( org . python . types . FunctionType f : prob . entrySet ( ) ) {
    if ( e . getValue ( ) . varValue ( ) == 1 ) {
      res . add ( Pair . of ( "x" , e . getKey ( ) , e . getValue ( ) ) ) ;
    }
  }
  for ( org . python . types . FunctionType f : prob . entrySet ( ) ) {
    if ( e . getValue ( ) . varValue ( ) == 1 ) {
      res . add ( Pair . of ( "o" , e . getKey ( ) , e . getValue ( ) ) ) ;
    }
  }
  for ( org . python . types . FunctionType f : prob . entrySet ( ) ) {
    if ( f .