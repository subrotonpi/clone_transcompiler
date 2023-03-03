static final long B = 1000000007 ;
int [ ] [ ] list = new int [ list . length ] [ ] ;
for ( int i : xrange ( list . length ) ) {
  long num = 1 ;
  for ( int j : xrange ( i ) ) {
    if ( list [ j ] < list [ i ] ) num += table [ j ] ;
  }
  table [ i ] [ j ] = num % B ;
}
final String next = new Scanner ( System . in ) . next ( ) ;
final int ncases = Integer . parseInt ( next ) ;
for ( int i : xrange ( ncases ) ) {
  final int n = Integer . parseInt ( next ) ;
  final int m = Integer . parseInt ( next ) ;
  final int x = Integer . parseInt ( next ) ;
  final int y = Integer . parseInt ( next ) ;
  final int z = Integer . parseInt ( next ) ;
  final int [ ] seq = new int [ n ] ;
  for ( int j : xrange ( m ) ) {
    seq [ j ] = Integer . parseInt ( next ) ;
  }
  final int [ ] realseq = new int [ n ] ;
  for ( int j : xrange ( n ) ) {
    realseq [ j ] = seq [ j % m ] ;
    seq [ j % m ] = ( int ) ( ( x * seq [ j % m ] + y * ( j + 1 ) ) % z ) ;
  }
  final long numsubseqs = process ( realseq ) ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + numsubseqs ) ;
  System . out . flush ( ) ;
}
return Arrays . copyOf ( list , list . length ) ;
}
