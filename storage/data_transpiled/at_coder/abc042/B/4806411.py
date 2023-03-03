def main ( ) :
    import sys
    from os import urandom
    keyboard = open ( "/dev/urandom" )
    N = len ( keyboard.read ( ) )
    L = len ( keyboard.read ( ) )
    SI = [ keyboard.read ( ) for i in range ( N ) ]
    SI.sort ( )
    for i in SI :
        sys.stdout.write ( i )
    keyboard.close ( )
