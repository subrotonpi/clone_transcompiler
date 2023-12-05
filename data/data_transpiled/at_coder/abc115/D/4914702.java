public static int [ ] burger = new int [ 52 ] ;
for ( int i = 0 ;
i < burger . length ;
i ++ ) burger [ i ] = burger [ i - 1 ] * 2 + 3 ;
int [ ] patty = new int [ 52 ] ;
for ( int i = 0 ;
i < patty . length ;
i ++ ) patty [ i ] = patty [ i - 1 ] * 2 + 1 ;
/* solve the number of burger */
int L = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  L ++ ;
}
return patty ;
}
