input ;
Set < Integer > l = new HashSet < Integer > ( ) ;
for ( int i : input . split ( " " ) ) l . add ( i ) ;
Set < Integer > m = new HashSet < Integer > ( ) ;
for ( int i : input . split ( " " ) ) m . add ( i ) ;
int a = l . size ( ) & m . size ( ) ;
int s = l . size ( ) + m . size ( ) - a ;
System . out . println ( a / s ) ;
}
