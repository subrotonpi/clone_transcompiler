def main ( ) :
    import math
    from string import ascii_letters
    from math import pow
    from string import digits
    input = raw_input ( "Enter a number: " )
    S = input.strip ( )
    K = input.strip ( )
    ans = ""
    days = 5.0 * pow ( 10 , 15 )
    for c in S :
        n = ord ( c )
        K -= long ( pow ( n , days ) )
        if K <= 0 :
            print ( c )
            return
