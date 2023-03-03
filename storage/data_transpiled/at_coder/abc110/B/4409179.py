def import import sys , os , sys , string , ** kwargs ) :
    from io import StringIO
    import sys
    try :
        sc = sys.stdin
    except :
        print ( 'out' )
        return
    n , m , X , Y = [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
    x , y = [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
    x.sort ( )
    y.sort ( )
    if max ( X ) < min ( Y ) :
        print ( 'No War' )
    else :
        print ( 'War' )
