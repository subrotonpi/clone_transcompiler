def main ( ) :
    import sys
    from os import urandom
    from random import randint
    from time import sleep
    from sys import stdin
    a_list = [ ]
    s = stdin.read ( )
    a_list.append ( s )
    i = 2
    out :
        while True :
            if a_list [ i - 1 ] % 2 == 0 :
                a_list [ i ] = a_list [ i - 1 ] / 2
            else :
                a_list [ i ] = 3 * a_list [ i - 1 ] + 1
            for k in range ( 1 , i ) :
                if a_list [ i ] == a_list [ k ] :
                    print ( i )
                    break
            i += 1
        stdin.close ( )
