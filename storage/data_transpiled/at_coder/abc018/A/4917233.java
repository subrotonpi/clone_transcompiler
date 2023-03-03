[ 3 ] ;
List < Integer > l = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < 3 ;
i ++ ) l . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
List < Integer > s = new ArrayList < Integer > ( l ) ;
s . sort ( 0 , l . size ( ) - 1 ) ;
for ( int i : l ) System . out . println ( s . indexOf ( i ) + 1 ) ;
return s ;
}
