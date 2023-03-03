{
  fib = new int [ 50 ] ;
}
for ( int i = 0 ;
i < 50 ;
i ++ ) {
  fib [ i ] = fib [ fib . length - 1 ] + fib [ fib . length - 2 ] ;
}
