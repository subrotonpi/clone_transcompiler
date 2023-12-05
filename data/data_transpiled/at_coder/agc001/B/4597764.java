, n ) ;
x = input . nextInt ( ) ;
total = n ;
a = x ;
b = n - x ;
while ( a > 0 ) {
  total += ( a * 2 ) * ( b / a ) ;
  a = b % a ;
  b = a ;
}
System . out . println ( total - b ) ;
}
