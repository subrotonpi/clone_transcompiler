def main ( ) :
    import sys
    import time
    for x in range ( 0 , len ( sys.argv ) ) :
        y = time.time ( )
        z = time.time ( )
        x -= z
        print ( x / ( y + z ) )
