@ ai public static Function < Integer , Integer > ai = ai ( ) -> Collections . frequency ( Integer . parseInt ( input . nextLine ( ) ) ) ;
Function < Integer , Integer > ai_ = ai ( ) ;
String s = input . nextLine ( ) . split ( "T" ) ;
Integer x = ai ( ) ;
Integer y = ai ( ) ;
int [ ] xx = new int [ s . length ( ) ] , yy = new int [ s . length ( ) ] ;
int c = 0 ;
for ( int i = 0 ;
i < s . length ( ) ;
i ++ ) {
  if ( i % 2 != 0 ) yy [ c ++ ] = s . charAt ( i ) . length ( ) ;
  else xx [ c ++ ] = s . charAt ( i ) . length ( ) ;
}
Set < Integer > anx = new HashSet < Integer > ( ) ;
for ( int i = 0 ;
i < xx . length ;
i ++ ) {
  if ( i == 0 ) anx = new HashSet < Integer > ( xx [ i ] ) ;
  else {
    Set < Integer > aanx = new HashSet < Integer > ( ) ;
    for ( int j : anx ) {
      aanx . add ( j + xx [ i ] ) ;
      aanx . add ( j - xx [ i ] ) ;
    }
    anx = aanx ;
  }
}
Set < Integer > any = new HashSet < Integer > ( ) ;
for ( int i = 0 ;
i < yy . length ;
i ++ ) {
  Set < Integer > aany = new HashSet < Integer > ( ) ;
  for ( int j : any ) {
    aany . add ( j + yy [ i ] ) ;
    aany . add ( j - yy [ i ] ) ;
  }
  any = aany ;
}
if ( anx . contains ( x ) && any . contains ( y ) ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return ai_ ;
}
