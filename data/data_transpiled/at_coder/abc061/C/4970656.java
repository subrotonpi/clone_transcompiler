public static int [ ] ab = new int [ 10 * 5 + 1 ] ;
int [ ] lis = new int [ 10 ] ;
for ( int i = 0 ;
i < lis [ 0 ] ;
i ++ ) {
  int [ ] t = new int [ lis [ 0 ] ] ;
  for ( int j = 0 ;
  j < lis [ 1 ] ;
  j ++ ) {
    t [ j ] = i ;
  }
  ab [ t [ 0 ] ] += t [ 1 ] ;
}
int ans = 0 ;
int i = 1 ;
int count = 0 ;
while ( count < lis [ 1 ] ) {
  count += ab [ i ] ;
  ans = i ;
  i ++ ;
}
return ans ;
}
