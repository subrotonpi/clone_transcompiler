def main ( ) :
    import sys
    from math import sin , cos , tan
    from os.path import join
    from os import path
    a = sin ( join ( sys.argv [ 1 : ] , '..' ) )
    b = sin ( join ( sys.argv [ 1 : ] , '..' ) )
    c = sin ( join ( sys.argv [ 1 : ] , '..' ) )
    d = sin ( join ( sys.argv [ 1 : ] , '..' ) )
    if abs ( a - b ) <= d and abs ( b - c ) <= d or abs ( c - a ) <= d :
        print ( 'Yes' )
        return
    print ( 'No' )
