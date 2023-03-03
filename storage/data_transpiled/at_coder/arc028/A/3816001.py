def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import path
    N = int ( sys.argv [ 1 ] )
    A = int ( sys.argv [ 2 ] )
    B = int ( sys.argv [ 3 ] )
    if N % ( A + B ) != 0 and N - ( N / ( A + B ) ) * ( A + B ) <= A :
        print ( "Ant" )
    elif N % ( A + B ) != 0 and N - ( N / ( A + B ) ) * ( A + B ) > A :
        print ( "Bug" )
    elif N % ( A + B ) == 0 :
        print ( "Bug" )
