import static void gcd ( ) {
  import fractions ;
  import functools ;
  _ = input ( ) ;
  A = list ( map ( Integer . parseInt , input ( ) ) ) ;
  System . out . println ( functools . reduce ( fractions . gcd ( A ) ) ) ;
}
