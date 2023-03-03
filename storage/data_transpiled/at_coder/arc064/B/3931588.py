def main ( ) :
    import sys
    import os
    sys.path.append ( os.path.join ( os.path.dirname ( __file__ ) , '..' , 'main.py' ) )
    sys.path.append ( os.path.join ( os.path.dirname ( __file__ ) , 'main.py' ) )
    s = sys.path [ 1 : ]
    if s [ 0 ] != s [ - 1 ] :
        if len ( s ) % 2 != 0 :
            print ( 'First' )
        else :
            print ( 'Second' )
    else :
        if len ( s ) % 2 == 0 :
            print ( 'First' )
        else :
            print ( 'Second' )
