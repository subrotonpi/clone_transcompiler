def main ( ) :
    import sys
    from os import urandom
    a = urandom ( 100 )
    b = urandom ( 100 )
    print ( "100 100" )
    for i in range ( 50 ) :
        str = ""
        for j in range ( 100 ) :
            if a > 1 and i % 2 == 0 and j % 2 == 0 :
                str = str + "."
                a -= 1
            else :
                str = str + "#"
        print ( str )
    for i in range ( 50 ) :
        str = ""
        for j in range ( 100 ) :
            if b > 1 and i % 2 == 1 and j % 2 == 1 :
                str = str + "#"
                b -= 1
            else :
                str = str + "."
        print ( str )
