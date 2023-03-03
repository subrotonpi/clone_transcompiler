static final boolean DEBUG = false ;
/* get the list of types */
String [ ] parts = new String [ ] {
}
;
/* get the list of ints */
int [ ] got = new int [ parts . length ] ;
for ( int i : xrange ( parts . length ) ) {
  got [ i ] = types [ i ] . parse ( parts [ i ] ) ;
}
/* get the ints */
String [ ] ints = ints ( ) ;
assert ints . length == 1 ;
/* run the file */
if ( out == null && parts [ 0 ] . startsWith ( "/" ) && parts [ 0 ] . endsWith ( ".in" ) ) {
  out = parts [ 0 ] . substring ( 0 , parts [ 0 ] . length ( ) - 3 ) + ".out" ;
}
/* get the int */
if ( out == null ) {
  out = System . out ;
}
/* run the file */
if ( out == null ) {
  System . out = System . out ;
}
/* run the array of ints */
int [ ] ints = ints ( ) ;
assert ints . length == 1 ;
/* run the array of ints */
if ( ints [ 0 ] . startsWith ( "/" ) ) {
  int [ ] ints = ints ( ) ;
  assert ints [ 0 ] . length ( ) == 1 ;
  int [ ] ints = ints ( ) ;
  assert ints [ 0 ] . length ( ) == 1 ;
  System . out . println ( ints [ 0 ] ) ;
  if ( ints [ 0 ] . startsWith ( "/" ) ) {
    int [ ] ints = ints ( ) ;
    assert ints [ 0 ] . length ( ) == 1 ;
    System . out . println ( ints [ 0 ] ) ;
    System . out . println ( ints [ 0 ] ) ;
  }
}
/* run the array of ints */
int [ ] order = new int [ K ] ;
int [ ] remain = new int [ K + 1 ] ;
int residue = 0 ;
for ( int i : xrange ( 1 , K + 1 ) ) {
  int pos = remain [ ( residue + i - 1 ) % remain . length ] ;
  residue = ( residue + i - 1 ) % remain . length ;
  assert order [ pos - 1 ] == 0 ;
  order