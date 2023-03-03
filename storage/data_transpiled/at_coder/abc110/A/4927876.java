public static int [ ] ints ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] num = new int [ 2 ] ;
  num [ 0 ] = a ;
  num [ 1 ] = b ;
  num [ 2 ] = c ;
  int ookii = num . length ;
  int ooi = Math . max ( ookii ) ;
  num [ 0 ] = ookii ;
  num [ 1 ] = a ;
  return num ;
}
