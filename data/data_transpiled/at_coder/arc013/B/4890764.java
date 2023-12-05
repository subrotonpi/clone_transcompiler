public static double d = 0 , e = 0 , f = 0 ;
for ( int i = 0 ;
i < Integer . parseInt ( input . nextLine ( ) ) ;
i ++ ) {
  double [ ] a = new double [ 3 ] ;
  a [ 0 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  a [ 1 ] = Integer . parseInt ( input . nextLine ( ) ) ;
  d = Math . max ( d , a [ 0 ] ) ;
  e = Math . max ( e , a [ 1 ] ) ;
  f = Math . max ( f , a [ 2 ] ) ;
}
return d * e * f ;
}
