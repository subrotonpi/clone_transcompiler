, n ) ;
int tmp = 0 ;
int ans = 1 ;
for ( int i = 0 ;
i < a . length - 1 ;
i ++ ) {
  int dif = a [ i + 1 ] - a [ i ] ;
  if ( tmp == 0 ) {
    tmp = dif ;
  }
  else if ( dif * tmp < 0 ) {
    ans ++ ;
    tmp = 0 ;
  }
}
System . out . println ( ans ) ;
}
