def main ( ) :
    import sys
    scn = sys.stdin
    str = scn.read ( ).decode ( 'utf-8' )
    a , b , c = False , False , False
    for i in range ( 3 ) :
        if str [ i ] == 'a' : a = True
        if str [ i ] == 'b' : b = True
        if str [ i ] == 'c' : c = True
    print ( 'Yes' if a and b and c else 'No' )
