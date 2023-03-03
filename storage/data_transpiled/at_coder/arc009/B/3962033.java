public static List < Pair < String , Integer >> rule = input . nextLine ( ) . split ( " " ) ;
int N = Integer . parseInt ( input . nextLine ( ) ) ;
List < String > inputs = new ArrayList < > ( N ) ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  inputs . add ( String . valueOf ( input . nextLine ( ) ) ) ;
}
List < Pair < String , Integer >> ans = new ArrayList < > ( ) ;
for ( String s : inputs ) {
  ans . add ( new Pair < > ( s , Integer . parseInt ( StringUtils . toString ( rule . indexOf ( s ) ) ) ) ) ;
}
for ( Pair < String , Integer > pair : new ArrayList < > ( ans ) ) {
  System . out . println ( pair . first ) ;
}
return ans ;
}
