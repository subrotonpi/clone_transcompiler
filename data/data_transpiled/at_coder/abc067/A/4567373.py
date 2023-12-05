def main ( ) :
    import sys
    from os import path
    from os import path
    sc = open ( path.join ( path.dirname ( __file__ ) , '..' , '..' , '__init__.py' ) , 'w' )
    N = int ( sc.read ( ) )
    M = int ( sc.read ( ) )
    if N % 3 == 0 or M % 3 == 0 or ( N + M ) % 3 == 0 :
        print ( 'Possible' , file = sys.stderr )
    else :
        print ( 'Impossible' , file = sys.stderr )
    sys.exit ( 1 )
