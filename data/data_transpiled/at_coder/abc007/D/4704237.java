public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  /* int digit = String.valueOf(digit).length();
  int num = Integer.parseInt(String.valueOf(digit));
  if (digit == 1) {
  if (num < 4) return num+1;
  else if (num < 9) return num;
  }*/
  return B - A + 1 - ( A - B ) ;
}
