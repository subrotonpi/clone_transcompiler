private static void rule = new HashMap < String , Integer > ( ) {
  for ( int index = 0 ;
  index < input . length ;
  index ++ ) {
    rule . put ( String . valueOf ( input . charAt ( index ) ) , String . valueOf ( index ) ) ;
  }
  int N = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
  String [ ] inputs = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inputs [ i ] = String . valueOf ( input . charAt ( i ) ) ;
  }
}
List < Pair < String , Integer >> ans = new ArrayList < > ( ) ;
for ( String s : inputs ) {
  ans . add ( new Pair < > ( s , Integer . parseInt ( StringUtils . join ( rule . get ( s ) , "" ) ) ) ) ;
}
for ( Pair < String , Integer > pair : ans ) {
  System . out . println ( pair . first ) ;
}
}
