def main ( ) :
    import sys
    import os
    import time
    time.sleep ( 1 )
    a = time.time ( )
    count = 0
    for i in range ( 0 , a ) :
        b = time.time ( )
        c = time.time ( )
        count += c - b + 1
    print ( count )
