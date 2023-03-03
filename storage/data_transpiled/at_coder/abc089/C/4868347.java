static final int [ ] [ ] M = new int [ 3 ] [ 3 ] ;
String [ ] A = new String [ 3 ] ;
String [ ] R = new String [ 3 ] ;
String [ ] C = new String [ 3 ] ;
String [ ] H = new String [ 3 ] ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  String s = String . valueOf ( input . next ( ) ) ;
  switch ( s . charAt ( 0 ) ) {
    case 'M' : M [ i ] [ 0 ] = s ;
    break ;
    case 'A' : A [ i ] [ 0 ] = s ;
    break ;
    case 'R' : R [ i ] [ 0 ] = s ;
    break ;
    case 'C' : C [ i ] [ 0 ] = s ;
    break ;
    case 'H' : H [ i ] [ 0 ] = s ;
    break ;
  }
}
List < List < String >> L = new ArrayList < List < String >> ( ) ;
if ( M . size ( ) > 0 ) L . add ( M ) ;
if ( A . size ( ) > 0 ) L . add ( A ) ;
if ( R . size ( ) > 0 ) L . add ( R ) ;
return L . toArray ( ) ;
}
