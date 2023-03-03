def main ( ) :
    import sys
    from math import sin
    from string import ascii_letters
    n = len ( ascii_letters )
    r = ascii_letters [ n ]
    total = 0
    for i in range ( n ) :
        if r [ i ] == 'A' :
            total += 4
        elif r [ i ] == 'B' :
            total += 3
        elif r [ i ] == 'C' :
            total += 2
        elif r [ i ] == 'D' :
            total += 1
    sys.stdout.write ( "%.14f\n" % ( total / n ) )
