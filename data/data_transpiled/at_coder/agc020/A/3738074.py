def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    N = int ( sys.argv [ 1 ] )
    Alice = int ( sys.argv [ 2 ] )
    Borys = int ( sys.argv [ 3 ] )
    dif = Borys - Alice
    if dif % 2 == 0 :
        print ( "Alice" )
    else :
        print ( "Borys" )
