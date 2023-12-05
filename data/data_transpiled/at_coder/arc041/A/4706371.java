public static int ox ( ) {
  int uy = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( uy >= K ) ox += K ;
  else ox = ox - ( K - uy ) + uy ;
  return ox ;
}
