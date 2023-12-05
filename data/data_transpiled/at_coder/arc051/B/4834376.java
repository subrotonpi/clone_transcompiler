, a = 1 , b = 2 ;
for ( int i = 0 ;
i < ( int ) input . length ( ) - 1 ;
i ++ ) {
  a = b , b = a + b ;
}
System . out . println ( b + " " + a ) ;
}
