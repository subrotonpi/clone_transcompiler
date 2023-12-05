def main ( ) :
    import sys
    from random import randint
    from sys import stdin
    N = randint ( 1 , 10000 )
    A = [ ]
    part = 1
    I = True
    J = False
    for i in range ( N ) :
        A.append ( stdin.read ( ) )
        if i > 0 :
            if J :
                if A [ i - 1 ] < A [ i ] and not I :
                    part += 1
                    J = False
                elif A [ i - 1 ] > A [ i ] and I :
                    part += 1
                    J = False
            else :
                if A [ i - 1 ] < A [ i ] :
                    J = True
                    I = True
                elif A [ i - 1 ] > A [ i ] :
                    J = True
                    I = False
    print ( part )
