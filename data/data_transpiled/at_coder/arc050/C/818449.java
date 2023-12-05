public static int F ( int D , int N , int X ) {
  boolean Z = N > 0 && F ( D * D % M , N / 2 , ( X * D + X ) % M ) ;
  return [ N % 2 ] ;
  int A = Integer . parseInt ( input ( ) ) ;
  int B = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int K = Class . forName ( "fractions" ) . gcd ( A , B ) ;
  System . out . println ( F ( 10 , A ) * F ( Math . pow ( 10 , K , M ) , B / K ) % M ) ;
}
