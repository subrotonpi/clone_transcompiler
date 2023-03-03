def main ( ) :
    import sys
    import os
    import string
    import subprocess
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sys.stdin.close ( )
            sys.stdout.flush ( )
            sys.stdin.close ( )
    word = sys.stdin.read ( )
    state = [ False ] * 26
    for char in word :
        if state [ char ] :
            print ( 'no' )
            return
        state [ char ] = True
    print ( 'yes' )
