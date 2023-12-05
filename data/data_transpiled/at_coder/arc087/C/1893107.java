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
int [ ] [ ] Trie = new int [ N ] [ ] ;
for ( String S : Ss ) {
  int iT = 0 ;
  for ( int c : map . keySet ( ) ) {
    if ( Trie [ iT ] [ c ] == - 1 ) {
      Trie [ iT ] [ c ] = - 1 ;
      Trie [ iT ] [ c ] = Trie . length - 1 ;
    }
    iT = Trie [ iT ] [ c ] ;
  }
}
Map < Integer , Integer > Hgts = new HashMap < Integer , Integer > ( ) ;
Stack < Integer > stack = new Stack < Integer > ( ) ;
stack . add ( new Integer ( 0 ) ) ;
stack . add ( new Integer ( L + 1 ) ) ;
while ( stack . size ( ) > 0 ) {
  int iT = stack . pop ( ) ;
  int Hgt = stack . pop ( ) ;
  int num = 0 ;
  for ( int c : Trie [ iT ] ) {
    if ( c != - 1 ) {
      stack . push ( new Integer ( c ) ) ;
      Hgt = Hgt - 1 ;
      num ++ ;
    }
  }
  if ( num == 1 ) Hgts . put ( Hgt - 1 , Hgts . getOrDefault ( Hgt - 1 , 0 ) + 1 ) ;
}
ans = 0 ;
for ( Map . Entry < Integer , Integer > entry : Hgts . entrySet ( ) ) {
  if ( entry . getValue ( ) % 2 != 0 ) ans ^= getGrundyNumber ( entry . getKey ( ) ) ;
}
if ( ans > 0 ) System . out . println ( "Alice" ) ;
else System . out . println ( "Bob" ) ;
return ans ;
}
