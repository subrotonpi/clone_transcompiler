def main ( srgs ) :
    import string
    import sys
    from os.path import join
    from os import sep
    from os import chdir
    from os import sep
    from os import chdir
    a = join ( srgs , 'A' )
    b = join ( srgs , 'B' )
    c = [ ]
    d = [ ]
    e = [ ]
    for i in range ( 0 , len ( a ) ) :
        c.append ( a [ i ] )
    for i in range ( 0 , len ( b ) ) :
        d.append ( b [ i ] )
    c.sort ( )
    d.sort ( )
    for i in range ( 0 , len ( b ) ) :
        e.append ( d [ - i - 1 ] )
    A = ''
    B = ''
    for i in range ( 0 , len ( a ) ) :
        A = A + c [ i ]
    for i in range ( 0 , len ( b ) ) :
        B = B + e [ i ]
    print ( 'Yes' if A <= B else 'No' )
