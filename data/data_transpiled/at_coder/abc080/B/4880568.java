input ;
N = input . nextInt ( ) ;
x = Integer . parseInt ( N ) ;
fx = Integer . parseInt ( Collections . nCopies ( N , Integer . MAX_VALUE ) ) ;
if ( x % fx == 0 ) {
  System . out . println ( "Yes" ) ;
}
else {
  System . out . println ( "No" ) ;
}
return x ;
}
