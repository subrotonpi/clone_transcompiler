def main ( * args ) :
    import sys
    from string import ascii_letters
    sc = sys.stdin
    a = sc.read ( ).split ( ' ' )
    b = sc.read ( ).split ( ' ' )
    a = [ a [ i ] for i in a ]
    b = [ b [ i ] for i in b ]
    c = [ c [ i ] for i in b ]
    aa = str ( a )
    bb = str ( b )
    if aa == bb :
        print ( "No" )
        return
    x = ( aa , bb )
    x.sort ( )
    if x [ 0 ] == aa :
        print ( "Yes" )
    else :
        print ( "No" )
