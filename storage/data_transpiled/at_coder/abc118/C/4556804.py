def main ( ) :
    import sys
    from os.path import join
    from os import urandom
    reader = open ( join ( sys.argv [ 1 : ] , 'r' ) )
    N = len ( reader.read ( ) )
    arr = [ ]
    for i in range ( N ) :
        arr.append ( reader.read ( ) )
    reader.close ( )
    tmp = arr [ 0 ]
    for i in range ( 1 , N ) :
        tmp = gcd ( tmp , arr [ i ] )
    sys.stdout.write ( tmp )
def gcd ( x , y ) :
    if y > x :
        tmp = y
        y = x
        x = tmp
    while ( x % y ) :
        x , y = y , x
    return y
