public static int h1 ( ) {
  int w1 = Integer . parseInt ( input . nextLine ( ) ) ;
  int h2 = Integer . parseInt ( input . nextLine ( ) ) ;
  int w2 = Integer . parseInt ( input . nextLine ( ) ) ;
  return w1 == h2 || w2 == w1 ? "YES" : w1 == w2 ? "YES" : "NO" ;
}
