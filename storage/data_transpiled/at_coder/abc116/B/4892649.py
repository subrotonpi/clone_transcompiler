def main ( ) :
    import os
    import sys
    from io import BufferedReader
    bf = BufferedReader ( open ( "/proc/stb" , "r" ) )
    s , m = sum ( bf.read ( ) ) , 1
    number = set ( )
    while 1 :
        if not number.add ( s ) :
            break
        if s % 2 :
            s = 3 * s + 1
        else :
            s /= 2
        m += 1
    print ( m )
