private static final String alphabet = "abcdefghijklmnopqrstuvwxyz" ;
final long MOD = 1000000007 ;
final char [ ] [ ] compress = new char [ alphabet . length ] [ alphabet . length ] ;
for ( int i = 0 ;
i < alphabet . length ;
i ++ ) {
  assert alphabet [ i ] . length > 0 ;
  char [ ] s2 = alphabet [ i ] ;
  for ( int j = 0 ;
  j < s2 . length ;
  j ++ ) {
    if ( alphabet [ i ] != s2 [ j ] ) {
      s2 [ j ] ++ ;
    }
  }
  if ( used [ i ] > 0 ) return 0 ;
  out *= Math . factorial ( single [ i ] ) ;
  used [ i ] ++ ;
  out %= MOD ;
}
int num = 0 ;
for ( char c : alphabet ) {
  if ( used [ c ] > 0 && ( numpref [ c ] > 0 || single [ c ] > 0 ) ) {
    ++ num ;
    out *= Math . factorial ( num ) ;
  }
}
for ( int i = 0 ;
i < alphabet . length ;
i ++ ) {
  String [ ] s = Arrays . copyOfRange ( alphabet [ i ] , 0 , alphabet . length ) ;
  Set < Character > used = new HashSet < Character > ( ) ;
  char prev = '\0' ;
  boolean works = true ;
  for ( char c : s ) {
    if ( c != prev ) {
      if ( used . contains ( c ) ) {
        works = false ;
        break ;
      }
      else {
        used . add ( c ) ;
        prev = c ;
      }
    }
  }
  if ( works ) ++ out ;
  out %= MOD ;
  System . out . println ( "Case #" + testnum + ": " + out ) ;
}
{
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] l = input . split ( " " ) ;
  assert l . length == n ;
  final Map < Character , Integer > numpref = Maps . newHashMap ( ) ;
  final Map < Character , Integer > numsuf = Maps . newHashMap ( ) ;
  final Map < Character , Integer > internal = Maps . newHashMap ( ) ;
  final Map < Character , Integer > single = Maps . newHashMap ( ) ;
  for ( char c : l ) {
    if ( used . contains ( c ) ) {
      ++ numpref . get ( c ) ;
    }
    else {
      ++ numpref . get ( c ) ;
      ++ numsuf . get ( s . length - 1 ) ;
    }
  }
  if ( s . length