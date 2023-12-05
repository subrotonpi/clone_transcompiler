, x = new int [ ] , y = new int [ ] ;
for ( int i = 0 ;
i < x . length ;
i ++ ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < b ) x [ i ] = new int [ ] {
    a , a - b }
    ;
    else y [ i ] = new int [ ] {
      a , b }
      ;
    }
    