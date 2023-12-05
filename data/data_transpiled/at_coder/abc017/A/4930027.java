public static double p = 0.0 ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  long [ ] l = new long [ 3 ] ;
  for ( int j = 0 ;
  j < 3 ;
  j ++ ) l [ j ] = ( long ) input . nextDouble ( ) ;
  p += l [ 0 ] * l [ 1 ] * 0.1 ;
}
System . out . println ( ( int ) p ) ;
return p ;
}
