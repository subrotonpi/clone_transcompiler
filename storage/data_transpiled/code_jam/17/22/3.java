@ Test public static String TEST = "large" ;
final String IN = "B-" + TEST + ".in" ;
final String OUT = "B-" + TEST + ".out" ;
final String IMP = "IMPOSSIBLE" ;
{
  assert r + o + y + g + b + v == n ;
  if ( g > 0 ) {
    if ( g > r ) return IMP ;
    if ( g == r ) {
      if ( n > 2 * g ) return IMP ;
      return "GR" . substring ( g ) ;
    }
    r -= g ;
  }
  if ( v > 0 ) {
    if ( v > y ) return IMP ;
    if ( v == y ) {
      if ( n > 2 * v ) return IMP ;
      return "VY" . substring ( v ) ;
    }
    y -= v ;
  }
  if ( o > 0 ) {
    if ( o > b ) return IMP ;
    if ( o == b ) {
      if ( n > 2 * o ) return IMP ;
      return "OB" . substring ( o ) ;
    }
    b -= o ;
  }
  int nn = r + y + b ;
  if ( Math . max ( r , y , b ) > nn / 2 ) return IMP ;
  List < StringChunk > cols = new ArrayList < StringChunk > ( ) ;
  cols . add ( new StringChunk ( r , "R" ) ) ;
  cols . add ( new StringChunk ( y , "Y" ) ) ;
  cols . add ( new StringChunk ( b , "B" ) ) ;
  Collections . sort ( cols , Collections . reverseOrder ( ) ) ;
  String s = Joiner . on ( "" ) . join ( cols ) ;
  String s1 ;
  String s2 ;
  String part = "" ;
  if ( nn % 2 == 0 ) {
    s1 = s . substring ( 0 , nn / 2 ) ;
    s2 = s . substring ( nn / 2 ) ;
    part = "" ;
  }
  else {
    s1 = s . substring ( 0 , nn / 2 ) ;
    s2 = s . substring ( nn / 2 + 1 ) ;
    part = s . substring ( nn / 2 ) ;
  }
  s = Joiner . on ( "" ) . join ( s1 ) + part ;
  if ( g > 0 ) s = s . replace ( "R" , "R" + "GR" . substring ( g ) , 1 ) ;
  if ( v > 0 ) s = s . replace ( "Y" , "