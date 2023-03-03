@ ai . Function public static Function < List < Integer > , Integer > ai = ai ( ) -> {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int z = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = ai ( ) ;
  if ( n == 1 ) {
    System . out . println ( Math . abs ( a [ a . length - 1 ] - w ) ) ;
  }
  else {
    System . out . println ( Math . max ( Math . abs ( a [ a . length - 1 ] - w ) , Math . abs ( a [ a . length - 1 ] - a [ a . length - 2 ] ) ) ) ;
  }
  return a [ n ] ;
}
