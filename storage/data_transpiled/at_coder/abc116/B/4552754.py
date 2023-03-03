def main ( ) :
    import sys
    from os import urandom
    s = urandom ( 1000000 )
    a = [ ]
    Answer = 0
    a.append ( s )
    loop :
    for i in range ( 1 , len ( a ) ) :
        if a [ i - 1 ] % 2 == 0 :
            a [ i ] = a [ i - 1 ] / 2
        elif a [ i - 1 ] % 2 != 0 :
            a [ i ] = a [ i - 1 ] * 3 + 1
        for j in range ( i ) :
            if a [ i ] == a [ j ] :
                Answer = i
                break loop
    print ( Answer + 1 )
    os.remove ( s )
