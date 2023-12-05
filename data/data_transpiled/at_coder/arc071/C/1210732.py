def main ( ) :
    import sys
    from itertools import repeat
    sc = sys.stdin
    S = sc.read ( ).split ( ' ' )
    T = sc.read ( ).split ( ' ' )
    Si = [ 0 ]
    Ti = [ 0 ]
    for i in range ( len ( S ) ) :
        Si.append ( Si [ i ] + S [ i ] - 'A' + 1 )
    Ti.append ( 0 )
    for i in range ( len ( T ) ) :
        Ti.append ( Ti [ i ] + T [ i ] - 'A' + 1 )
    q = repeat ( 'q' , 2 )
    for a , b , c , d in repeat ( q , 2 ) :
        result = 0
        result = Si [ b ] - Ti [ d ] - Si [ a - 1 ] + Ti [ c - 1 ]
        if result % 3 == 0 :
            print ( 'YES' )
        else :
            print ( 'NO' )
