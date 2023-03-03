@ Function public static Integer iipt = new Function ( ) {
  @ Override public Integer apply ( String input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
Function < String , Integer > miipt = new Function < String , Integer > ( ) {
  @ Override public Integer apply ( String input ) {
    return Integer . parseInt ( input ) ;
  }
}
;
@ SuppressWarnings ( "unused" ) Integer n = iipt . apply ( ) ;
List < Integer > hs = new ArrayList < Integer > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  hs . add ( miipt . apply ( i ) ) ;
}
int a = 0 ;
int b = ( int ) 1e15 ;
while ( b - a > 1 ) {
  int c = ( a + b ) / 2 ;
  List < Integer > tl = new ArrayList < Integer > ( ) ;
  for ( Integer h : hs ) tl . add ( ( c - h ) / s ) ;
  if ( Arrays . binarySearch ( tl , i ) <= 0 ) {
    b = c ;
  }
  else {
    a = c ;
  }
}
System . out . println ( b ) ;
return b ;
}
