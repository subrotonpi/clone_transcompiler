static final int [ ] [ ] R = new int [ R ] [ C ] , K = new int [ C ] ;
int n = Integer . parseInt ( input ) ;
int [ ] rCandy = new int [ R ] ;
int [ ] cCandy = new int [ C ] ;
ArrayList < Pair < Integer , Integer >> candy = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  int r = Integer . parseInt ( input ) ;
  int c = Integer . parseInt ( input ) ;
  rCandy [ r - 1 ] ++ ;
  cCandy [ c - 1 ] ++ ;
  candy . add ( new Pair < > ( r - 1 , c - 1 ) ) ;
}
int ans = 0 ;
for ( int i = 0 ;
i < candy . size ( ) ;
i ++ ) {
  if ( rCandy [ candy . get ( i ) . x ] + cCandy [ candy . get ( i ) . y ] == K ) ans -- ;
  else if ( rCandy [ candy . get ( i ) . x ] + cCandy [ candy . get ( i ) . y ] == K ) ans ++ ;
}
return candy . toArray ( ) ;
}
