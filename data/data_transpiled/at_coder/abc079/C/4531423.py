def main ( ) :
    import string
    from sys import stdin
    sc = stdin
    c = sc.read ( ).decode ( 'utf-8' )
    for i in range ( ( 1 , 3 ) ) :
        str = c [ 0 ]
        cal = ord ( c [ 0 ] )
        for j in range ( 3 ) :
            if 1 & i >> j == 1 :
                str += "+"
                cal += ord ( c [ j + 1 ] )
            else :
                str += "-"
                cal -= ord ( c [ j + 1 ] )
            str += c [ j + 1 ]
        if cal == 7 :
            print ( str + "=7" )
            break
    sc.close ( )
