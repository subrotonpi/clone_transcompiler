public static int [ ] [ ] a , int [ ] b = new int [ ] [ ] {
}
;
for ( int i = 0 ;
i < a . length ;
i ++ ) {
  a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  b [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
if ( a [ i ] % b == 0 ) {
  System . out . println ( 0 ) ;
}
else {
  System . out . println ( 1 ) ;
}
return a ;
}
