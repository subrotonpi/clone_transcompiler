static int a , int b , int c = 0 , 0 , 1 ;
for ( int i = 0 ;
i < ( int ) input . length ( ) - 1 ;
i ++ ) {
  a = b ;
  b = c ;
  c = ( a + b + c ) % 10007 ;
}
System . out . println ( a ) ;
}
