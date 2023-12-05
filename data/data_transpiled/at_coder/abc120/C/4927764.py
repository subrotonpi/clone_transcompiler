def main ( ) :
    import sys
    from os import urandom
    s = urandom ( 16 )
    zero = one = 0
    for c in s :
        if c == '0' :
            zero += 1
        else :
            one += 1
    return zero + one - abs ( zero - one )
