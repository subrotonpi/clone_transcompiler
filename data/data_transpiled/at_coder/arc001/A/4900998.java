public static int N = Integer . parseInt ( input ) ;
e = input . next ( ) ;
int [ ] ans = {
  e . count ( '1' ) , e . count ( '2' ) , e . count ( '3' ) , e . count ( '4' ) }
  ;
  return max ( ans ) + min ( ans ) ;
}
