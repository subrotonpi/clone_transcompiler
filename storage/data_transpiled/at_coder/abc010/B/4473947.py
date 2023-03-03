def main ( ) :
    import sys
    from os import urandom
    scn = urandom ( 2 )
    flower = scn.encode ( 'utf-8' )
    count = 0
    for i in range ( flower ) :
        a = scn.read ( 1 )
        if a % 2 == 0 :
            if a == 6 :
                count += 3
            else :
                count += 1
        elif a == 5 :
            count += 2
    print ( count )
