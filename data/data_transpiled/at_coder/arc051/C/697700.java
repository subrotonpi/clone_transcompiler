public static int MOD = 1000000007 ;
int N = Integer . parseInt ( input . readLine ( ) ) ;
int A = Integer . parseInt ( input . readLine ( ) ) ;
int B = Integer . parseInt ( input . readLine ( ) ) ;
int [ ] arr = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  arr [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
}
Arrays . sort ( arr ) ;
if ( A == 1 ) {
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    System . out . println ( arr [ j ] % MOD ) ;
  }
  exit ( ) ;
}
int count = 0 ;
for ( int i = 0 ;
i < B ;
i ++ ) {
  if ( arr [ 0 ] * A > arr [ arr . length - 1 ] ) {
    break ;
  }
  count ++ ;
  arr [ 0 ] *= A ;
  Arrays . sort ( arr ) ;
}
B -= count ;
for ( int i = 0 ;
i < B % N ;
i ++ ) {
  arr [ i ] *= A ;
}
Arrays . sort ( arr ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  arr [ i ] %= MOD ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  arr [ i ] *= Math . pow ( A % MOD , B / N ) ;
}
for ( int i = 0 ;
i < N ;
i ++ ) {
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    System . out . println ( arr [ j ] % MOD ) ;
  }
  exit ( ) ;
}
return N ;
}
