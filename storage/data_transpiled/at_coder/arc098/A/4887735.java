@ Sys public static void main ( String in ) {
  int n = Integer . parseInt ( in . replaceAll ( " " , "" ) ) ;
  String s = in . replaceAll ( " " , "" ) ;
  int [ ] wl = new int [ n ] ;
  int [ ] el = new int [ n ] ;
  int [ ] ans = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) wl [ i ] = wl [ i ] + s . charAt ( i ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) el [ i ] = el [ i ] + s . charAt ( i ) - s . charAt ( i ) ;
  System . out . println ( min ( ans ) ) ;
}
