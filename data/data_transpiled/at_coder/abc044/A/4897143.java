public static int N , K , X , Y = ( int ) input ( ) ;
int result ;
if ( N > K ) {
  result = K * X + ( N - K ) * Y ;
}
else {
  result = N * X ;
}
return result ;
}
