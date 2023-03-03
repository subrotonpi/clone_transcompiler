public static int Y = Integer . parseInt ( input ) {
  int M = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  /* 365 * y + y / 4 - y / 100 + y / 400 + (306 * (m+1))/10+d -429 */
  return M ;
}
