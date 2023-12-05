public static int H = ( int ) input . nextInt ( ) ;
int W = ( int ) input . nextInt ( ) ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int [ ] A = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int [ ] C = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  for ( int j = 0 ;
  j < A [ i ] ;
  j ++ ) {
    C [ j ] = i + 1 ;
  }
}
int [ ] [ ] ans = new int [ H ] [ W ] ;
for ( int i = 0 ;
i < H * W ;
i ++ ) {
  int y = i / W ;
  int x ;
  if ( y % 2 == 0 ) {
    x = i % W ;
  }
  else {
    x = W - 1 - i % W ;
  }
  ans [ y ] [ x ] = C [ i ] ;
}
for ( int i = 0 ;
i < H ;
i ++ ) {
  ans [ i ] = Arrays . copyOf ( ans [ i ] , i ) ;
  System . out . println ( Arrays . toString ( ans [ i ] ) ) ;
}
return H ;
}
