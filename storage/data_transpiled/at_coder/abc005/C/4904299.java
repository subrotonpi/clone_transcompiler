public static String T = Integer . toString ( input ) ;
int N = Integer . parseInt ( input ) ;
int [ ] A = new int [ N ] ;
int M = Integer . parseInt ( input ) ;
int [ ] B = new int [ M ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  A [ i ] = Integer . parseInt ( input ) ;
}
/* Solution to the solution */
int ai = 0 ;
int bi = 0 ;
while ( bi < B . length ) {
  if ( ai >= A . length ) return "no" ;
  if ( A [ ai ] > B [ bi ] ) return "no" ;
  if ( A [ ai ] + T < B [ bi ] ) {
    ai ++ ;
  }
  else {
    ai ++ ;
    bi ++ ;
  }
}
System . out . println ( solution ) ;
return "" ;
}
