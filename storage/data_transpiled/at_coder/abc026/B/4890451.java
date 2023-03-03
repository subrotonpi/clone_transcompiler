[ ] r = new int [ Integer . numberOfTrailingZeros ] ;
for ( int i = 0 ;
i < r . length ;
i ++ ) {
  r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
Collections . sort ( r ) ;
double ans = 0 ;
for ( int i = 0 ;
i < r . length ;
i ++ ) {
  ans += r [ i ] ;
}
return ans * Math . PI ;
}
