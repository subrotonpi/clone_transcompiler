static int getGrundyNumber ( int x ) {
  int ans = 1 ;
  while ( x % ( ans * 2 ) == 0 ) ans *= 2 ;
  return ans ;
}
N = Integer . parseInt ( input . nextLine ( ) ) ;
L = Integer . parseInt ( input . nextLine ( ) ) ;
String [ ] Ss = new String [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) Ss [ i ] = input . nextLine ( ) ;
Arrays . sort ( Ss ) ;
Map < Integer , Integer > Hgts = new HashMap < > ( L ) ;
String prev = "_" ;
for ( String S : Ss ) {
  for ( int iS = 0 ;
  iS < S ;
  iS ++ ) {
    final char a = S . charAt ( iS ) ;
    if ( a != b ) {
      Hgts . put ( L - iS , -- i ) ;
      for ( int h = L - S . length ( ) + 1 ;
      h <= L - iS ;
      h ++ ) {
        Hgts . put ( h , Hgts . get ( h ) + 1 ) ;
      }
      break ;
    }
  }
  prev = S ;
}
ans = 0 ;
for ( Map . Entry < Integer , Integer > Hgt : Hgts . entrySet ( ) ) {
  if ( Hgt . getValue ( ) % 2 != 0 ) ans ^= getGrundyNumber ( Hgt . getKey ( ) ) ;
}
if ( ans > 0 ) System . out . println ( "Alice" ) ;
else System . out . println ( "Bob" ) ;
return ans ;
}
