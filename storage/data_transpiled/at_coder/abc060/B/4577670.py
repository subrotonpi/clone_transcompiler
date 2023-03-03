def main ( ) :
    import sys
    from os.path import join
    from os import urandom
    from random import randint
    from sys import stdin
    with stdin :
        line = stdin.readline ( ).split ( )
        A = int ( line [ 0 ] )
        B = int ( line [ 1 ] )
        C = int ( line [ 2 ] )
        array = [ 0 ] * ( B + 1 )
        solved = False
        l = 1
        while not solved :
            new_A = A * l
            amari = new_A % B
            if amari == C :
                solved = True
                break
            if array [ amari ] == 1 :
                break
            array [ amari ] = 1
            l += 1
        if solved :
            print ( "YES" )
        else :
            print ( "NO" )
