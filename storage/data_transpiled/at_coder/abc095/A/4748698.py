def main ( ) :
    import sys
    from os import urandom
    with open ( "/dev/urandom" , "r" ) as sc :
        S = sc.read ( )
        c = 0
        for i in range ( 3 ) :
            if S [ i ] == "o" :
                c += 1
        print ( 700 + 100 * c )
