def main ( srgs ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import sep
    from os import chdir
    a , b = map ( int , srgs )
    str = [ join ( sep , x ) for x in srgs ]
    boolh = [ False for x in srgs if x [ 0 ] == sep ]
    boolw = [ False for x in srgs if x [ 0 ] == sep ]
    for i in range ( a ) :
        count = 0
        for j in range ( b ) :
            if i [ j ] == '#' :
                boolh [ i ] = True
                boolw [ j ] = True
    for i in range ( a ) :
        count = 0
        for j in range ( b ) :
            if boolh [ i ] and boolw [ j ] :
                count = 1
                print ( str [ i ] , end = '' )
        print ( '\n' if count == 1 else '' , end = '' )
