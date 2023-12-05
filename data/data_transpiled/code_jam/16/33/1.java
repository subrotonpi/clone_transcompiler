private static String f = "c-sample.in" ;
f = "C-small-attempt0.in" ;
f = "C-large.in" ;
List < String > in = CollectionUtils . newArrayList ( ) ;
in . add ( String . valueOf ( f ) . trim ( ) ) ;
{
  int J = 0 ;
  int P = 0 ;
  int S = 0 ;
  int K = 0 ;
  List < List < String >> options = new ArrayList < > ( ) ;
  for ( int j = 0 ;
  j < J ;
  j ++ ) {
    for ( int p = 0 ;
    p < P ;
    p ++ ) {
      for ( int k = 0 ;
      k < Math . min ( S , K ) ;
      k ++ ) {
        options . add ( Arrays . asList ( j , p , ( j + p + k ) % S ) ) ;
      }
    }
  }
  int N = J * P * Math . min ( S , K ) ;
  return Integer . toString ( N ) + "\n" + Joiner . on ( "\n" ) . join ( options ) ;
}
int t = 1 ;
while ( in . size ( ) > 0 ) {
  List < String > vals = CollectionUtils . newArrayList ( ) ;
  for ( String s : in . remove ( 0 ) . split ( " " ) ) {
    vals . add ( s ) ;
  }
  System . out . println ( "Case #" + t + ": " + solve ( ( List < String > ) vals ) ) ;
  t ++ ;
}
return "" ;
}
