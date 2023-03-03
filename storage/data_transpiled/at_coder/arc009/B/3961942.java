static HashMap < String , Integer > rule = new HashMap < String , Integer > ( ) {
  private static final long serialVersionUID = - 5743705268827395184L ;
  @ Override public int size ( ) {
    return super . size ( ) ;
  }
  @ Override public Integer get ( String input ) {
    return super . get ( input ) ;
  }
}
;
for ( int index = 0 ;
index < input . length ( ) ;
index ++ ) {
  rule . put ( String . valueOf ( input . charAt ( index ) ) , String . valueOf ( index ) ) ;
}
int N = Integer . parseInt ( input . substring ( 0 , input . length ( ) - 1 ) ) ;
List < String > inputs = new ArrayList < String > ( N ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  inputs . add ( String . valueOf ( input . charAt ( i ) ) ) ;
}
List < Pair < String , Integer >> ans = new ArrayList < Pair < String , Integer >> ( ) ;
for ( String [ ] array : inputs ) {
  String cast = "" ;
  for ( String string : array ) {
    cast += rule . get ( string ) ;
  }
  ans . add ( new Pair < String , Integer > ( array , Integer . parseInt ( cast ) ) ) ;
}
for ( Pair < String , Integer > pair : new ArrayList < Pair < String , Integer >> ( ans ) ) {
  System . out . println ( pair . first ) ;
}
return ans . size ( ) ;
}
