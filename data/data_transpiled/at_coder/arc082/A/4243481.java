static int [ ] s = new int [ 10 * 5 + 2 ] ;
int n = Integer . parseInt ( input ) ;
int [ ] a = new int [ n ] ;
for ( int i = 0 ;
i < a . length ;
i ++ ) {
  s [ i - 1 ] ++ ;
  s [ i ] ++ ;
  s [ i + 1 ] ++ ;
}
System . out . println ( max ( s ) ) ;
return s ;
}
