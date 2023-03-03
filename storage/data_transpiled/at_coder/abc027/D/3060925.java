input ;
int S = input . nextInt ( ) ;
int plus = S . indexOf ( "+" ) , minus = S . indexOf ( "-" ) ;
int M = S . length ( ) - plus - minus ;
int [ ] RL = new int [ M ] ;
for ( int i = 0 ;
i < S . length ( ) ;
i ++ ) {
  if ( S . charAt ( i ) == 'M' ) {
    RL [ i ] = plus - minus ;
  }
  else if ( S . charAt ( i ) == '+' ) {
  }
  else {
  }
}
Arrays . sort ( RL ) ;
int total = 0 ;
for ( int i = 0 ;
i < M / 2 ;
i ++ ) {
  total -= RL [ i ] ;
}
for ( int i = 0 ;
i < M ;
i ++ ) {
  total += RL [ i ] ;
}
return total ;
}
