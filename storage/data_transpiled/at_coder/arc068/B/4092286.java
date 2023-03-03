public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > an = Collections . singletonList ( Integer . parseInt ( input ( ) ) ) ;
  int k = an . size ( ) ;
  int res = k % 2 == 0 ? k - 1 : k ;
  System . out . println ( res ) ;
}
