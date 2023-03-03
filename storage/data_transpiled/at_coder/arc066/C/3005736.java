input ;
int sm = 0 ;
int de = 0 ;
int ans = 10 * 15 ;
for ( String s : ( input . nextLine ( ) + "-0" ) . split ( "-" ) ) {
  List < Integer > a = Collections . singletonList ( Integer . parseInt ( s ) ) ;
  if ( sm > 0 ) {
    ans = Math . min ( ans , Math . pow ( a . size ( ) , de ) ) ;
    de += a . get ( 0 ) ;
  }
  sm += Math . pow ( a . size ( ) , de ) ;
}
System . out . println ( sm - 2 * ans ) ;
}
