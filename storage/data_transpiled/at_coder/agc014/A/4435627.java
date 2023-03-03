public static int [ ] [ ] a , int b , int c ;
List < int [ ] > l = new ArrayList < > ( ) ;
int count = 0 ;
if ( StringUtils . isEmpty ( a % 2 ) ) {
  System . out . println ( 0 ) ;
  exit ( ) ;
}
do {
  a = a / 2 ;
  b = b / 2 ;
  c = c / 2 ;
  a = b + c ;
  b = a + c ;
  c = a + b ;
  count ++ ;
}
while ( StringUtils . isEmpty ( a % 2 ) ) ;
if ( StringUtils . isEmpty ( b % 2 ) ) {
  System . out . println ( count ) ;
  exit ( ) ;
}
else if ( l . contains ( Arrays . asList ( a , b , c ) ) ) {
  System . out . println ( - 1 ) ;
  exit ( ) ;
}
l . add ( Arrays . asList ( a , b , c ) ) ;
return l . toArray ( ) ;
}
