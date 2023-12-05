if __name__ == "__main__" ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int mod = 10 * 9 + 7 ;
  BigInteger r_c_1 = BigInteger . valueOf ( A * BigInteger . valueOf ( B ) . pow ( mod - 2 ) . mod ( mod ) . add ( A * BigInteger . valueOf ( C ) . pow ( mod - 2 ) . subtract ( BigInteger . ONE ) ) . mod ( mod - 2 ) . mod ( mod ) ) ;
  BigInteger c_1 = BigInteger . valueOf ( A * BigInteger . valueOf ( B ) . pow ( mod - 2 ) . mod ( mod ) . multiply ( r_c_1 ) . mod ( mod ) ) ;
  BigInteger r_1 = BigInteger . valueOf ( A * BigInteger . valueOf ( C ) . pow ( mod - 2 ) . mod ( ) . multiply ( r_c_1 ) . mod ( mod ) ) ;
  System . out . println ( r_1 . subtract ( BigInteger . ONE ) . subtract ( BigInteger . ONE ) . subtract ( BigInteger . ONE ) . mod ( BigInteger . ONE ) ) ;
}
