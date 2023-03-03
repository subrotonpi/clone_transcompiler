def main ( ) :
    import sys
    from math import pow
    from os.path import expanduser
    with open ( expanduser ( '~/.sympy' ) ) as sc :
        line = sc.readline ( ).split ( )
        A = int ( line [ 0 ] )
        B = int ( line [ 1 ] )
        if A > 4 :
            if ( A - 1 ) % 4 == 3 :
                fA = 0
            elif ( A - 1 ) % 4 == 0 :
                fA = A - 1
            elif ( A - 1 ) % 4 == 1 :
                fA = 1
            else :
                fA = ( A - 1 ) ^ 1
        else :
            if ( A - 1 ) == 0 :
                fA = 0
            elif ( A - 1 ) == 1 :
                fA = 1
            elif ( A - 1 ) == 2 :
                fA = 3
            else :
                fA = 0
        if B >= 4 :
            if B % 4 == 3 :
                fB = 0
            elif B % 4 == 0 :
                fB = B
            elif B % 4 == 1 :
                fB = 1
            else :
                fB = B ^ 1
        else :
            if B == 0 :
                fB = 0
            elif B == 1 :
                fB = 1
            elif B == 2 :
                fB = 3
            else :
                fB = 0
        print ( fA ^ fB )
